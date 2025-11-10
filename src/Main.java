import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca su nombre por favor");
        String nombre = entrada.nextLine();
        System.out.println("Ahora introduzca su edad por favor");
        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre + ", su edad es: " + edad);


        System.out.println("\n-- Muestra cuantos números pares hay entre 1 y 100 --");
        int contador = 0;
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contador++;
                pares.add(i);
            }
        }
        System.out.println("Hay " + contador + " números pares entre 1 y 100.");
        System.out.println("Los números pares son:" + pares);

        //entrada.close();
    }
}