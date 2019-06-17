package fiuba.algo3.minecraft.modelo.plano;

import fiuba.algo3.minecraft.modelo.mapa.Mapa;
import fiuba.algo3.minecraft.modelo.mapa.posicion.Posicion;
import fiuba.algo3.minecraft.modelo.material.Madera;

public class PlanoPicoDeMadera{

    private Mapa plano;

    public PlanoPicoDeMadera(){
        plano = new Mapa(3, 3);
        plano.agregarElemento(new Posicion(0,0), new Madera());
        plano.agregarElemento(new Posicion(1,0), new Madera());
        plano.agregarElemento(new Posicion(2,0), new Madera());
        plano.agregarElemento(new Posicion(1,1), new Madera());
        plano.agregarElemento(new Posicion(1,2), new Madera());
    }

    public Mapa obtenerPlano(){
        return plano;
    }

}