/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.service;

import com.burucs.mtgbase.dto.ArtistDto;
import com.burucs.mtgbase.model.Artist;
import com.burucs.mtgbase.repository.ArtistRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class ArtistServiceTest {
    @InjectMocks
    ArtistService artistService;

    @Mock
    ArtistRepository artistRepository;

    @Test
    public void getArtists() {
        Long artistId1 = 1L;
        String artistName1 = "Michael Komarck";
        Long artistId2 = 2L;
        String artistName2 = "Milivoj Ćeran";

        Artist artist1 = new Artist();
        artist1.setId(artistId1);
        artist1.setArtistName(artistName1);

        Artist artist2 = new Artist();
        artist2.setId(artistId2);
        artist2.setArtistName(artistName2);

        ArrayList<Artist> artistList = new ArrayList<>();
        artistList.add(artist1);
        artistList.add(artist2);

        when(this.artistRepository.findAll()).thenReturn(artistList);
        List<ArtistDto> artists = this.artistService.getArtists();

        assertEquals(artists.size(), 2);
    }
}
