package com.example.quotes.repository;

import com.example.quotes.model.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuotesRepository extends CrudRepository<Quote, Long> {
}
