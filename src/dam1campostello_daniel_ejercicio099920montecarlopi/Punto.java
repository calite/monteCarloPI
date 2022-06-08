/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1campostello_daniel_ejercicio099920montecarlopi;

/**
 *
 * @author daniel campos
 */
public class Punto {
  double x;
  double y;
  
  public Punto(float x, float y){
    this.x = x;
    this.y = y;
  }
  
  public Punto() {
    this.x = x;
    this.y = y;
  }
  
  public Punto(Punto p) {
    this.x = p.getX();
    this.y = p.getY();
  }
  
  public double getX() {
    return x;
  }
  
  public void setX(double x) {
    this.x = x;
  }
  
  public double getY() {
    return y;
  }
  
  public void setY(double y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Punto other = (Punto) obj;
    if (this.x != other.x) {
      return false;
    }
    return this.y == other.y;
  }

  @Override
  public String toString() {
    return "Punto{" + "x=" + x + ", y=" + y + '}';
  }
 
}
