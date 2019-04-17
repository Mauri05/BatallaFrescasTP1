package utn.classes;

import utn.interfaces.Beber;
import utn.interfaces.Orinar;

public class Jefe extends Humano{
    private int toleranciaExtra;
    private int bebedorProfesional;

    public Jefe(String nombre, int edad, int peso, Orinar orinar, Beber beber, int toleranciaExtra, int bebedorProfesional){
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
        this.bebedorProfesional = bebedorProfesional;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public int getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(int bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public String toString() {
        return "Jefe{" + super.toString() +
                "toleranciaExtra=" + toleranciaExtra +
                ", bebedorProfesional=" + bebedorProfesional +
                '}';
    }
}
