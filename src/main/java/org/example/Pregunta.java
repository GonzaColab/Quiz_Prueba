package org.example;

public class Pregunta {

    private String pregunta;
    private String[] opciones;
    private int respuestaCorrecta;

    public Pregunta(String pregunta, String[] opciones, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public static String getPregunta() {
      return pregunta;
    }

    public static String[] getOpciones() {
       return opciones;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
}


// Prieba Git