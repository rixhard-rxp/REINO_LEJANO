package REINO_LEJANO;

public class Personaje {
    private String nombre;
    private String rol;
    private String ulti;
    private String primerHabilidad;
    private String segundaHabilidad;

    public Personaje (String nombre, String rol, String ulti, String primerHabilidad, String segundaHabilidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.ulti = ulti;
        this.primerHabilidad = primerHabilidad;
        this.segundaHabilidad = segundaHabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public String getUlti() {
        return ulti;
    }

    public String getPrmerHabilidad() {
        return primerHabilidad;
    }

    public String getSegundaHabilidad() {
        return segundaHabilidad;
    }

    public void mostrarInfo (){
        System.out.println("El Personaje se llama: " + getNombre() + "\n" +
                           "Su rol es: " + getRol() + "\n" +
                           "Su Ulti es: " + getUlti() + "\n" +
                           "Su Primer Habilidad es: " + getPrmerHabilidad() + "\n" +
                           "Su Segunda Habilidad es: " + getSegundaHabilidad());
    }

    public void usarPrimerHabilidad (){
        System.out.println(getNombre() + " atacó con " + getPrmerHabilidad());
    }

    public void usarSegundaHabilidad (){
        System.out.println(getNombre() + " atacó con " + getSegundaHabilidad());
    }

    public void usarUlti (){
        System.out.println(getNombre() + " atacó con " + getUlti());
    }
}
