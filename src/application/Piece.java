package application;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.Arrays;

public class Piece {
    int x,y;
    Color color;
    String nom;
    Canvas[][] canva;
    GridPane grid;
    boolean click;

    public Piece(String nom,Color color,int x,int y,Canvas[][] canva,GridPane grid){
        this.x = x;
        this.y = y;
        this.color = color;
        this.nom = nom;
        this.canva = canva;
        this.grid = grid;
        this.click = false;
    }


    public Color getColor() {
        return color;
    }

    public Canvas getCanva(){
        return this.canva[this.getX()][getY()];
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String getNom() {
        return nom;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @FXML
    public void colorCaseOval(int taille, int x, int y){
        GraphicsContext gc = this.canva[this.getX()][this.getY()].getGraphicsContext2D();
        gc.setFill(this.color);
        gc.fillOval(x,y,taille ,taille);
        //this.canva0x0.setStyle("-fx-background-color: black");

    }

    @FXML
    public void colorCaseOval(Canvas canva, int taille, int x, int y){
        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.setFill(this.color);
        gc.fillOval(x,y,taille ,taille);
        //this.canva0x0.setStyle("-fx-background-color: black");

    }
    @FXML
    public void colorCaseOval(Color color, Canvas canva, int taille, int x, int y){
        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillOval(x,y,taille ,taille);
        //this.canva0x0.setStyle("-fx-background-color: black");

    }

    @FXML
    public void colorCaseCarre(Canvas canva){
        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.clearRect(0,0,100,100);


    }

    @Override
    public String toString() {
        return "Piece{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                ", nom='" + nom + '\'' +
                ", canva=" + Arrays.toString(canva) +
                ", grid=" + grid +
                '}';
    }
    public void isClicked(boolean click){
        this.click = click;
    }

    public boolean isClicked(){
       return this.click;
    }

    public String getCanvaName(){
        return this.getCanva().getId();
    }
}
