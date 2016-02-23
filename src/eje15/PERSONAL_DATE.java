package eje15;

import java.util.Scanner;

public class PERSONAL_DATE {

    private Scanner teclado;
    private String Nombre, Apellidos, Direccion;
    private int Edad, NumCed, FechNac,  Tele;

    public void Loading_Data(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        Nombre = teclado.next();
        System.out.print("Ingrese los apellidos: ");
        Apellidos = teclado.next();
        System.out.print("Ingrese edad: ");
        Edad = teclado.nextInt();
        System.out.print("Ingrese el numero de cedula: ");
        NumCed = teclado.nextInt();
        System.out.print("Ingrese la fecha de nacimiento en numeros dd mm aaaa: ");
        FechNac = teclado.nextInt();
        System.out.print("Ingrese la direccion: ");
        Direccion = teclado.next();
        System.out.print("Ingrese el telefono: ");
        Tele = teclado.nextInt();

    }

    public void Data_Show() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellidos: " + Apellidos);
        System.out.println("Edad: " + Edad);
        System.out.println("Numero de cedula: " + NumCed);
        System.out.println("Fecha de Nacimiento: " + FechNac);
        System.out.println("Direccion: " + Direccion);
        System.out.println("Telefono: " + Tele);

    }
    
   

}



