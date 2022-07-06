/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Marlon Galo
 */
//SubClase Circulo
public class Circulo extends Formas {
    private double radio;
    public double diametro;
    
    public Circulo(){
        establecerDibujar("Circulo"); 
    }
    
    //Metodo establecer y obtener para Radio
    public double calcularRadio(double Diametro, double radio){
        this.radio = Diametro/2;
        this.diametro=Diametro;
        return 0; 
    }
    public double obtenerRadio(){
        return this.radio;
    }
    
    public void imprimirRadio(){
        System.out.println("Con un Diametro=" +diametro);
        System.out.println("Su radio se calcula por la formula r=diametro/2");
        System.out.println("Radio = " +radio);
        System.out.println("------------------------------------------------------------------------");
        
    }
 
}
