package com.example.quotes.service;

import com.example.quotes.model.Quote;
import com.example.quotes.repository.QuotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class QuoteService {

    private final static int MAX_QUOTES = 25;

    private final Random random = new Random();
    private final QuotesRepository quotesRepository;

    public Quote getRandomQuote() {
        return quotesRepository.findById((long) random.nextInt(MAX_QUOTES) + 1).orElse(null);
    }
}
