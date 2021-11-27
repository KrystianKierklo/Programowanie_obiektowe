package pl.imiajd.kierklo;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int height, int width, int x, int y){
        super.setSize(height, width);
        super.setLocation(x, y);
    }

    public int getPerimeter(){
        return (2 * super.height + 2 * super.width);
    }

    public int getArea(){
        return (super.height * super.width);
    }
}
