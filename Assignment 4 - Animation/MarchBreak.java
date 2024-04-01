import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;



/*****************************************************************************
 * CS1083 - Assignment 3 - March Break Actvity
 * 
 * Purpose: To create an animated scene of your favorite march break activity.
 *          Mine is me and my siblings winning a fortnite game, alongside our
 *          dog Ellie.
 * 
 * @author - Taryn Cail
 * @version - 1.0
 * @date - February 15th, 2024
 *****************************************************************************/
 
 public class MarchBreak extends Application
 {
    /*********************************************************************
     * Method: Start
     * 
     * Purpose: To layout my scene and start the animation
     ********************************************************************/
     public void start(Stage primaryStage)
    {
        // Creating my main Layout which will hold everything
        StackPane mainLayout = new StackPane();
        mainLayout.setStyle("-fx-background-color: #d6c6b0;");
        
        // Creating my Border Pane which will hold my people and TV
        BorderPane layout = new BorderPane();
        
        // Creating a Stack Pane which will be used to create the TV
        StackPane myTVStack = new StackPane();
        
        // Creating my HBox for my people and dog
        HBox personBox = new HBox();
        personBox.setSpacing(50);
        
        
        /*******************************************
         * Creating my decorations for the House
         * This will go in the mainLayout StackPane
         * -> TV
         * -> Floor
         * -> Carpet
         *****************************************/
        // Creating the outter rim of my TV
        Rectangle backOfTV = new Rectangle(515, 190);
        backOfTV.setStyle("-fx-fill: black;");
        
        // Creating my TV screen which is an image
        Image myTVImage = new Image("tvscreen.png");
        ImageView myTVImageView = new ImageView(myTVImage);
        myTVImageView.setFitWidth(500);
        myTVImageView.setFitHeight(300);
        myTVImageView.setPreserveRatio(true);
        
        // Creating my TV in my stackpane
        myTVStack.getChildren().addAll(backOfTV, myTVImageView);
        
        // Creating the floor
        Rectangle floor = new Rectangle(0, 500, 650, 115);
        floor.setFill(Color.rgb(97, 75, 46));
        
        // Creating the carpet
        Ellipse carpet = new Ellipse(325, 605, 250, 40);
        carpet.setFill(Color.rgb(93, 157, 186));
        

        
        
        /*****************************************
         * Adding my objects to my Pane's
         ****************************************/
        // Centering my TV in the top of my BorderPane
        layout.setAlignment(myTVStack, javafx.geometry.Pos.CENTER);
        layout.setTop(myTVStack);
        
        // Adding insets so the TV isn't against the window
        BorderPane.setMargin(myTVStack, new Insets(20));
        
        // Adding my HBox to the center of my borderpane
        layout.setCenter(personBox);
        BorderPane.setAlignment(personBox, javafx.geometry.Pos.CENTER);
        Insets insets = new Insets(100, 0, 0, 110);
        BorderPane.setMargin(personBox, insets);
        
        // Adding my decorations to the mainLayout
        mainLayout.getChildren().addAll(floor, carpet, layout);
        
        // Centering my floor and carpet
        StackPane.setAlignment(floor, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(carpet, Pos.BOTTOM_CENTER);
        
        // Adding Insets to my carpet so it's not against the edge of the window
        StackPane.setMargin(carpet, new Insets(0, 0, 20, 0));  
        
        
        
        
        
        /*****************************************
         * Creating my Animation for my people
         * -> Changing every 1 seconds
         ****************************************/
        Timeline myTimeline1 = new Timeline 
        (    
            new KeyFrame (Duration.seconds(0), event ->
            {
                personBox.getChildren().clear();
                Person taryn = new Person(0, 0, Color.PURPLE);
                Person hailey = new Person(0, 0, Color.GREEN);
                Person alysa = new Person(0, 0, Color.PINK);
                Dog ellie = new Dog(0,0);
                HBox.setMargin(taryn, new Insets(30, 0, 10, 0));
                HBox.setMargin(hailey, new Insets(10, 0, 30, 0));
                HBox.setMargin(alysa, new Insets(30, 0, 10, 0));
                HBox.setMargin(ellie, new Insets(50, 0, 0, 0));
                personBox.getChildren().addAll(ellie, taryn, hailey, alysa);
            }
        ),
            new KeyFrame (Duration.seconds(1), event ->
            {
                personBox.getChildren().clear();
                Person taryn = new Person(0, 0, Color.PURPLE);
                Person hailey = new Person(0, 0, Color.GREEN);
                Person alysa = new Person(0, 0, Color.PINK);
                Dog ellie = new Dog(0,0);
                HBox.setMargin(taryn, new Insets(10, 0, 30, 0));
                HBox.setMargin(hailey, new Insets(30, 0, 10, 0));
                HBox.setMargin(alysa, new Insets(10, 0, 30, 0));
                HBox.setMargin(ellie, new Insets(70, 0, 0, 0));
                personBox.getChildren().addAll(ellie, taryn, hailey, alysa);
            }
        ),
            new KeyFrame (Duration.seconds(2), event ->
            {
                personBox.getChildren().clear();
                Person taryn = new Person(200, 100, Color.PURPLE);
                Person hailey = new Person(200, 100, Color.GREEN);
                Person alysa = new Person(200, 100, Color.PINK);
                Dog ellie = new Dog(0,0);
                HBox.setMargin(taryn, new Insets(30, 0, 10, 0));
                HBox.setMargin(hailey, new Insets(10, 0, 30, 0));
                HBox.setMargin(alysa, new Insets(30, 0, 10, 0));
                HBox.setMargin(ellie, new Insets(50, 0, 0, 0));
                personBox.getChildren().addAll(ellie, taryn, hailey, alysa);
            }
        ));
        myTimeline1.setCycleCount (myTimeline1.INDEFINITE);
        myTimeline1.play(); 
        
        
        
        
        
        /*****************************************
         * Setting my scene
         *****************************************/
        Scene myScene = new Scene(mainLayout, 650, 550);
        primaryStage.setScene(myScene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("March Break Activity");
        primaryStage.show();
    }
}