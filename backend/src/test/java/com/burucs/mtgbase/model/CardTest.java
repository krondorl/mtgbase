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

public class CardTest {
    Card card;

    @BeforeEach
    public void setUp() throws Exception {
        this.card = new Card();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        this.card.setId(idValue);

        assertEquals(idValue, this.card.getId());
    }

    @Test
    public void getName() throws Exception {
        Long idValue = 2L;
        String nameValue = "Imperial Seal";

        this.card.setId(idValue);
        this.card.setName(nameValue);

        assertEquals(idValue, this.card.getId());
        assertEquals(nameValue, this.card.getName());
    }
}
