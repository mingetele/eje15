package eje15;

import java.util.Scanner;

public class Eje15 {

    public static void main(String[] args) {

        int opcion;
        Scanner lector = new Scanner(System.in);
        PERSONAL_DATE persona1 = new PERSONAL_DATE();

        do {
            System.out.println("Que desea hacer: ");
            System.out.println("1. Ingresar los datos de una persona? ");
            System.out.println("2. Ver los datos de una persona? ");
            System.out.println("3. Salir del programa? ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    persona1.Loading_Data();
                    break;
                case 2:
                    persona1.Data_Show();
                    break;

            }

        } while (opcion != 3);

    }

}
