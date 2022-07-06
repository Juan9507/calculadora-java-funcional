package org.example;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Suma suma1 = (int value1, int value2 ) -> value1 + value2;
        Resta resta1 = (int value1, int value2) -> value1 - value2;


        logger.info("La suma es: " + suma1.suma(2,3));
        logger.info("La resta es: " + resta1.resta(3,7));
    }
}