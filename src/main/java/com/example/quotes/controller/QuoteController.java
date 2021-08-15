package com.example.quotes.controller;

import com.example.quotes.model.Quote;
import com.example.quotes.service.QuoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/quote")
public class QuoteController {

    private final QuoteService quoteService;

    @GetMapping("/random")
    public Quote getRandom() { return quoteService.getRandomQuote(); }
}
