/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1campostello_daniel_ejercicio099920montecarlopi;

/**
 *
 * @author danie
 */
public class Utilidades {

  public double formatearDecimales(double numero, int decimales) {
    //redondea un numero doble pasado como parametro, a los decimales que se le pase como parametro.
    double resultado = numero;
    resultado = resultado * Math.pow(10, decimales);
    resultado = Math.round(resultado);
    resultado = resultado / Math.pow(10, decimales);
    return resultado;
  }

  public double generarAleatorio() {
    //genera aleatorios entre -1 y 1
    return (Math.random() * 1) + (-1);
  }

}
