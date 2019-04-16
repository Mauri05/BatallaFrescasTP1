package utn.classes;

import utn.interfaces.Beber;
import utn.interfaces.Orinar;

public class Espartano extends Humano{
  private int toleranciaExtra;

  public Espartano(String nombre, int edad, int peso, Orinar orinar, Beber beber, int toleranciaExtra){
    super(nombre, edad, peso, orinar, beber);
    this.toleranciaExtra = toleranciaExtra;
  }

  public int getEdad(){
    return super.getEdad();
  }

  public int getToleranciaExtra() {
    return toleranciaExtra;
  }

  public void setToleranciaExtra(int toleranciaExtra) {
    this.toleranciaExtra = toleranciaExtra;
  }

  @Override
  public String toString() {
    return "Espartano{" + super.toString() +
            "toleranciaExtra=" + toleranciaExtra +
            '}';
  }
}