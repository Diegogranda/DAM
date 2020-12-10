package ComputerSystems;

import javax.swing.*;
public class NumerosRandom{



        public static void main(String[] args) {
            int numero, aleatorio, contador = 0;

            aleatorio = (int) (Math.random() * 100);// generar un umero aleatorio entre 0-100
            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número"));
                if (aleatorio > numero) {
                    System.out.println("Escriba un número mayor");
                } else {
                    System.out.println("Escriba un número menor");

                }
                contador++;

            } while (numero != aleatorio);
            System.out.println("Número correcto en " + contador +  " intentos");

        }
    }

