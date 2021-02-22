package application;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.GridPane;

public class Echiquier {
    Canvas canva[][];
    GridPane grid;
    Piece pieceNoir[];
    Piece pieceBlanc[];

    public Echiquier(Canvas canva[][],GridPane grid,Piece pieceNoir[],Piece pieceBlanc[] ){
        this.canva = canva;
        this.grid = grid;
        this.pieceNoir = pieceNoir;
        this.pieceBlanc = pieceBlanc;
    }





}
