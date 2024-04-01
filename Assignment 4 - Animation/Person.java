import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Node;

public class Person extends Group
{
    // Instance Data
    Color pantsColor = Color.rgb(50, 50, 200); 
    
    // Constructor
    public Person(int x, int y, Color shirtColor)
    {
        // Create the Body
        Rectangle body = new Rectangle(x + 85, y + 70, 30, 55);
        body.setFill(shirtColor);
        
        // Create the Head
        Ellipse head = new Ellipse(x + 100, y + 50, 20, 30);
        head.setFill(Color.BROWN);

        // Create the Arms
        Line leftArm = new Line(x + 90, y + 75, x + 70, y + 50);
        leftArm.setStrokeWidth(10);
        leftArm.setStroke(shirtColor);

        Line rightArm = new Line(x + 110, y + 75, x + 130, y + 50);
        rightArm.setStrokeWidth(10);
        rightArm.setStroke(shirtColor);

        // Create the Left Leg
        Rectangle leftLeg = new Rectangle(x + 85, y + 125, 11, 40);
        leftLeg.setFill(pantsColor);
        // Creating Right Leg
        Rectangle rightLeg = new Rectangle(x + 105, y + 125, 11, 40);
        rightLeg.setFill(pantsColor);
        // Creating Seam of pants
        Rectangle seam = new Rectangle(x + 87, y + 125, 26, 5);
        seam.setStrokeWidth(5);
        seam.setStroke(pantsColor);

        // Add all components to the group
        getChildren().addAll(leftLeg, rightLeg, body, leftArm, rightArm, head, seam);
    }
}
