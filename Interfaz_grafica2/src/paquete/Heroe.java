package paquete;

public class Heroe {
    private String nombre;
    private int fuerza;
    private int velocidad;
    private int resistencia;
    private int inteligencia;

    public Heroe(String nombre, int fuerza, int velocidad, int resistencia, int inteligencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    @Override
    public String toString() {
        return nombre + " [fuerza=" + fuerza + 
               ", velocidad=" + velocidad + 
               ", resistencia=" + resistencia + 
               ", inteligencia=" + inteligencia + "]";
    }

    // Comparación de atributos
    public Heroe enfrentaFuerza(Heroe otro) {
        Heroe mayor = null;
        if (this.getFuerza() > otro.getFuerza())
            mayor = this;
        else if (this.getFuerza() < otro.getFuerza())
            mayor = otro;
        return mayor;
    }

    public Heroe enfrentaVelocidad(Heroe otro) {
        Heroe mayor = null;
        if (this.getVelocidad() > otro.getVelocidad())
            mayor = this;
        else if (this.getVelocidad() < otro.getVelocidad())
            mayor = otro;
        return mayor;
    }

    public Heroe enfrentaResistencia(Heroe otro) {
        Heroe mayor = null;
        if (this.getResistencia() > otro.getResistencia())
            mayor = this;
        else if (this.getResistencia() < otro.getResistencia())
            mayor = otro;
        return mayor;
    }

    public Heroe enfrentaInteligencia(Heroe otro) {
        Heroe mayor = null;
        if (this.getInteligencia() > otro.getInteligencia())
            mayor = this;
        else if (this.getInteligencia() < otro.getInteligencia())
            mayor = otro;
        return mayor;
    }
}