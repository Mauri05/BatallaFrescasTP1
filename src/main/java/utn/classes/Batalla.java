package utn.classes;

public class Batalla{

    public static Humano batallaInicial(Vikingo vikingo, Espartano espartano){
        Conectar connection = new Conectar();
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
            connection.setGanadores("insert into ganadores (nombre, cantidad_bebida) values ('"+espartano.getNombre()+"','"+espartano.getToleranciaExtra()+"')");
        }
        else{
            System.out.println(espartano.getOrinar().orinar());
            ganador = vikingo;
            connection.setGanadores("insert into ganadores (nombre, cantidad_bebida) values ('"+vikingo.getNombre()+"','"+vikingo.getBebedorProfesional()+"')");
        }
        System.out.println("\nResultados Finales: \n");
        System.out.println("Vikingo "+vikingo.getNombre()+" bebio "+vikingo.getBebedorProfesional()+" botellas");
        System.out.println("Espartano "+espartano.getNombre()+" bebio "+espartano.getToleranciaExtra()+" botellas\n");
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
        System.out.println("\nResultados Finales: \n");
        System.out.println("Boss "+boss.getNombre()+" bebio "+atributosJefe);
        System.out.println("Retador "+ganador.getNombre()+" bebio "+atributosGanador+"\n");
        if(atributosJefe>=atributosGanador){
            System.out.println("El jefe volvio a ganar");
        }
        else{
            System.out.println("¡El retador "+ganador.getNombre()+" triunfo heroicamente!");
        }
    }

    public static void historialGanadores(){
        Conectar connection = new Conectar();
        connection.getGanadores();
    }
}