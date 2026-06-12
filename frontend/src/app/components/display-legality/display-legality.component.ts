/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { Component, Input, ChangeDetectionStrategy } from '@angular/core';

@Component({
    selector: 'display-legality',
    templateUrl: './display-legality.component.html',
    styleUrls: ['./display-legality.component.scss'],
    changeDetection: ChangeDetectionStrategy.Eager
})
export class DisplayLegalityComponent {
  @Input() legality: boolean = false;
}
