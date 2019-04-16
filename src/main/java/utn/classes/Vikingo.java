package utn.classes;

import utn.interfaces.Beber;
import utn.interfaces.Orinar;

public class Vikingo extends Humano {
  private int bebedorProfesional;

  public Vikingo(String nombre, int edad, int peso, Orinar orinar, Beber beber, int bebedorProfesional){
    super(nombre, edad, peso, orinar, beber);
    this.bebedorProfesional = bebedorProfesional;
  }

  public int getEdad(){
    return super.getEdad();
  }
}