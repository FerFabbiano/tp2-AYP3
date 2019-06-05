package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.Desgaste;
import fiuba.algo3.minecraft.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;

public class HachaDeMetal extends Herramienta {

    public HachaDeMetal(){
        super( new DesgasteEstandar(400,10, 0.5F));
    }

    public void desgastar(Metal material){
        material.desgastar(this);
    }

    public void desgastar(Piedra material){
        material.desgastar(this);
    }

    public void desgastar(Diamante material){ material.desgastar(this); }

    public void desgastar(Madera material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }
}
