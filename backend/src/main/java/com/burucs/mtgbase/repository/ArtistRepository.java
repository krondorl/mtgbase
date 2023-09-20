package com.burucs.mtgbase.repository;

import com.burucs.mtgbase.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
