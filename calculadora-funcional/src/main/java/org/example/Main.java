package org.example;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        Suma suma1 = (int value1, int value2 ) -> value1 + value2;
        Resta resta1 = (int value1, int value2) -> value1 - value2;
        Multiplicacion multiplicacion1 = (int value1, int value2) -> value1 * value2;
        Division division1 = (double value1, double value2)
                -> value1 == 0 || value2 == 0 ? 0 : value1 / value2;


        logger.info("La suma es: " + suma1.suma(2,3));
        logger.info("La resta es: " + resta1.resta(3,7));
        logger.info("La Multiplicacion es: " + multiplicacion1.multiplicacion(5,5));
        logger.info("La division es: " + division1.division(0,4));
    }
}