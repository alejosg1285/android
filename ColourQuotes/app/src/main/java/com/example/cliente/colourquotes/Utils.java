package com.example.cliente.colourquotes;

import java.util.Random;

/**
 * Created by CLIENTE on 21/02/2017.
 */

public class Utils {
    public static int generarNumero(int numMax) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        return random.nextInt(numMax);
    }
}
