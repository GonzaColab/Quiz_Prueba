package org.example;

import java.util.Scanner;

public class Quiz {

    private Pregunta[] preguntas;

    public Quiz(Pregunta[] preguntas) {
        this.preguntas = preguntas;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int puntacion = 0;

        for (Pregunta p; preguntas);{
            System.out.println(p.getPregunta());
            String[] opciones = p.getOpciones();
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(((i + 1) + ". " + opciones[i]));
            }
            System.out.print( "Selecciona una opción (1-" + opciones.length + "): ");
            int respuestaUsuario = scanner.nextInt();

            if(respuestaUsuario == p.getRespuestaCorrecta()){
                System.out.println("¡Correcto!");
                puntacion++;
            } else {
                System.out.println("¡Incorrecto!");
            }
            System.out.println();
    }

        System.out.println("Has obtenido " + puntacion + "de " + preguntas.length + " respuestas correctas. ");
        scanner.close();



    }
}
