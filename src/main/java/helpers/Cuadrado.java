/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Marlon Galo
 */
//SubClase Cuadrado
public class Cuadrado extends Formas{
    double area;
    
    public Cuadrado(){
        establecerDibujar("Cuadrado");
    }
    
    public double calcularArea(double y){
        this.area=y*y;
        return 0;
    }
    
    public double obtenerArea(){
        return this.area;
    }
    
    public void imprimirArea(){
        System.out.println("El area se calculo por la formula= lado x * lado y");
        System.out.println("El area del cuadrado= " +area);
        System.out.println("------------------------------------------------------------------------");
    }
    
}
