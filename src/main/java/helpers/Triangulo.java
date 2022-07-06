/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Marlon Galo
 */
//SubClase Triangulo
public class Triangulo extends Formas{
    private final double angulo = 90;
    private double area=0;
    
    public Triangulo(){
        establecerDibujar("Triangulo");
    }
    
    public double establecerArea(double base, double y){
        this.area = (base*y)/2;
        return 0;
    }
    
    public double obtenerArea(){
        return this.area;
    }
    
    public void imprimirArea(){
        System.out.println("El area de un triangulo se calcula por la formula= (base * altura) /2 ");
        System.out.println("Donde el angulo del triangulo = " +angulo +" grados");
        System.out.println("El area del triangulo= " +area);
        System.out.println("------------------------------------------------------------------------");        
    }
}
