/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author mitch
 */

/*
    Represente mediante una diagrama de clases (2pts) e implemente(11pts) en
lenguaje de programación Java, la clase Persona con los siguientes elementos:
 Variables de instancia: nombre, edad y genero (2pts)
 Métodos de instancia: setearNombre, obtenerNombre, setearEdad y
obtenerEdad (2pts)
 Método de clase: calcularEdadPromedio (3pts)
 Programa que registre tres personas y calcule su edad promedio. (4)
*/


public class Persona {
    
    String nombre;
    String apellido;
    int edad;
    String genero;
    static int edadAcumulada = 0;
    static int cantidadPersonas = 0;
    
    
    public Persona(){
       cantidadPersonas ++;
    }
    
    public Persona(String nombre, int edad, String genero){
       this.nombre = nombre;
       this.edad = edad;
       this.genero = genero;
       edadAcumulada += edad;
       cantidadPersonas ++;
       
    }
    
    
    void setearNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    String obtenerNombre(){
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    void setearEdad(int edad){
        if(this.edad == 0){
           this.edad = edad;
           edadAcumulada += edad; 
        }
        else{
           edadAcumulada -= this.edad;
           this.edad = edad;
           edadAcumulada += this.edad; 
        }
    }
    
    int obtenerEdad(){
        return edad;
    }
    
    static double calcularEdadPromedio(){   
        return edadAcumulada/(double)cantidadPersonas;
    }
    
}
