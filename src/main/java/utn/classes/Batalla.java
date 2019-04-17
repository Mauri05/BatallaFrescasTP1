package utn.classes;

public class Batalla{

    public static Humano batallaInicial(Vikingo vikingo, Espartano espartano){
        Humano ganador = null;
        int contador = 0;
        while(contador <= vikingo.getBebedorProfesional() && contador <= espartano.getToleranciaExtra()){
            System.out.println(vikingo.getBeber().beber());
            System.out.println(espartano.getBeber().beber());
            contador++;
        }
        if(contador > vikingo.getBebedorProfesional()){
            System.out.println(vikingo.getOrinar().orinar());
            ganador = espartano;
        }
        else{
            System.out.println(espartano.getOrinar().orinar());
            ganador = vikingo;
        }
        System.out.println("Resultados Finales: /n");
        System.out.println("Vikingo "+vikingo.getNombre()+" bebio "+vikingo.getBebedorProfesional()+" botellas");
        System.out.println("Espartano "+espartano.getNombre()+" bebio "+espartano.getToleranciaExtra()+" botellas");
        return ganador;
    }

    public static void batallaBoss(Humano boss, Humano ganador){
        int contador = 0;
        int atributosGanador = 0;
        int atributosJefe = 0;
        if(boss instanceof  Jefe){
            atributosJefe = ((Jefe) boss).getBebedorProfesional() + ((Jefe) boss).getToleranciaExtra();
        }
        if(ganador instanceof  Vikingo){
            atributosGanador = ((Vikingo) ganador).getBebedorProfesional();
        }
        else{
            atributosGanador = ((Espartano) ganador).getToleranciaExtra();
        }
        while(contador <= atributosJefe && contador <= atributosGanador){
            System.out.println(boss.getBeber().beber());
            System.out.println(ganador.getBeber().beber());
            contador++;
        }
        if(contador>atributosJefe){
            System.out.println(boss.getOrinar().orinar());
        }
        else{
            System.out.println(ganador.getOrinar().orinar());
        }
        System.out.println("Resultados Finales: /n");
        System.out.println("Boss "+boss.getNombre()+" bebio "+atributosJefe);
        System.out.println("Retador "+ganador.getNombre()+" bebio "+atributosGanador);
        if(atributosJefe>=atributosGanador){
            System.out.println("El jefe volvio a ganar");
        }
        else{
            System.out.println("El retador "+ganador.getNombre()+" triunfo heroicamente");
        }
    }
}