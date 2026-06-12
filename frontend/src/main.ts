/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { importProvidersFrom } from '@angular/core';
import {
  provideHttpClient,
  withXhr,
  withInterceptorsFromDi,
} from '@angular/common/http';
import { BrowserModule, bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { appConfig } from './app/app.config';

bootstrapApplication(AppComponent, {
  providers: [
    importProvidersFrom(BrowserModule),
    ...appConfig.providers,
    provideHttpClient(withXhr(), withInterceptorsFromDi()),
  ],
}).catch((err) => console.error(err));
