/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Marlon Galo
 */
//SubClase Linea
public class Linea extends Formas{
    private double largo;
       
    public Linea(){
        establecerDibujar("Linea");
    }
    
    public double establecerLargo(double largo){
        this.largo = largo;
        return 0;
    }
    
    public double obtenerLargo(){
        return this.largo;
    }
    
    /**
     *
     */
    public void imprimirLargo(){
        System.out.println("Largo de la linea=" +largo);
        System.out.println("------------------------------------------------------------------------");
        
    }
    
    
}
