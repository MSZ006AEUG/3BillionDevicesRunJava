/*
 * Test code for the class FilledRect
 */

package jp.ac.ritsumei.cs.draw.nogui.test;

import static org.junit.Assert.*;
import org.junit.Test;
import jp.ac.ritsumei.cs.draw.nogui.*;

public class FilledRectTest {
    
    @Test
    public void testFilledRect1() {
        Figure figure = new FilledRect();
        figure.setStart(100, 110);
        figure.setEnd(150, 120);
        
        check(figure);
    }
    
    @Test
    public void testFilledRect2() {
        Figure figure = new FilledRect();
        figure.setStart(100, 120);
        figure.setEnd(150, 110);
        
        check(figure);
    }
    
    @Test
    public void testFilledRect3() {
        Figure figure = new FilledRect();
        figure.setStart(150, 110);
        figure.setEnd(100, 120);
        
        check(figure);
    }
    
    @Test
    public void testFilledRect4() {
        Figure figure = new FilledRect();
        figure.setStart(150, 120);
        figure.setEnd(100, 110);
        
        check(figure);
    }
    
    private void check(Figure figure) {
        assertTrue(figure.getName().equals("FilledRect"));
        assertEquals(100, figure.getLeft());
        assertEquals(110, figure.getTop());
        assertEquals(150, figure.getRight());
        assertEquals(120, figure.getBottom());
        assertEquals(50, figure.getWidth());
        assertEquals(10, figure.getHeight());
    }
    
    @Test
    public void testFilledRect5() {
        Figure figure = new FilledRect();
        figure.setStart(100, 110);
        figure.setEnd(150, 120);
        
        Figure clone = figure.createClone();
        
        assertTrue(clone.getName().equals(figure.getName()));
        assertTrue(clone.getLeft() == figure.getLeft());
        assertTrue(clone.getTop() == figure.getTop());
        assertTrue(clone.getRight() == figure.getRight());
        assertTrue(clone.getBottom() == figure.getBottom());
        assertTrue(clone.getWidth() == figure.getWidth());
        assertTrue(clone.getHeight() == figure.getHeight());
    }
}
