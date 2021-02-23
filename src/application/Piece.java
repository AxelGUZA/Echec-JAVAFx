package application;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Piece {
    int x,y;
    Color color;
    String nom;
    Canvas[][] canva;
    GridPane grid;

    public Piece(String nom,Color color,int x,int y,Canvas[][] canva,GridPane grid){
        this.x = x;
        this.y = y;
        this.color = color;
        this.nom = nom;
        this.canva = canva;
        this.grid = grid;
    }


    public Color getColor() {
        return color;
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
    public void colorCaseCarre(Canvas canva, Color color, int taille){
        GraphicsContext gc = canva.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0,0,taille,taille);


    }


}
