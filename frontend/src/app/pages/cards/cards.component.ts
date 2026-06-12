/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { Observable, Subscription } from 'rxjs';
import { Card } from '../../models/card.model';
import { CardService } from '../../services/card.service';
import { AsyncPipe } from '@angular/common';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss'],
  imports: [RouterLink, AsyncPipe],
  changeDetection: ChangeDetectionStrategy.Eager,
})
export class CardsComponent implements OnInit {
  artistName!: string;
  cards!: Observable<Card[]>;
  parametersObservable!: Subscription;

  constructor(
    private readonly route: ActivatedRoute,
    private readonly cardService: CardService,
  ) {}

  ngOnInit(): void {
    this.parametersObservable = this.route.params.subscribe({
      next: (result: any) => {
        this.artistName = result.name;
        if (this.artistName && this.artistName.length > 0) {
          this.cards = this.cardService.getCardsByArtistName(this.artistName);
        } else {
          this.cards = this.cardService.getCards();
        }
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
