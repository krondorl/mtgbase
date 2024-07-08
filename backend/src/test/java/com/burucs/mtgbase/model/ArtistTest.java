/*!
 * Mtgbase
 *
 * Copyright (c) 2023 Adam Burucs
 *
 * MIT Licensed
 */

package com.burucs.mtgbase.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp() throws Exception {
        this.artist = new Artist();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 1L;

        this.artist.setId(idValue);

        assertEquals(idValue, this.artist.getId());
    }

    @Test
    public void getArtistName() throws Exception {
        Long idValue = 1L;
        String artistNameValue = "Michael Komarck";

        this.artist.setId(idValue);
        this.artist.setArtistName(artistNameValue);

        assertEquals(idValue, this.artist.getId());
        assertEquals(artistNameValue, this.artist.getArtistName());
    }
}
