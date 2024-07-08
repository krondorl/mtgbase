/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { ComponentFixture, TestBed } from '@angular/core/testing';
import { DisplayLegalityComponent } from './display-legality.component';

describe('DisplayLegalityComponent', () => {
  let component: DisplayLegalityComponent;
  let fixture: ComponentFixture<DisplayLegalityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DisplayLegalityComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(DisplayLegalityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
