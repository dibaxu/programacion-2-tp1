/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número:");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el segundo número:");
        int num2 = Integer.parseInt(sc.nextLine());
        
        int suma = num1+num2;
        int resta = num1-num2;
        int mult = num1 * num2;
        double div = num1 / num2;
        
        System.out.print("Suma: " + suma + "\nResta: "+ resta +"\nMultiplicacion: "+mult+"\nDivision: "+div);
        
        sc.close();
    }
    
}
