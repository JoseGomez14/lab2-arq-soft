package com.udea.lab2arqsoft;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Lab2ArqSoftApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void health() {
        assertEquals("APPLICATION WORKING: OK!", dataController.healthCheck());
    }

    @Test
    void version() {
        assertEquals("ACTUAL VERSION: 1.0.1", dataController.version());
    }

    @Test
    void nationLength() {
        Integer nationsLength = dataController.getRandomnNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = dataController.getRandomnCurrencies().size();
        assertEquals(20, currenciesLength);
    }

    @Test
    void airlinesLength() {
        Integer airlinesLength = dataController.getRandomnAirlines().size();
        assertEquals(20, airlinesLength);
    }

}
