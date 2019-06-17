package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.modelo.juego.Juego;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

public class MesaDeTrabajoVista {

    private VBox contenedorPrincipal;

    public MesaDeTrabajoVista(Juego juego){

        this.contenedorPrincipal = new VBox();

        VBox contenedorDeMesa = new VBox();

        for (int i = 0; i < 3; i++){
            HBox fila = new HBox();
            for (int j = 0; j < 3; j++){
                Button boton = new Button();
                boton.setText(" ");
                fila.getChildren().add(boton);
            }
            fila.setAlignment(Pos.CENTER);
            contenedorDeMesa.getChildren().add(fila);
        }

        this.contenedorPrincipal.getChildren().add(contenedorDeMesa);

        Button botonConstruir = new Button();
        botonConstruir.setText("Construir");

        this.contenedorPrincipal.getChildren().add(botonConstruir);
        this.contenedorPrincipal.setAlignment(Pos.CENTER);
        this.contenedorPrincipal.setSpacing(20);

    }

    public VBox obtenerMesa(){
        return this.contenedorPrincipal;
    }

}
