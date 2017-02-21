package com.example.cliente.colourquotes;

import android.graphics.Color;

/**
 * Created by CLIENTE on 21/02/2017.
 */

public class GeneradorCita {
    private Citas[] citas;
    private int[] coloursArray = {Color.CYAN, Color.RED, Color.BLACK, Color.GRAY, Color.YELLOW, Color.GREEN, Color.MAGENTA};

    public GeneradorCita() {
        citas = new Citas[5];

        citas[0] = new Citas();
        citas[0].setAutor("Walt Disney");
        citas[0].setCita("Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir");

        citas[1] = new Citas();
        citas[1].setAutor("Albert Einstein");
        citas[1].setCita("La imaginación es más importante que el conocimiento");

        citas[2] = new Citas();
        citas[2].setAutor("Steve Jobs");
        citas[2].setCita("Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona");

        citas[3] = new Citas();
        citas[3].setAutor("Albert Camus");
        citas[3].setCita("El éxito es fácil de obtener. Lo difícil es merecerlo.");

        citas[4] = new Citas();
        citas[4].setAutor("Irving Berlin");
        citas[4].setCita("El sabio no dice lo que sabe, y el necio no sabe lo que dice.");
    }

    public Citas obtenerCitasAleatorio() {
        int numCita = Utils.generarNumero(citas.length);
        int color = coloursArray[numCita];

        Citas cita = citas[numCita];
        cita.setColor(color);

        return cita;
    }
}
