package com.udea.lab2arqsoft;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DataController {

    @GetMapping("/")
    public String healthCheck() {
        return "APPLICATION WORKING: OK!";
    }

    @GetMapping("/version")
    public String version() {
        return "ACTUAL VERSION: 1.0.0";
    }

    @GetMapping("/nations")
    public JsonNode getRandomnNations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US")).nation();
        var nations = objectMapper.createArrayNode();

        for (int i = 0; i < 10; i++) {
            var nation = objectMapper.createObjectNode();
            nation
                    .put("nacionality", faker.nationality())
                    .put("capitalCity", faker.capitalCity())
                    .put("flag", faker.flag())
                    .put("language", faker.language());

            nations.add(nation);
        }
        return nations;
    }

    @GetMapping("/currencies")
    public JsonNode getRandomnCurrencies() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US")).currency();
        var currencies = objectMapper.createArrayNode();

        for (int i = 0; i < 20; i++) {
            var currency = objectMapper.createObjectNode();
            currency
                    .put("name", faker.name())
                    .put("code", faker.code());

            currencies.add(currency);
        }
        return currencies;
    }

    @GetMapping("/airlines")
    public JsonNode getRandomnAirlines() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US")).aviation();
        var airlines = objectMapper.createArrayNode();

        for (int i = 0; i < 20; i++) {
            var airline = objectMapper.createObjectNode();
            airline
                    .put("aircraft", faker.aircraft())
                    .put("airport", faker.airport())
                    .put("METAR", faker.METAR());

            airlines.add(airline);
        }
        return airlines;
    }

}