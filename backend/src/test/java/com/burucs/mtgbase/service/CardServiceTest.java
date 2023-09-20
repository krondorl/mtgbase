package com.burucs.mtgbase.service;

import com.burucs.mtgbase.dto.CardDto;
import com.burucs.mtgbase.model.Card;
import com.burucs.mtgbase.repository.CardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class CardServiceTest {

    @InjectMocks
    CardService cardService;

    @Mock
    CardRepository cardRepository;

    @Test
    public void getCard() throws Exception {
        Long cardId = 1L;
        String cardName = "Kozilek, Butcher of Truth";

        Card card = new Card();
        card.setId(cardId);
        card.setName(cardName);
        when(this.cardRepository.findById(cardId)).thenReturn(Optional.of(card));
        CardDto cardDto = this.cardService.getCard(cardId);

        assertEquals(card.getId(), cardDto.getId());
        assertEquals(card.getName(), cardDto.getName());
    }

    @Test
    public void getCards() throws Exception {
        Long cardId = 2L;
        String cardName = "Imperial Seal";

        Card card = new Card();
        card.setId(cardId);
        card.setName(cardName);

        ArrayList<Card> cardList = new ArrayList<>();
        cardList.add(card);

        when(this.cardRepository.findAll()).thenReturn(cardList);
        List<CardDto> cards = this.cardService.getCards();

        assertEquals(cards.size(), 1);
    }

}
