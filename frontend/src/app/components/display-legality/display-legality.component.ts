import { Component, Input } from '@angular/core';

@Component({
  selector: 'display-legality',
  templateUrl: './display-legality.component.html',
  styleUrls: ['./display-legality.component.scss']
})
export class DisplayLegalityComponent {
  @Input() legality: boolean = false;
}
