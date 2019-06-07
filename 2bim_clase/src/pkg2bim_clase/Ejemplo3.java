/*
 *Programa que muestra el número de vocales utilizadas en una frase 
 */
package pkg2bim_clase;

import java.util.Scanner;

/**
 *
 * @author dljimenez
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variables
        String frase;
        String reporteFinal = "";
        String vocal[] = {"a", "e", "i", "o", "u"};
        int[] cantidadRep = new int[5];
        char[] car = new char[5];
        //Ingresa el usuario la frase
        System.out.println("Ingrese la frase: ");
        frase = entrada.nextLine();
        car[0] = vocal[0].charAt(0);
        car[1] = vocal[1].charAt(0);
        car[2] = vocal[2].charAt(0);
        car[3] = vocal[3].charAt(0);
        car[4] = vocal[4].charAt(0);
        //ciclo for
        for (int i = 0; i < frase.length(); i++) {
            char aux = frase.charAt(i);
            if (aux == car[0]) {
                cantidadRep[0]++;
            } else {
                if (aux == car[1]) {
                    cantidadRep[1]++;
                } else {
                    if (aux == car[2]) {
                        cantidadRep[2]++;
                    } else {
                        if (aux == car[3]) {
                            cantidadRep[3]++;
                        } else {
                            if (aux == car[4]) {
                                cantidadRep[4]++;
                            }
                        }
                    }
                }
            }
        }
        //Muesta los datos del reporte
        reporteFinal = String.format("%sREPORTE FINAL\nVocal a - número de "
                + "veces usada: %d\nVocal e - número de veces usada: %d\nVocal "
                + "i - número de veces usada: %d\nVocal o - número de veces "
                + "usada: %d\nVocal u - número de veces usada: %d",
                reporteFinal, cantidadRep[0], cantidadRep[1], cantidadRep[2],
                cantidadRep[3], cantidadRep[4]);
        System.out.printf("%s\n", reporteFinal);
    }
}
