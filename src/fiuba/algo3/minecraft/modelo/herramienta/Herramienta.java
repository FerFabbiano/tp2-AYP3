package fiuba.algo3.minecraft.modelo.herramienta;

import fiuba.algo3.minecraft.modelo.desgaste.Desgaste;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.material.*;

public abstract class Herramienta extends Elemento {

    public Desgaste desgaste ;

    public void desgastar(Material material) { this.desgastar(material);}

    public abstract void desgastar(Metal material);
    public abstract void desgastar(Madera material);
    public abstract void desgastar(Diamante material);
    public abstract void desgastar(Piedra material);

    protected Herramienta(Desgaste desgaste){
        this.desgaste = desgaste ;
    }

    public int obtenerDurabilidad() {
        return desgaste.obtenerDurabilidad() ;
    }

    public int obtenerFuerza(){
        return desgaste.obtenerFuerza() ;
    }

}
