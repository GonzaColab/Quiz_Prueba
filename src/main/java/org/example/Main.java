package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pregunta[] preguntas = {
                new Pregunta(
                        "¿Cuál es la capital de Francia?",
                        new String[]{"Berlín", "Madrid", "París", "Roma"},
                        3
                ),
                new Pregunta(
                        "¿Cuánto es 2 + 2?",
                        new String[]{"3", "4", "5", "6"},
                        2
                ),
                new Pregunta(
                        "¿Cuál es el color del cielo en un día despejado?",
                        new String[]{"Verde", "Azul", "Rojo", "Amarillo"},
                        2
                )
        };
    }
}