// Este código sirve para que ingreses 2 datos, un dato del jugador 1, y otro dato del jugador 2, estos datos hacen referencia
// al juego "piedra, papel o tijeras", una vez escrito un dato entre estos 3 (piedra, papel o tijeras) en base a la elección se declarará a un ganador



package com.generation;

import java.util.Scanner; // se importó la clase scanner ya que sin esa no puede funcionar el código

public class Codigo4 {
    public static void main(String[] args) { // Se agrega el método main, este es de suma importancia
        Scanner s = new Scanner(System.in); // instancia del scanner

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine(); // Aquí se usó "s" para referirse al jugador 2

        // Se compara usando "equals"
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2; // aquí se ha dado el caso de que gane el jugador 2
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break; // se agrega un break
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break; // se agrega otro break
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break; // y por último otro break aquí para ya terminar y deje de leer
                default:
                    System.out.println("Entrada no válida"); // Se mostrará el mensaje "Entrada no válida" por si hay algún error o por default
            }
            System.out.println("Gana el jugador " + g);
        }
        
        s.close(); // se cierrra el scanner
    }
}
