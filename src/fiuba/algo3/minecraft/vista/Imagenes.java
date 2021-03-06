package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.herramienta.Hacha;
import fiuba.algo3.minecraft.modelo.herramienta.Herramienta;
import fiuba.algo3.minecraft.modelo.herramienta.Pico;
import fiuba.algo3.minecraft.modelo.jugador.Elemento;
import fiuba.algo3.minecraft.modelo.jugador.Jugador;
import fiuba.algo3.minecraft.modelo.material.*;
import fiuba.algo3.minecraft.modelo.posicionable.Posicionable;
import fiuba.algo3.minecraft.modelo.posicionable.Vacio;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;

public class Imagenes {
    private final Integer xLenght = 30;
    private final Integer yLenght = 30 ;
    private final Boolean preserveRatio = false ;
    private final Boolean smooth = false ;
    
    private final String folderURL = "fiuba/algo3/minecraft/vista/images/resource/" ;

    public final Image diamond,grass,iron,steve,stone,wood,empty,
					   axe_wood,axe_stone,axe_iron,pickaxe_wood,pickaxe_stone,pickaxe_iron,pickaxe_diamond;

    public Imagenes() {
        diamond = new Image(folderURL + "diamond.jpeg",xLenght,yLenght,preserveRatio,smooth);
        grass = new Image(folderURL + "grass.jpg",xLenght,yLenght,preserveRatio,smooth);
        iron = new Image(folderURL + "iron.jpeg",xLenght,yLenght,preserveRatio,smooth);
        steve = new Image(folderURL + "steve.jpg",xLenght,yLenght,preserveRatio,smooth);
        stone = new Image(folderURL + "stone.jpg",xLenght,yLenght,preserveRatio,smooth);
        wood = new Image(folderURL + "wood.jpg",xLenght,yLenght,preserveRatio,smooth);
        empty = new Image(folderURL + "empty_field_work_table.jpg",xLenght,yLenght,preserveRatio,smooth);
        axe_wood = new Image(folderURL + "tools/axe_wood.png",xLenght,yLenght,preserveRatio,smooth);
        axe_stone = new Image(folderURL + "tools/axe_stone.png",xLenght,yLenght,preserveRatio,smooth);
        axe_iron = new Image(folderURL + "tools/axe_iron.png",xLenght,yLenght,preserveRatio,smooth);
        pickaxe_wood = new Image(folderURL + "tools/pickaxe_wood.png",xLenght,yLenght,preserveRatio,smooth);
        pickaxe_stone = new Image(folderURL + "tools/pickaxe_stone.png",xLenght,yLenght,preserveRatio,smooth);
        pickaxe_iron = new Image(folderURL + "tools/pickaxe_iron.png",xLenght,yLenght,preserveRatio,smooth);
        pickaxe_diamond = new Image(folderURL + "tools/pickaxe_diamond.png",xLenght,yLenght,preserveRatio,smooth);
    }


    public Node setImageNode(Posicionable elemento){
        if (elemento instanceof Material){
            return setImageNode((Material) elemento) ;
        }
        if ( elemento instanceof Jugador){
            return new ImageView(steve) ;
        }
        if (elemento instanceof Vacio){
            return new ImageView(grass) ;
        }

        return new ImageView(empty) ;
    }

    public Node setImageNode(Material material ){
        if (material instanceof Diamante){
            return new ImageView(diamond) ;
        }
        if (material instanceof Madera){
            return new ImageView(wood) ;
        }
        if (material instanceof Piedra){
            return new ImageView(stone) ;
        }
        if (material instanceof Metal){
            return new ImageView(iron) ;
        }

        return new ImageView(empty) ;

    }

    public Node setImageNode(Herramienta herramienta){
        if (herramienta.obtenerMaterialConstruccion() instanceof Madera ){
            if (herramienta instanceof Hacha){
                return new ImageView(axe_wood);
            }
            if (herramienta instanceof Pico){
                return new ImageView(pickaxe_wood);
            }
        }
        if ( herramienta.obtenerMaterialConstruccion() instanceof Piedra ){
            if (herramienta instanceof Hacha){
                return new ImageView(axe_stone);
            }
            if (herramienta instanceof Pico){
                return new ImageView(pickaxe_stone);
            }
        }
        if ( herramienta.obtenerMaterialConstruccion() instanceof Metal ){
            if (herramienta instanceof Hacha){
                return new ImageView(axe_iron);
            }
            if (herramienta instanceof Pico){
                return new ImageView(pickaxe_iron);
            }
        }
        if (herramienta.obtenerMaterialConstruccion() instanceof Diamante ){
            return new ImageView(pickaxe_diamond);
        }
        return new ImageView(empty) ;
    }

    public Node setImageNode(Elemento elemento){
        if (elemento instanceof Herramienta){
            Herramienta herramienta = (Herramienta) elemento ;
            return setImageNode(herramienta) ;
        }
        if (elemento instanceof Material){
            return setImageNode((Material) elemento) ;
        }

        return new ImageView(empty) ;
    }

}
