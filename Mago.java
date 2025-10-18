package REINO_LEJANO;

public class Mago extends Personaje{
    String skin;

    public Mago(String nombre, String rol, String ulti, String primerHabilidad, String segundaHabilidad, String skin) {
        super(nombre, rol, ulti, primerHabilidad, segundaHabilidad); 
        this.skin = skin;
    }
    
    @Override
    public void usarPrimerHabilidad() {
        System.out.println(getNombre() + " atacó con " + getPrmerHabilidad() + "\n" +
                            "Bola de energía");
    }

    @Override
    public void usarSegundaHabilidad() {
        System.out.println(getNombre() + " atacó con " + getSegundaHabilidad() + "\n" +
                            "Ralentiza o empuja");
    }

    @Override
    public void usarUlti() {
        System.out.println(getNombre() + " atacó con " + getUlti() + "\n" +
                            "Gran explosión mágica");
    }


}
