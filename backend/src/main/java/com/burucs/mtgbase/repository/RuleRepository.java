package com.burucs.mtgbase.repository;

import com.burucs.mtgbase.model.Legality;
import com.burucs.mtgbase.model.Rule;
import org.springframework.data.repository.CrudRepository;

public interface RuleRepository extends CrudRepository<Rule, Long> {
}