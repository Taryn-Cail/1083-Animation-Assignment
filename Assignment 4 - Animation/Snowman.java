import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;


/****************************************************************************************
 * CS1083 - Assignment 3 - Snowman
 * 
 * Purpose: To create a snowman on grass with a button that changes the 
 *          scene from day to night.
 *          
 * @author - Taryn Cail
 * @version - 1.0
 * @date - February 15th, 2024
 ***************************************************************************************/
 
 public class Snowman extends Application
 {
    /*********************************************************************
     * Method: Start
     * 
     * Purpose: To layout my landscape, draw my snowman and present my
     *          stage.
     ********************************************************************/
    @Override
    public void start(Stage primaryStage)
    {
        // Creating my BorderPane which will be my main layout
        BorderPane myLayout = new BorderPane();
        
        // Setting it's original color to light Blue (aka Daytime)
        myLayout.setStyle("-fx-background-color: lightblue;");
        
        // Creating my StackPane for my layout
        Pane landscape = new Pane();
        
        /**************************************************
         * Creating my Button
         * 
         * Purpose: When clicked changes from night to day
         *          and vice-versa.
         **************************************************/
         Button timeButton = new Button("Day");
         timeButton.setOnAction(event ->
         {
             if (timeButton.getText().equals("Night"))
             {
                 myLayout.setStyle("-fx-background-color: lightblue;");
                 timeButton.setText("Day");
             }
             else if (timeButton.getText().equals("Day"))
             {
                 myLayout.setStyle("-fx-background-color: black;");
                 timeButton.setText("Night");
             }
             else
             {
                 timeButton.setText("End of the World");
                 myLayout.setStyle("-fx-background-color: red;");
             }
         }
         );
         
         
         
         
        /**************************************************
         * Creating the Colors for my Snowman and Landscape
         *  -> Mountains RGB: (64, 66, 66)
         *  -> First layer of grass RGB: (2, 41, 6)
         *  -> Second layer of grass RGB: (3, 64, 9)
         *  -> Third layer of grass RGB: (7, 82, 15)
         *  -> Front layer of grass RGB: (12, 92, 20)
         *  -> Scarf Color RGB: (163, 24, 20)
         *  -> Carrot Color RGB: (207, 127, 0)
         **************************************************/
         // Mountain Colors
         Color mountainColor = Color.rgb(64, 66, 66);
         Color firstLayerColor = Color.rgb(2, 41, 6);
         Color secondLayerColor = Color.rgb(3, 64, 9);
         Color thirdLayerColor = Color.rgb(7, 82, 15);
         Color frontLayerColor = Color.rgb(12, 92, 20);
         // Snowman Colors
         Color scarfColor = Color.rgb(163, 24, 20);
         Color carrotColor = Color.rgb(207, 127, 0);
         
         
         
         
         
        /***********************************************
         * Creating my landscape and mountains
         * Layout in order:
         *  -> Mountains
         *  -> First layer of grass
         *  -> Second layer of grass
         *  -> Third layer of grass
         *  -> Front layer of grass
         *************************************************/
         // Creating Mountains
         Polygon mountains = new Polygon();
         mountains.getPoints().addAll
         (
            0.0, 150.0,
            50.0, 125.0,
            100.0, 140.0,
            200.0, 100.0,
            250.0, 125.0,
            300.0, 50.0,
            370.0, 100.0,
            400.0, 85.0,
            450.0, 125.0,
            500.0, 75.0,
            500.0, 300.0,
            0.0, 300.0,
            0.0, 150.0
         );
         mountains.setFill(mountainColor);
         
         // Creating my First Layer of grass
         Polygon firstLayer = new Polygon();
         firstLayer.getPoints().addAll
         (
             0.0, 197.0,
             25.0, 195.0,
             50.0, 193.0,
             75.0, 195.0,
             100.0, 197.0,
             125.0, 202.0,
             150.0, 205.0,
             175.0, 208.0,
             200.0, 210.0,
             225.0, 212.0,
             250.0, 215.0,
             275.0, 217.0,
             300.0, 219.0,
             325.0, 220.0,
             350.0, 222.0,
             370.0, 224.0,
             370.0, 300.0,
             0.0, 300.0,
             0.0, 197.0
        );
        firstLayer.setFill(firstLayerColor);
        
        // Creating my Second Layer of Grass
        Polygon secondLayer = new Polygon();
         secondLayer.getPoints().addAll
         (
             0.0, 247.0,
             25.0, 248.0,
             50.0, 249.0,
             75.0, 250.0,
             100.0, 252.0,
             125.0, 250.0,
             150.0, 249.0,
             175.0, 248.0,
             200.0, 245.0,
             225.0, 243.0,
             250.0, 240.0,
             275.0, 238.0,
             300.0, 235.0,
             325.0, 233.0,
             350.0, 230.0,
             370.0, 224.0,
             400.0, 217.0,
             425.0, 210.0,
             450.0, 204.0,
             475.0, 195.0,
             500.0, 185.0,
             500.0, 400.0,
             0.0, 400.0,
             0.0, 297.0
        );
        secondLayer.setFill(secondLayerColor);
        
        // Creating my third Layer of grass
         Polygon thirdLayer = new Polygon();
         thirdLayer.getPoints().addAll
         (
             0.0, 297.0,
             25.0, 295.0,
             50.0, 293.0,
             75.0, 295.0,
             100.0, 297.0,
             125.0, 302.0,
             150.0, 305.0,
             175.0, 308.0,
             200.0, 310.0,
             225.0, 312.0,
             250.0, 315.0,
             275.0, 317.0,
             300.0, 319.0,
             325.0, 320.0,
             350.0, 322.0,
             370.0, 320.0,
             370.0, 319.0,
             400.0, 315.0,
             425.0, 310.0,
             450.0, 305.0,
             475.0, 300.0,
             500.0, 295.0,
             500.0, 500.0,
             0.0, 500.0,
             0.0, 297.0
        );
        thirdLayer.setFill(thirdLayerColor);
        
        // Creating my front Layer of grass
         Polygon frontLayer = new Polygon();
         frontLayer.getPoints().addAll
         (
             0.0, 397.0,
             25.0, 395.0,
             50.0, 393.0,
             75.0, 390.0,
             100.0, 387.0,
             125.0, 384.0,
             150.0, 380.0,
             175.0, 377.0,
             200.0, 373.0,
             225.0, 370.0,
             250.0, 365.0,
             275.0, 360.0,
             300.0, 358.0,
             325.0, 358.0,
             350.0, 359.0,
             370.0, 360.0,
             370.0, 361.0,
             400.0, 362.0,
             425.0, 363.0,
             450.0, 365.0,
             475.0, 367.0,
             500.0, 370.0,
             500.0, 500.0,
             0.0, 500.0,
             0.0, 397.0
        );
        frontLayer.setFill(frontLayerColor);
    
        
        
        /**************************************************
         * Creating my Snowman
         * Layout in order:
         *  -> 3 circles for the body (white)
         *  -> 2 rectangles for the scarf (scarfColor)
         *  -> two circles for the eyes (black)
         *  -> triangle for the carrot nose (carrotColor)
         *  -> 3 smaller circles for the buttons (black)
         *  -> 2 lines for arms (brown)
         *  -> Snowman shadow (dark grey)
         **************************************************/
        // Creating the head
        Circle head = new Circle(400, 330, 17);
        head.setFill(Color.WHITE);
        // Creating the middle
        Circle middle = new Circle(400, 365, 25);
        middle.setFill(Color.WHITE);
        // Creating the bottom
        Circle bottom = new Circle(400, 410, 35);
        bottom.setFill(Color.WHITE);
        
        
        // Creating the scarf that goes around the neck
        Rectangle scarf = new Rectangle(385, 335, 33, 10);
        scarf.setFill(scarfColor);
        // Creating the scarf part that hangs down
        Rectangle scarf2 = new Rectangle(382, 335, 10, 30);
        scarf2.setFill(scarfColor);
        
        
        // Creating the left eye
        Circle leftEye = new Circle(394, 326, 2);
        leftEye.setFill(Color.BLACK);
        // Creating the right eye
        Circle rightEye = new Circle(406, 326, 2);
        rightEye.setFill(Color.BLACK);
        
        
        // Creating the Carrot nose
        Polygon nose =  new Polygon();
        nose.getPoints().addAll
        (
            400.0, 328.0,
            410.0, 331.0,
            400.0, 334.0,
            400.0, 329.0
        );
        nose.setFill(carrotColor);
        
        
        // Creating the left arm
        Polyline leftArm = new Polyline();
        leftArm.getPoints().addAll
        (
            375.0, 365.0,
            360.0, 350.0
        );
        leftArm.setStroke(Color.BROWN);
        leftArm.setStrokeWidth(5);
        // Creating the right arm
        Polyline rightArm = new Polyline();
        rightArm.getPoints().addAll
        (
            425.0, 365.0,
            440.0, 350.0
        );
        rightArm.setStroke(Color.BROWN);
        rightArm.setStrokeWidth(5);
        
        
        // Creating the top button
        Circle topButton = new Circle(400, 365, 2);
        topButton.setFill(Color.BLACK);
        // Creating the middle button
        Circle middleButton = new Circle(400, 380, 2);
        middleButton.setFill(Color.BLACK);
        // Creating the middle button
        Circle bottomButton = new Circle(400, 395, 2);
        bottomButton.setFill(Color.BLACK);
        
        
        // Creating the shadow
        Ellipse shadow = new Ellipse(400, 445, 40, 4);
        shadow.setFill(Color.BLACK);
        
        
        
        /***************************************************
         * Adding everything to the StackPane
         **************************************************/
        // Adding the mountains and grass layers
        landscape.getChildren().addAll(mountains, firstLayer, secondLayer, thirdLayer, frontLayer);
        // Adding the left and right arms
        landscape.getChildren().addAll(leftArm, rightArm);
        // Adding the shadow
        landscape.getChildren().addAll(shadow);
        // Adding the snowman's body
        landscape.getChildren().addAll(head, middle, bottom);
        // Addign the scarf
        landscape.getChildren().addAll(scarf, scarf2);
        // Adding the eyes and nose
        landscape.getChildren().addAll(leftEye, rightEye, nose);
        // Adding the buttons
        landscape.getChildren().addAll(topButton, middleButton, bottomButton);
        
        
        
        /****************************************************
         * Adding the landscape and button to my BorderPane
         ***************************************************/
        myLayout.setTop(timeButton);
        myLayout.setCenter(landscape);
        
        
        // Creating my scene and displaying it
        Scene myScene = new Scene(myLayout, 500, 500);
        primaryStage.setScene(myScene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Snowman");
        primaryStage.show();
    }
 }