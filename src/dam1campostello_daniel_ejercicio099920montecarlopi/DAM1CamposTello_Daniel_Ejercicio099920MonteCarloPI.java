/*
 la idea de este ejercicio es aproximar pi mediante el metodo de montecarlo.
 */
package dam1campostello_daniel_ejercicio099920montecarlopi;

import java.util.LinkedHashSet;

/**
 *
 * @author daniel campos
 */
public class DAM1CamposTello_Daniel_Ejercicio099920MonteCarloPI {

  /**
   * @param args the command line
   * arguments
   */
  public static void main(String[] args) {
    //declaramos un conjunto, he elegido LinkedHashSet para este programa ya que no permite elementos duplicados
    LinkedHashSet<Punto> conjuntoPuntos = new LinkedHashSet<>();
    //declaramos un objeto de la clase Utilidades, la usaremos para generarAleatorios y formatearDecimales.
    Utilidades u = new Utilidades();
    //limite = nro puntos a generar
    int limite = 10000;
    while (conjuntoPuntos.size() != limite) {
      //declaramos un punto 
      Punto p = new Punto();
      //asignamos un valor aleatorio a las x's e y's
      p.setX(u.generarAleatorio());
      p.setY(u.generarAleatorio());
      //aniadimos el punto al conjunto
      conjuntoPuntos.add(p);
    }
    //radio del circulo
    double r = 1.0;
    //area del cuadrado, de lado 2
    //el area del cuadrado es 4 porque(lado = 2, por lo tanto 2^2=4) el radio del circulo que esta dentro de el es de 1.
    double a = 2.0*2.0;
    //contador de puntos dentro del circulo
    double puntoDentroCirculo = 0;
    //recorremos el set de puntos
    for (Punto p : conjuntoPuntos) {
      //usado para ver si el punto esta o no dentro cel circulo
      //Si x al cuadrado + y al cuadrado < radio al cuadrado, significa que el punto esta dentro del círculo
      if (Math.pow(p.getX(),2) + Math.pow(p.getY(),2) < Math.pow(r,2)) {
        puntoDentroCirculo++;
      } 
    }
    System.out.println("puntos dentro del circulo: " + puntoDentroCirculo);
    //pi = area del recinto conocido * (puntos dentro del circulo / nro puntos lanzados)
    //a = area del recinto conocido -> 4.0
    //nro puntos lanzados = limite
    double pi =a * (puntoDentroCirculo/limite);
    System.out.println("valor aproximado de pi: " + pi);
    System.out.println("valor aproximado de pi redondeado: " + u.formatearDecimales(pi, 2));
   
  }

}
