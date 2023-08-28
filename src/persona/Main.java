/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author mitch
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        
        String nombre, genero;
        int edad;
        
        System.out.println("Ingrese datos de primera persona");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        persona1.setearNombre(nombre);
        System.out.println("Edad:");
        edad = sc.nextInt();
        persona1.setearEdad(edad);
        sc.nextLine();
        System.out.println("Genero:");
        persona1.genero = sc.nextLine();
        
        System.out.println("Ingrese datos de segunda persona");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        persona2.setearNombre(nombre);
        System.out.println("Edad:");
        edad = sc.nextInt();
        persona2.setearEdad(edad);
        sc.nextLine();
        System.out.println("Genero:");
        persona2.genero = sc.nextLine();
        
        System.out.println("Ingrese datos de tercera persona");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        persona3.setearNombre(nombre);
        System.out.println("Edad:");
        edad = sc.nextInt();
        persona3.setearEdad(edad);
        sc.nextLine();
        System.out.println("Genero:");
        persona3.genero = sc.nextLine();
        
        double edadPromedio = Persona.calcularEdadPromedio();
        System.out.printf("La edad acumulada de las 3 personas es: %.2f",edadPromedio);
              
    }
}
