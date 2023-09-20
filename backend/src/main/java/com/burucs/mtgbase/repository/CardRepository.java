package com.burucs.mtgbase.repository;

import com.burucs.mtgbase.model.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CardRepository extends CrudRepository<Card, Long> {
    @Query(value = "SELECT * FROM cards WHERE cards.artist = :artistName", nativeQuery = true)
    List<Card> findByArtistName(@Param("artistName") String artistName);
}
