package fiuba.algo3.minecraft.modelo.material;

import fiuba.algo3.minecraft.modelo.herramienta.*;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;

public abstract class Material extends Elemento implements Posicionable {

    private Posicion posicion;

    public abstract void desgastar(Herramienta herramienta) ;

    public abstract void desgastar(Hacha hacha);
    public abstract void desgastar(Pico pico);
    public abstract int obtenerDurabilidad();
    public abstract boolean estaRoto();

    @Override
    public void establecerPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public Posicion obtenerPosicionActual() {
        return posicion;
    }
}
