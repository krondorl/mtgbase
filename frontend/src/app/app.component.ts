/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { Component, ChangeDetectionStrategy } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  imports: [HeaderComponent, FooterComponent, RouterOutlet],
  changeDetection: ChangeDetectionStrategy.Eager,
})
export class AppComponent {
  title = 'mtgbase-frontend';
}
