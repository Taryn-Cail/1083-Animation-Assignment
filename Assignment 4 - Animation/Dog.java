import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Polygon;
import javafx.scene.Group;
import javafx.scene.Node;

/*****************************************************************************
 * CS1083 - Assignment 3 - Ellie Class
 * 
 * @author - Taryn Cail
 * @version - 1.0
 * @date - February 17th, 2024
 ****************************************************************************/
public class Dog extends Group
{
    // Instance Data
    
    // Constructor
    public Dog(int x, int y) 
    {
        // Create the tail
        Polygon tail = new Polygon();
        tail.getPoints().addAll
        (
            x + 50.0, y + 65.0,
            x + 35.0, y + 55.0,
            x + 40.0, y + 77.0,
            x + 50.0, y + 65.0
        );
        tail.setFill(Color.BLACK);
        
        // Creating the front leg
        Rectangle frontLeg = new Rectangle(x + 93, y + 80, 16, 55);
        frontLeg.setArcWidth(10);
        frontLeg.setArcHeight(10);
        frontLeg.setFill(Color.BLACK);
        // Creating the back leg
        Rectangle backLeg = new Rectangle(x + 40, y + 80, 15, 55);
        backLeg.setArcWidth(10);
        backLeg.setArcHeight(10);
        backLeg.setFill(Color.BLACK);
        
        // Create the neck 
        Polygon neck = new Polygon();
        neck.getPoints().addAll
        (
            x + 90.0, y + 45.0,
            x + 102.0, y + 50.0,
            x + 102.0, y + 80.0,
            x + 80.0, y + 80.0,
            x + 100.0, y + 45.0
        );
        neck.setFill(Color.BLACK);
        
        // Create the body
        Rectangle body = new Rectangle(x + 40, y + 65, 70, 40);
        body.setArcWidth(20);
        body.setArcHeight(20);
        body.setFill(Color.BLACK);
        
        // Create the ears
        Polygon rightEar = new Polygon();
        rightEar.getPoints().addAll
        (
            x + 102.0, y + 32.0,
            x + 90.0, y + 18.0,
            x + 86.0, y + 40.0
        );
        rightEar.setFill(Color.BLACK);
        
        // Create the mouth
        Rectangle mouth = new Rectangle(x + 100, y + 44, 28, 15);
        mouth.setArcWidth(10);
        mouth.setArcHeight(10);
        mouth.setFill(Color.BLACK);
        
        // Create the head
        Circle head = new Circle(x + 100, y + 45, 15);
        head.setFill(Color.BLACK);
        
        // Create the eye
        Circle eye = new Circle(x + 102, y + 43, 3);
        eye.setFill(Color.WHITE);
        
        // Adding everything to my scene
        getChildren().addAll(tail, neck, frontLeg, backLeg, body, rightEar, mouth, head, eye);
    }
}
