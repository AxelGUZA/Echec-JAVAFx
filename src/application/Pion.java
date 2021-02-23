package application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Pion extends Piece{

    public Pion(int x, int y,Color color,Canvas[][] canvaPion ,GridPane grid) {
        super("pion",color,x,y,canvaPion,grid);
        this.colorCaseOval();

    }

    public void deplacement(){
        this.colorCaseCarre(this.canva[this.getX()][this.getY()],Color.BLACK,50);
        this.setX(this.getX()-1);
        this.colorCaseOval();


    }
    @FXML
    public void colorCaseOval(){
        GraphicsContext gc = this.canva[this.getX()][this.getY()].getGraphicsContext2D();
        gc.setFill(this.color);
        gc.fillOval(11,8,35 ,35);
        //this.canva0x0.setStyle("-fx-background-color: black");
    }

    @FXML
    public void colorCaseOvalSelection(){
        GraphicsContext gc = this.canva[this.getX()][this.getY()].getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillOval(11,8,36 ,36);
        gc.setFill(this.color);
        gc.fillOval(11,8,35 ,35);
        //this.canva0x0.setStyle("-fx-background-color: black");
    }









}
