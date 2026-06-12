import {
  Component,
  ViewEncapsulation,
  ChangeDetectionStrategy,
  OnInit,
} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Observable, Subscription } from 'rxjs';
import { Card } from '../../models/card.model';
import { Legality } from '../../models/legality.model';
import { CardService } from '../../services/card.service';
import { DisplayLegalityComponent } from '../../components/display-legality/display-legality.component';
import { AsyncPipe } from '@angular/common';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
  imports: [DisplayLegalityComponent, AsyncPipe],
  encapsulation: ViewEncapsulation.None,
  changeDetection: ChangeDetectionStrategy.Eager,
})
export class CardComponent implements OnInit {
  id!: number;
  card!: Observable<Card>;
  parametersObservable!: Subscription;

  constructor(
    private readonly route: ActivatedRoute,
    private readonly cardService: CardService,
  ) {}

  getLegality(legalities: Legality[] | undefined, formatName: string): boolean {
    if (legalities && legalities?.length > 0 && formatName) {
      const isLegal = legalities
        .filter(
          (legalityItem: Legality) => legalityItem.formatName === formatName,
        )
        .map((legalityItem: Legality) => legalityItem.isLegal);
      if (isLegal?.length == 1) {
        return isLegal[0];
      }
    }
    // Note: this is the default value, not the actual data.
    return false;
  }

  convertSymbol(symbol: string): string {
    let outputStr = '';
    switch (symbol) {
      case 'W':
        outputStr += `<img class="mana-img" src="/assets/mana-symbols/mana-white.svg">`;
        break;
      case 'U':
        outputStr += `<img class="mana-img" src="/assets/mana-symbols/mana-blue.svg">`;
        break;
      case 'B':
        outputStr += `<img class="mana-img" src="/assets/mana-symbols/mana-black.svg">`;
        break;
      case 'R':
        outputStr += `<img class="mana-img" src="/assets/mana-symbols/mana-red.svg">`;
        break;
      case 'G':
        outputStr += `<img class="mana-img" src="/assets/mana-symbols/mana-green.svg">`;
        break;
      default:
        break;
    }
    return outputStr;
  }

  convertToManaSymbols(rawManaCost: string): string {
    const parts = /(\d{0,2})([WUBRG]{0,5})/.exec(rawManaCost);
    let symbolString = '';

    if (!parts) {
      return '';
    }

    if (parts[1] && Number.parseInt(parts[1]) >= 0) {
      symbolString = `<span class="mana-colorless">${parts[1]}</span>`;
    }

    if (parts[2]) {
      for (const char of parts[2]) {
        symbolString += this.convertSymbol(char);
      }
    }

    return symbolString;
  }

  ngOnInit(): void {
    this.parametersObservable = this.route.params.subscribe({
      next: (result: any) => {
        this.id = result.id;
        this.card = this.cardService.getCard(this.id);
        this.card.subscribe({
          next: (card: Card) => {},
          error: (err: any) => {
            console.log(err);
          },
          complete: () => {
            console.log('complete');
          },
        });
      },
      error: (err: any) => {
        console.log(err);
      },
      complete: () => {
        console.log('complete');
      },
    });
  }
}
