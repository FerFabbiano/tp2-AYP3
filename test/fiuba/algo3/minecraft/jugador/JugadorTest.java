package fiuba.algo3.minecraft.jugador;

import fiuba.algo3.minecraft.herramienta.HachaDeMadera;
import org.junit.Assert;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void test01CreamosInstanciaDeJugador(){

        Jugador unJugador = new Jugador();

        Assert.assertNotNull(unJugador);

    }

    @Test
    public void test02CreamosInstanciaDeJugadorConNombre(){

        Jugador unJugador = new Jugador("Pablo");

        String nombre = unJugador.obtenerNombre();

        Assert.assertEquals("Pablo", nombre);

    }

    @Test
    public void test03CreamosInstanciaDeJugadorSinNombre(){

        Jugador unJugador = new Jugador();

        String nombre = unJugador.obtenerNombre();

        Assert.assertEquals("Steve", nombre);

    }


}