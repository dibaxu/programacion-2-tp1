/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        
        int resultadoInt = dividendo / divisor;
        double resultadoDouble = (double) dividendo / divisor;
        System.out.println("División con enteros (int): " + dividendo + " / " + divisor + " = " + resultadoInt);
        System.out.println("División con decimales (double): " + dividendo + " / " + divisor + " = " + resultadoDouble);
        
        scanner.close();
    }
    
}
