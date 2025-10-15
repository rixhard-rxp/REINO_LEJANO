package REINO_LEJANO;

public class Combatiente extends Personaje{
    String skin;

    public Combatiente(String nombre, String rol, String ulti, String primerHabilidad, String segundaHabilidad, String skin) {
        super(nombre, rol, ulti, primerHabilidad, segundaHabilidad); // ✅ llama al constructor correcto del padre
        this.skin = skin;
    }
    
    @Override
    public void usarPrimerHabilidad() {
        System.out.println(getNombre() + " atacó con " + getPrmerHabilidad() + "\n" +
                            "Realiza un corte rápido al enemigo");
    }

    @Override
    public void usarSegundaHabilidad() {
        System.out.println(getNombre() + " atacó con " + getSegundaHabilidad() + "\n" +
                            "Golpea el suelo, derribando a los rivales cercanos");
    }

    @Override
    public void usarUlti() {
        System.out.println(getNombre() + " atacó con " + getUlti() + "\n" +
                            "Entra en modo furia");
    }


}

