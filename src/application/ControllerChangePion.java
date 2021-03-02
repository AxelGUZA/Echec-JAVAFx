package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ControllerChangePion {
    @FXML
    Button buttonCheval,buttonTour,buttonReine, buttonFou;

    @FXML
    Canvas canvaCheval, canvaTour,canvaReine,canvaFou;

    @FXML
    public void initialize(){
        int postionx = 44;
        int postiony = -11;


        couleurPion(canvaCheval,Color.BLACK,Color.GREEN.brighter(), postionx,postiony,45, 25);
        couleurPion(canvaTour,Color.BLACK,Color.GREEN, postionx,postiony,45, 25);
        couleurPion(canvaReine,Color.BLACK,Color.GREEN, postionx,postiony,45, 25);
        couleurPion(canvaFou,Color.BLACK,Color.GREEN, postionx,postiony, 45,25);

    }

    public void couleurPion(Canvas canvaPion,Color color1,Color color2, int positionx,int positiony,int rotation,int taille){
        double positionCentre= 21.2;
        double positionCentre2= 36;
        int taillePlus = 10;
        GraphicsContext gc = canvaPion.getGraphicsContext2D();

        switch(canvaPion.getId()){
            case "canvaCheval" :
                dessinCheval(color1, positionx, positiony, rotation, taille, positionCentre, positionCentre2, taillePlus, gc);

                break;

            case "canvaTour" :
                dessinTour(color1, positionx, positiony, rotation, taille, positionCentre, positionCentre2, taillePlus, gc);
            break;

            case "canvaReine" :
                dessinReine(color1, positionx, positiony, rotation, taille, positionCentre, positionCentre2, taillePlus, gc);
                break;

            case "canvaFou" :
                dessinFou(color1, positionx, positiony, rotation, taille, positionCentre, positionCentre2, taillePlus, gc);
                break;
        }


    }

    private void dessinCheval(Color color1, int positionx, int positiony, int rotation, int taille, double positionCentre, double positionCentre2, int taillePlus, GraphicsContext gc) {
        gc.clearRect(100,100,100,100);
        gc.setFill(color1);
        gc.fillOval(positionCentre -2, positionCentre -2, taille + taillePlus +4  , taille + taillePlus +4);
        gc.setFill(Color.DARKGREEN);
        gc.fillOval(positionCentre, positionCentre, taille + taillePlus, taille + taillePlus);


        gc.setFill(color1);
        gc.rotate(rotation);
        gc.fillRect(positionx -2, positiony -2, taille -3.5+4  , taille -3.5+4);
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(positionx, positiony, taille -3.5, taille -3.5);

        gc.rotate(-rotation);

        gc.setFill(color1);
        gc.fillOval(positionCentre2 -6.5, positionCentre2 -2, taille - taillePlus +4  , taille - taillePlus +4);
        gc.setFill(Color.GREEN);
        gc.fillOval(positionCentre2 -4.5, positionCentre2, taille - taillePlus, taille - taillePlus);


        gc.setFill(color1);
        gc.fillRect(positionCentre2 -3, positionCentre2 -12,8+4  ,25+6);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2 -1, positionCentre2 -10,8  ,25);
    }

    private void dessinFou(Color color1, int positionx, int positiony, int rotation, int taille, double positionCentre, double positionCentre2, int taillePlus, GraphicsContext gc) {
        gc.clearRect(100,100,100,100);
        gc.setFill(color1);
        gc.fillOval(positionCentre -2, positionCentre -2, taille + taillePlus +4  , taille + taillePlus +4);
        gc.setFill(Color.DARKGREEN);
        gc.fillOval(positionCentre, positionCentre, taille + taillePlus, taille + taillePlus);


        gc.setFill(color1);
        gc.rotate(rotation);
        gc.fillRect(positionx -2, positiony -2, taille -3.5+4  , taille -3.5+4);
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(positionx, positiony, taille -3.5, taille -3.5);

        gc.rotate(-rotation);

        gc.setFill(color1);
        gc.fillOval(positionCentre2 -6.5, positionCentre2 -7, taille - taillePlus +4  , taille - taillePlus +4);
        gc.setFill(Color.GREEN);
        gc.fillOval(positionCentre2 -4.5, positionCentre2-5, taille - taillePlus, taille - taillePlus);


        gc.setFill(color1);
        gc.fillOval(positionCentre2 -3, positionCentre2 -4,8+4  ,8+4);
        gc.setFill(Color.GREEN);
        gc.fillOval(positionCentre2-1 , positionCentre2 -2,8  ,8);
    }

    private void dessinTour(Color color1, int positionx, int positiony, int rotation, int taille, double positionCentre, double positionCentre2, int taillePlus, GraphicsContext gc) {
        gc.clearRect(100,100,100,100);
        gc.setFill(color1);
        gc.fillOval(positionCentre -2, positionCentre -2, taille + taillePlus +4  , taille + taillePlus +4);
        gc.setFill(Color.DARKGREEN);
        gc.fillOval(positionCentre, positionCentre, taille + taillePlus, taille + taillePlus);


        gc.setFill(color1);
        gc.rotate(rotation);
        gc.fillRect(positionx -2, positiony -2, taille -3.5+4  , taille -3.5+4);
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(positionx, positiony, taille -3.5, taille -3.5);

        gc.rotate(-rotation);

        gc.setFill(color1);
        gc.fillOval(positionCentre2 -10, positionCentre2 -10, taille - 4 +4  , taille - 4 +4);
        gc.setFill(Color.GREEN);
        gc.fillOval(positionCentre2 -8, positionCentre2-8, taille - 4, taille - 4);


        gc.setFill(color1);
        gc.fillRect(positionCentre2 -1.5, positionCentre2 -12,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2+0.5 , positionCentre2-10 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionCentre2 -1.5, positionCentre2 +10,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2+0.5 , positionCentre2 + 12 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionCentre2 -12, positionCentre2 -1.5,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2-10 , positionCentre2+0.5 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionCentre2 +10, positionCentre2 -1.5,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2+12 , positionCentre2 + 0.5 ,4  ,4);

        gc.rotate(45);

        gc.setFill(color1);
        gc.fillRect(positionx+7 , positiony -4,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+9 , positiony-2 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx-4 , positiony +7,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx-2, positiony +9,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx+7 , positiony +17,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+9, positiony+19 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx+17 , positiony +7,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+19, positiony +9  ,4  ,4);

        gc.rotate(-90);


        gc.setFill(color1);
        gc.fillRect(positionx+7 , positiony -1.5,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+9 , positiony+0.5 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx-1.5 , positiony +7,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+0.5, positiony +9 ,4  ,4);


    }


    private void dessinReine(Color color1, int positionx, int positiony, int rotation, int taille, double positionCentre, double positionCentre2, int taillePlus, GraphicsContext gc) {
        gc.clearRect(100,100,100,100);
        gc.setFill(color1);
        gc.fillOval(positionCentre -2, positionCentre -2, taille + taillePlus +4  , taille + taillePlus +4);
        gc.setFill(Color.DARKGREEN);
        gc.fillOval(positionCentre, positionCentre, taille + taillePlus, taille + taillePlus);


        gc.setFill(color1);
        gc.rotate(rotation);
        gc.fillRect(positionx -2, positiony -2, taille -3.5+4  , taille -3.5+4);
        gc.setFill(Color.DARKGREEN);
        gc.fillRect(positionx, positiony, taille -3.5, taille -3.5);

        gc.rotate(-rotation);

        gc.setFill(color1);
        gc.fillOval(positionCentre2 -10, positionCentre2 -10, taille - 4 +4  , taille - 4 +4);
        gc.setFill(Color.GREEN);
        gc.fillOval(positionCentre2 -8, positionCentre2-8, taille - 4, taille - 4);


        gc.setFill(color1);
        gc.fillRect(positionCentre2 -1.5, positionCentre2 -12,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2+0.5 , positionCentre2-10 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionCentre2 -1.5, positionCentre2 +10,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2+0.5 , positionCentre2 + 12 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionCentre2 -12, positionCentre2 -1.5,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2-10 , positionCentre2+0.5 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionCentre2 +10, positionCentre2 -1.5,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionCentre2+12 , positionCentre2 + 0.5 ,4  ,4);

        gc.rotate(45);

        gc.setFill(color1);
        gc.fillRect(positionx+7 , positiony -4,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+9 , positiony-2 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx-4 , positiony +7,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx-2, positiony +9,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx+7 , positiony +17,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+9, positiony+19 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx+17 , positiony +7,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+19, positiony +9  ,4  ,4);

        gc.rotate(-90);


        gc.setFill(color1);
        gc.fillRect(positionx+7 , positiony -1.5,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+9 , positiony+0.5 ,4  ,4);

        gc.setFill(color1);
        gc.fillRect(positionx-1.5 , positiony +7,4+4  ,4+4);
        gc.setFill(Color.GREEN);
        gc.fillRect(positionx+0.5, positiony +9 ,4  ,4);

        gc.setFill(color1);
        gc.fillOval(positionx-49.5, positionx+5,8+4  ,8+4);
        gc.setFill(Color.GREEN);
        gc.fillOval(positionx-47.5 , positionx+7,8  ,8);
    }

    public void changePion(MouseEvent mouseEvent) {
        System.out.printf(mouseEvent.getPickResult().getIntersectedNode().getId());
        switch (mouseEvent.getPickResult().getIntersectedNode().getId()){
            case "canvaCheval":
                changeEnPion("le Cheval");
                close(canvaCheval);
                break;
            case "canvaTour":
                changeEnPion("la tour");
                close(canvaTour);
                break;
            case "canvaReine":
                changeEnPion("la reine");
                close(canvaReine);
                break;
            case "canvaFou":
                changeEnPion("le fou");
                close(canvaFou);

                break;
        }
    }
    public void close(Canvas bouton){
        Stage stage = (Stage) bouton.getScene().getWindow();
        stage.close();
    }

    public void changeEnPion(String pion){
        System.out.printf("\nVous avez choisi " + pion);
        //on doit ici changer le pion
    }


}

