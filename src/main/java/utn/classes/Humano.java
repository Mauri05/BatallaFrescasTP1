package utn.classes;

import utn.interfaces.Beber;
import utn.interfaces.Orinar;

public class Humano{
  private String nombre;
  private int edad;
  private int peso;
  Orinar orinar;
  Beber beber;

  public Humano(String nombre,int edad,int peso,Orinar orinar,Beber beber){
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.orinar = orinar;
    this.beber = beber;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public Orinar getOrinar() {
    return orinar;
  }

  public void setOrinar(Orinar orinar) {
    this.orinar = orinar;
  }

  public Beber getBeber() {
    return beber;
  }

  public void setBeber(Beber beber) {
    this.beber = beber;
  }

  @Override
  public String toString() {
    return "Humano{" +
            "nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", peso=" + peso +
            ", orinar=" + getOrinar().orinar() +
            ", beber=" + getBeber().beber() +
            '}';
  }
}