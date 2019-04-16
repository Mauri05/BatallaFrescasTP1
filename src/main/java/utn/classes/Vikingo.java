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

  public int getBebedorProfesional() {
    return bebedorProfesional;
  }

  public void setBebedorProfesional(int bebedorProfesional) {
    this.bebedorProfesional = bebedorProfesional;
  }

  @Override
  public String toString() {
    return "Vikingo{" + super.toString() +
            "bebedorProfesional=" + bebedorProfesional +
            '}';
  }
}