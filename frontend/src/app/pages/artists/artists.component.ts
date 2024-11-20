/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Artist } from 'src/app/models/artist.model';
import { ArtistService } from 'src/app/services/artist.service';

@Component({
    selector: 'app-artists',
    templateUrl: './artists.component.html',
    styleUrls: ['./artists.component.scss'],
    standalone: false
})
export class ArtistsComponent {
  artists!: Observable<Artist[]>;

  constructor(private artistService: ArtistService) {}

  ngOnInit(): void {
    this.artists = this.artistService.getArtists();
  }

  encode(text: string): string {
    return encodeURIComponent(text);
  }
}
