package com.burucs.mtgbase.repository;

import com.burucs.mtgbase.model.Card;
import com.burucs.mtgbase.model.Legality;
import org.springframework.data.repository.CrudRepository;

public interface LegalityRepository extends CrudRepository<Legality, Long> {
}