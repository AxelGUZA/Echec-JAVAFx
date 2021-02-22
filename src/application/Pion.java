package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Pion extends Piece{
    @FXML
    private Canvas canvaPion = new Canvas();

    public Pion(int x, int y, GridPane grid) {
        super("pion",x,y,grid);
        greenCase(this.canvaPion);
        grid.getChildren().add(canvaPion);
        grid.setRowIndex(canvaPion,x);
        grid.setColumnIndex(canvaPion,y);


    }

    public void deplacement(){
        this.setY(this.getY()+1);

    }



    public void whereIAm(){
        //getNodeFromGridPane(this.grid,4,4);
        //System.out.print(this.grid.getChildren());
        //System.out.print(this.grid.toString());
    }



    @FXML
    public void greenCase(Canvas canva){
        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.setFill(Color.GREEN);
        gc.fillOval(10,10,35 ,35);
        //this.canva0x0.setStyle("-fx-background-color: black");

    }


}
