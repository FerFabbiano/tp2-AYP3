package fiuba.algo3.minecraft.material;

import fiuba.algo3.minecraft.herramienta.*;

public class Diamante extends Material {

    private int durabilidad;

    public Diamante(){
        this.durabilidad = 100; ;
    }

    public int obtenerDurabilidad() {
        return durabilidad ;
    }

    public void desgastar(HachaDeMadera hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(HachaDePiedra hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(HachaDeMetal hacha) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDeMadera pico) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDePiedra pico) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoDeMetal pico) {
        durabilidad = durabilidad;
    }

    public void desgastar(PicoFino pico) {
        int fuerzaHerramienta = pico.obtenerFuerza();
        durabilidad = durabilidad - fuerzaHerramienta;
    }
}
