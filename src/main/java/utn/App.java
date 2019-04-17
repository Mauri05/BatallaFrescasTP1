package utn;

import utn.classes.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Jefe boss = new Jefe("Duff man", 35, 70, new OrinarVikingoImp(), new BeberEspartanoImp(), (int)(Math.random()*100)+1, (int)(Math.random()*100)+1);

        List<Vikingo> vikingos = new ArrayList<>();
        List<Espartano> espartanos = new ArrayList<>();

        vikingos = Arrays.asList(
                new Vikingo("Pepe",23,70,new OrinarVikingoImp(),new BeberVikingoImp(), (int)(Math.random()*100)+1),
                new Vikingo("Jorge",30,89,new OrinarVikingoImp(),new BeberVikingoImp(), (int)(Math.random()*100)+1),
                new Vikingo("Mauri",19,63,new OrinarVikingoImp(),new BeberVikingoImp(), (int)(Math.random()*100)+1)
        );

        espartanos = Arrays.asList(
                new Espartano("Lucas",40,90,new OrinarEspartanoImp(),new BeberEspartanoImp(), (int)(Math.random()*100)+1),
                new Espartano("Roberto",19,60,new OrinarEspartanoImp(),new BeberEspartanoImp(), (int)(Math.random()*100)+1),
                new Espartano("Pedro",22,77,new OrinarEspartanoImp(),new BeberEspartanoImp(), (int)(Math.random()*100)+1)
        );

        System.out.println("Vikingos: " + vikingos);
        System.out.println("Espartanos: " + espartanos);

        //DNI Par: Ordenarlos por edad (de manera ascendente)

        vikingos.sort(Comparator.comparing(Vikingo::getEdad));
        espartanos.sort(Comparator.comparing(Espartano::getEdad));

        System.out.println("Vikingos ordenados: " + vikingos);
        System.out.println("Espartanos ordenados: " + espartanos);

        int numeroRandVikingos = (int)((Math.random()*vikingos.size())+1)-1;
        int numeroRandEspartanos = (int) ((Math.random()*espartanos.size())+1)-1;

        Vikingo v = vikingos.get(numeroRandVikingos);
        Espartano e = espartanos.get(numeroRandEspartanos);

        System.out.println("\n----- Batalla Inicial -----");
        System.out.println("\nVikingo "+v.getNombre()+" vs Espartano "+e.getNombre()+"\n");
        Humano ganador = Batalla.batallaInicial(v,e);
        System.out.println("\n----- Batalla Boss -----");
        System.out.println("\n"+ganador.getNombre()+" vs "+boss.getNombre()+"\n");
        Batalla.batallaBoss(boss, ganador);
    }
}
