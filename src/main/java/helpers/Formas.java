/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Marlon Galo
 */
//Clase Principal
public class Formas {
    //Atributos
    private String color;
    private String dibujar;
        
    //Constructor sin parametros
    public Formas(){
    }
    
    //Establecer y Obtener para atributo color
        public void establecerColor(String color){
            this.color = color;
        }
            
        public String obtenerColor(){
            return this.color;
        }
            
    //Establecer y Obtener para atributo color
        public void establecerDibujar(String dibujar){
            this.dibujar = dibujar;
        }
        
        public String obtenerDibujar(){
            return this.dibujar;
        }
        
        //Imprimir Informacion
        public void imprimirInformacion(){
            System.out.println("Dibujar:" + dibujar);
        }
        
        public void imprimirColor(){
            System.out.println("Color de todas las formas es:" + color +"\n");
        }
}
