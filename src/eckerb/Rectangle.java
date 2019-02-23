/*
 * CS1021 - 051
 * Winter 2018-2019
 * Lab 4 - Inheritance with Shapes
 * Name: Brendan Ecker
 * Created: 12/13/2018
 */
package eckerb;

import edu.msoe.winplotterfx.WinPlotterFX;
import javafx.scene.paint.Color;

/**
 * The Rectangle class that draws a rectangle with a desired height and width,
 * where the bottom left corner is at a desired x,y coordinate.
 * */
public class Rectangle extends Shape {
    protected final double height;
    protected final double width;

    /**
     * Constructor
     *
     * @param x         The x coordinate of the bottom left corner.
     * @param y         The y coordinate of the bottom left corner.
     * @param width     The width of the rectangle.
     * @param height    The height of the rectangle.
     * @param color     The color of the rectangle.
     */
    public Rectangle(double x, double y, double width, double height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    /**
     * Draws a rectangle where the bottom left rectangle is at a desired
     * x,y coordinate.
     *
     * @param plotter   A WinPlotterFX that was created in the
     *                  ShapeCreatorApp
     */
    @Override
    public void draw(WinPlotterFX plotter) {
        setPenColor(plotter);
        plotter.moveTo(x, y);
        plotter.drawTo(x, y + height);
        plotter.drawTo(x + width, y + height);
        plotter.drawTo(x + width, y);
        plotter.drawTo(x, y);
    }
}
