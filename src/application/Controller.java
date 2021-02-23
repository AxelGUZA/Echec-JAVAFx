package application;

import javafx.application.Platform;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class Controller {

    final int tailleDesCases = 55;
    @FXML
    public GridPane gridEchec;

    //public Path path = Paths.get();

    @FXML
    public MenuItem APropos,regle,fermeFenetre,sauvegardeFichier,ouvrirFichier;

    @FXML
    public Canvas canva0x0, canva0x1,canva0x2,canva0x3,canva0x4,canva0x5,canva0x6,canva0x7;
    @FXML
    public Canvas canva1x0, canva1x1,canva1x2,canva1x3,canva1x4,canva1x5,canva1x6,canva1x7;
    @FXML
    public Canvas canva2x0, canva2x1,canva2x2,canva2x3,canva2x4,canva2x5,canva2x6,canva2x7;
    @FXML
    public Canvas canva3x0, canva3x1,canva3x2,canva3x3,canva3x4,canva3x5,canva3x6,canva3x7;
    @FXML
    public Canvas canva4x0, canva4x1,canva4x2,canva4x3,canva4x4,canva4x5,canva4x6,canva4x7;
    @FXML
    public Canvas canva5x0, canva5x1,canva5x2,canva5x3,canva5x4,canva5x5,canva5x6,canva5x7;
    @FXML
    public Canvas canva6x0, canva6x1,canva6x2,canva6x3,canva6x4,canva6x5,canva6x6,canva6x7;
    @FXML
    public Canvas canva7x0, canva7x1,canva7x2,canva7x3,canva7x4,canva7x5,canva7x6,canva7x7;



    public Pion pionNoir[] = new Pion[16];
    public Pion pionBlanc[]= new Pion[16];
    public Echiquier echiquier;

    @FXML
    private Canvas canvaTab[][] = new Canvas[8][8];



    @FXML
    public void initialize(){
        remplissageTableauDeCanvas();
        pionNoir[0] = new Pion(3,3,Color.GREEN,canvaTab, gridEchec);
        echiquier = new Echiquier(canvaTab, gridEchec,pionNoir,pionBlanc);

        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                pionNoir[0].deplacement();
            }
        };
        //Registering the event filter
        pionNoir[0].canva[pionNoir[0].getX()][pionNoir[0].getY()].addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);





    }

    private void colorEchiquier() {
        for(int i = 0; i < 8 ; i=i+2)
        {
            for(int y = 0; y < 8; y= y+2){
                colorCase(this.canvaTab[i][y],Color.BLACK,tailleDesCases);
            }
        }

        for(int i = 1; i < 8 ; i=i+2)
        {
            for(int y = 1; y < 8; y= y+2){
                colorCase(this.canvaTab[i][y],Color.BLACK,tailleDesCases);
            }
        }
    }

    private void remplissageTableauDeCanvas() {
        canvaTab[0][0] =this.canva0x0;
        canvaTab[0][1] =this.canva0x1;
        canvaTab[0][2] =this.canva0x2;
        canvaTab[0][3] =this.canva0x3;
        canvaTab[0][4] =this.canva0x4;
        canvaTab[0][5] =this.canva0x5;
        canvaTab[0][6] =this.canva0x6;
        canvaTab[0][7] =this.canva0x7;

        canvaTab[1][0] =this.canva1x0;
        canvaTab[1][1] =this.canva1x1;
        canvaTab[1][2] =this.canva1x2;
        canvaTab[1][3] =this.canva1x3;
        canvaTab[1][4] =this.canva1x4;
        canvaTab[1][5] =this.canva1x5;
        canvaTab[1][6] =this.canva1x6;
        canvaTab[1][7] =this.canva1x7;

        canvaTab[2][0] =this.canva2x0;
        canvaTab[2][1] =this.canva2x1;
        canvaTab[2][2] =this.canva2x2;
        canvaTab[2][3] =this.canva2x3;
        canvaTab[2][4] =this.canva2x4;
        canvaTab[2][5] =this.canva2x5;
        canvaTab[2][6] =this.canva2x6;
        canvaTab[2][7] =this.canva2x7;

        canvaTab[3][0] =this.canva3x0;
        canvaTab[3][1] =this.canva3x1;
        canvaTab[3][2] =this.canva3x2;
        canvaTab[3][3] =this.canva3x3;
        canvaTab[3][4] =this.canva3x4;
        canvaTab[3][5] =this.canva3x5;
        canvaTab[3][6] =this.canva3x6;
        canvaTab[3][7] =this.canva3x7;

        canvaTab[4][0] =this.canva4x0;
        canvaTab[4][1] =this.canva4x1;
        canvaTab[4][2] =this.canva4x2;
        canvaTab[4][3] =this.canva4x3;
        canvaTab[4][4] =this.canva4x4;
        canvaTab[4][5] =this.canva4x5;
        canvaTab[4][6] =this.canva4x6;
        canvaTab[4][7] =this.canva4x7;

        canvaTab[5][0] =this.canva5x0;
        canvaTab[5][1] =this.canva5x1;
        canvaTab[5][2] =this.canva5x2;
        canvaTab[5][3] =this.canva5x3;
        canvaTab[5][4] =this.canva5x4;
        canvaTab[5][5] =this.canva5x5;
        canvaTab[5][6] =this.canva5x6;
        canvaTab[5][7] =this.canva5x7;


        canvaTab[6][0] =this.canva6x0;
        canvaTab[6][1] =this.canva6x1;
        canvaTab[6][2] =this.canva6x2;
        canvaTab[6][3] =this.canva6x3;
        canvaTab[6][4] =this.canva6x4;
        canvaTab[6][5] =this.canva6x5;
        canvaTab[6][6] =this.canva6x6;
        canvaTab[6][7] =this.canva6x7;

        canvaTab[7][0] =this.canva7x0;
        canvaTab[7][1] =this.canva7x1;
        canvaTab[7][2] =this.canva7x2;
        canvaTab[7][3] =this.canva7x3;
        canvaTab[7][4] =this.canva7x4;
        canvaTab[7][5] =this.canva7x5;
        canvaTab[7][6] =this.canva7x6;
        canvaTab[7][7] =this.canva7x7;

        colorEchiquier();
    }

    @FXML
    public void colorCase(Canvas canva, Color color, int taille){
        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0,0,taille,taille);
        

    }

    public void close(){
        Platform.exit();
    }


    public void redCase(MouseEvent mouseEvent) {
        int valeur = Integer.valueOf(mouseEvent.getPickResult().getIntersectedNode().getId().substring(5,6));
        int valeur2 = Integer.valueOf(mouseEvent.getPickResult().getIntersectedNode().getId().substring(7,8));



        canvaTab[valeur][valeur2].setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {

                //colorCase(canvaTab[valeur][valeur2],Color.RED,tailleDesCases);
            }
        });
    }
}
