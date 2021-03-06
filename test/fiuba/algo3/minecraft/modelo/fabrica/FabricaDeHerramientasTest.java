package fiuba.algo3.minecraft.modelo.fabrica;

import fiuba.algo3.minecraft.modelo.desgaste.DesgasteEstandar;
import fiuba.algo3.minecraft.modelo.desgaste.DesgasteNoConvencional;
import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.material.Diamante;
import fiuba.algo3.minecraft.modelo.material.Madera;
import fiuba.algo3.minecraft.modelo.material.Metal;
import fiuba.algo3.minecraft.modelo.material.Piedra;
import org.junit.Assert;
import org.junit.Test;

public class FabricaDeHerramientasTest {

    @Test
    public void test01CreamosInstanciaDeFabricaDeHerramientas(){
        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();

        Assert.assertNotNull(fabricaDeHerramientas);
    }

    @Test
    public void test02FabricaConstruyeHachaDeMadera(){
        int durabilidadInicia = 100 ;
        int fuerzaInicial = 2 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteEstandar desgasteEstandar = new DesgasteEstandar(durabilidadInicia, fuerzaInicial, 1);
        Hacha hachaDeMadera = new Hacha(desgasteEstandar,new Madera());
        Hacha hacha = fabricaDeHerramientas.construirHachaDeMadera();

        Assert.assertEquals(hacha, hachaDeMadera);
    }

    @Test
    public void test03FabricaConstruyeHachaDePiedra(){
        int durabilidadInicia = 200 ;
        int fuerzaInicial = 5 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteEstandar desgasteEstandar = new DesgasteEstandar(durabilidadInicia, fuerzaInicial, 1);
        Hacha hachaDePiedra = new Hacha(desgasteEstandar,new Piedra());
        Hacha hacha = fabricaDeHerramientas.construirHachaDePiedra();

        Assert.assertEquals(hacha, hachaDePiedra);
    }

    @Test
    public void test04FabricaConstruyeHachaDeMetal(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 10 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteEstandar desgasteEstandar = new DesgasteEstandar(durabilidadInicia, fuerzaInicial, 0.5F);
        Hacha hachaDeMetal = new Hacha(desgasteEstandar,new Metal());
        Hacha hacha = fabricaDeHerramientas.construirHachaDeMetal();

        Assert.assertEquals(hacha, hachaDeMetal);
    }

    @Test
    public void test05FabricaConstruyePicoDeMadera(){
        int durabilidadInicia = 100 ;
        int fuerzaInicial = 2 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteEstandar desgasteEstandar = new DesgasteEstandar(durabilidadInicia, fuerzaInicial, 1);
        Pico picoDeMadera = new Pico(desgasteEstandar, new Madera());
        Pico pico = fabricaDeHerramientas.construirPicoDeMadera();

        Assert.assertEquals(pico, picoDeMadera);
    }

    @Test
    public void test06FabricaConstruyePicoDePiedra(){
        int durabilidadInicia = 200 ;
        int fuerzaInicial = 4 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteEstandar desgasteEstandar = new DesgasteEstandar(durabilidadInicia, fuerzaInicial, 1.5F);
        Pico picoDePiedra = new Pico(desgasteEstandar,new Piedra());
        Pico pico = fabricaDeHerramientas.construirPicoDePiedra();

        Assert.assertEquals(pico, picoDePiedra);
    }

    @Test
    public void test07FabricaConstruyePicoDeMetal(){
        int durabilidadInicia = 400 ;
        int fuerzaInicial = 12 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteNoConvencional desgasteLogaritmico = new DesgasteNoConvencional(durabilidadInicia, fuerzaInicial);
        Pico picoDeMetal = new Pico(desgasteLogaritmico,new Metal());
        Pico pico = fabricaDeHerramientas.construirPicoDeMetal();

        Assert.assertEquals(pico, picoDeMetal);
    }

    @Test
    public void test08FabricaConstruyePicoFino(){
        int durabilidadInicia = 1000 ;
        int fuerzaInicial = 20 ;

        FabricaDeHerramientas fabricaDeHerramientas = new FabricaDeHerramientas();
        DesgasteNoConvencional desgasteLogaritmico = new DesgasteNoConvencional(durabilidadInicia, fuerzaInicial);
        Pico picoFino = new Pico(desgasteLogaritmico, new Diamante());
        Pico pico = fabricaDeHerramientas.construirPicoFino();

        Assert.assertEquals(pico, picoFino);
    }

}
