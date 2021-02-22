package application;


import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Piece {
    int x,y;
    String nom;
    Canvas canva;
    GridPane grid;

    public Piece(String nom,int x,int y,Canvas canva,GridPane grid){
        this.x = x;
        this.y = y;
        this.nom = nom;
        this.canva = canva;
        this.grid = grid;
    }

    public Piece(String nom,int x,int y,GridPane grid){
        this.x = x;
        this.y = y;
        this.nom = nom;
        this.grid = grid;
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


}
