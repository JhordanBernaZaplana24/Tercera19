package laberinto;

import java.awt.*;

public class Punto {
    int x;
    int y;
    Color color;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        this.color=Color.BLACK;
    }

    public Punto(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
