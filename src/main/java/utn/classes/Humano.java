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

  public int getEdad(){
    return this.edad;
  }
}