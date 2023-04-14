package org.iasvehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("********************************************************");
        System.out.println("ingrese el numero del tipo de vehiculo que desea comprar");

        do {
            System.out.printf("");
            System.out.println("\n ---------------------------------\n" + "************ MENU ****************" +
                    "\n ----------------------------------\n" +
                    "\n 1) Human Powered Vehicle" +
                    "\n 2) Motirized Land Vehicle" +
                    "\n 3) Arial Vehicle" +
                    "\n 12) exit\n");
            System.out.print("digita tu opcion: ");
            System.out.println("");

            opcion = entrada.nextInt();


            switch (opcion) {

                case 1:


                    break;
                case 2:


                    break;
                case 3:
            }

        } while (opcion != 12);



    }
}