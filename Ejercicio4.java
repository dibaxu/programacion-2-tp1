/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        
        System.out.print("Ingresa tu altura (en metros): ");
        double altura = Double.parseDouble(sc.nextLine());
        
        System.out.print("Nombre: "+nombre+"\nEdad: "+edad+"\nAltura: "+altura);
        
        sc.close();
    }
    
}
