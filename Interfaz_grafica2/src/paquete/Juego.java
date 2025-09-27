package paquete;


import java.util.ArrayList;
import java.util.Iterator;


public class Juego
{
    private ArrayList<Heroe> heroes = new ArrayList<Heroe>();

    public void agregarHeroe(Heroe h)
    {
        this.heroes.add(h);
    }

    public void eliminarHeroe(Heroe h)
    {
        this.heroes.remove(h);
    }

    public Iterator<Heroe> getHeroes()
    {
        return this.heroes.iterator();
    }

    public Heroe enfrentar(Heroe h1, Heroe h2, String atributo)
    {
        Heroe resultado = null;
        if (atributo.equalsIgnoreCase("Fuerza"))
        {
            resultado = h1.enfrentaFuerza(h2);
        } 
        else if (atributo.equalsIgnoreCase("Velocidad"))
        {
            resultado = h1.enfrentaVelocidad(h2);
        } 
        else if (atributo.equalsIgnoreCase("Resistencia"))
        {
            resultado = h1.enfrentaResistencia(h2);
        } 
        else if (atributo.equalsIgnoreCase("Inteligencia"))
        {
            resultado = h1.enfrentaInteligencia(h2);
        }

        return resultado;
    }
}