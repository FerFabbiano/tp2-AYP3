package fiuba.algo3.minecraft.vista;

import fiuba.algo3.minecraft.AlgoCraft;
import fiuba.algo3.minecraft.controller.InsertarMaterialEventHandler;
import fiuba.algo3.minecraft.controller.MovimientoEventHandler;
import fiuba.algo3.minecraft.modelo.tablero.TableroDelJuego;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JuegoVista  {

    private final Stage escenario;
    private AlgoCraft aplicacion;
    private Controles controles;
    private BarraDeMenu menuBar;


    public JuegoVista(Stage escenario, TableroDelJuego tableroDelJuego){

        this.escenario = escenario;
        this.controles = new Controles();
        this.menuBar = new BarraDeMenu();
        this.iniciar(tableroDelJuego);

    }

    public void iniciar(TableroDelJuego tableroDelJuego){

        BorderPane borderPane = new BorderPane();

        GridPane mapa = new VistaTableroJuego(tableroDelJuego);
        GridPane inventario = new VistaInventario(tableroDelJuego.obtenerJugador().obtenerInventario()) ;
        VBox contenedorDeControles = controles.obtenerControles(tableroDelJuego);

        VBox contenedorMapaInventario = new VBox(mapa,inventario) ;
        contenedorMapaInventario.setSpacing(10);

        HBox contenedorHorizontal = new HBox(contenedorDeControles, contenedorMapaInventario);
        contenedorHorizontal.setSpacing(10);
        borderPane.setTop(menuBar.obtenerBarraDeMenu());

        borderPane.setCenter(contenedorHorizontal);

        Scene escenaJuego = new Scene(borderPane);

        escenaJuego.setOnKeyTyped(new MovimientoEventHandler(tableroDelJuego));
        escenaJuego.setOnMouseDragged(new InsertarMaterialEventHandler(tableroDelJuego));
        escenaJuego.setOnMousePressed(new InsertarMaterialEventHandler(tableroDelJuego));
        escenaJuego.setOnMouseReleased(new InsertarMaterialEventHandler(tableroDelJuego));

        this.escenario.setScene(escenaJuego);

        this.escenario.show();
    }

}
