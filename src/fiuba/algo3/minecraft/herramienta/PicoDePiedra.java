package fiuba.algo3.minecraft.herramienta;

import fiuba.algo3.minecraft.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.material.Diamante;
import fiuba.algo3.minecraft.material.Madera;
import fiuba.algo3.minecraft.material.Metal;
import fiuba.algo3.minecraft.material.Piedra;

public class PicoDePiedra extends Herramienta {


    public PicoDePiedra (){
        super(new DesgasteEstandar(200,4,0.66F) ) ;
    }

    @Override
    public void desgastar(Metal material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    @Override
    public void desgastar(Piedra material){

        this.desgaste.desgastar();
        material.desgastar(this);

    }

    @Override
    public void desgastar(Diamante material){ material.desgastar(this); }

    @Override
    public void desgastar(Madera material){  material.desgastar(this); }

}

