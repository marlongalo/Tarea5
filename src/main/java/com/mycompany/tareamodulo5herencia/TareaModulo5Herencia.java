/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tareamodulo5herencia;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Formas;
import helpers.Linea;
import helpers.Triangulo;

/**
 * 
 * Escribir una Superclase llamada Formas y 4 subclases según el diagrama
 * Crear las herencias necesarias para las subclases
 * Escribir los métodos en la clase padre los métodos en cada subclase
 * Explicar el funcionamiento y estructura de todo su código en un documento de 2 páginas
 * Los métodos Dibujar de las subclases solo imprimen una salida con el nombre de la figura.
 * @author Marlon Galo
 */
public class TareaModulo5Herencia {
//Clase Principal
    public static void main(String[] args) {
        //Instanciar la clase
        Formas formas = new Formas();
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        double x = 0;//Variable que se envia inicializada en 0
        double y; 
        double base; base=15;
        y=45;//Variable que envia el valor de 6, utilizada como valor para obtener el radio, Linea, angulo y area
        
        formas.establecerColor("Verde");
        formas.imprimirColor();
        
        circulo.calcularRadio(y,x);
        circulo.imprimirInformacion();
        circulo.imprimirRadio();
        
        linea.establecerLargo(y);
        linea.imprimirInformacion();
        linea.imprimirLargo();
        
        triangulo.establecerArea(base, y);
        triangulo.imprimirInformacion();
        triangulo.imprimirArea();
        
        cuadrado.calcularArea(y);
        cuadrado.imprimirInformacion();
        cuadrado.imprimirArea();
        
        System.out.println("Actualizacion de la rama de desarrollo para luego aplicar a produccion");
    }
}
