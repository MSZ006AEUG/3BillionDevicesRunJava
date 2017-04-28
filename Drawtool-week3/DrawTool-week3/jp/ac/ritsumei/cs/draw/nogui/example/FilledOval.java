/*
 * An example answer
 */

package jp.ac.ritsumei.cs.draw.nogui.example;

/**
 * Represents a filled oval.
 */
public class FilledOval extends Oval {
    
    /**
     * The constant value of the name of this figure.
     */
    public static final String name = "FilledOval";
    
    /**
     * Creates a new, empty object.
     */
    public FilledOval() {
        super();
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Figure createClone() {
        Figure figure = new FilledOval();
        figure.setStart(startX, startY);
        figure.setEnd(endX, endY);
        return figure;
    }
}
