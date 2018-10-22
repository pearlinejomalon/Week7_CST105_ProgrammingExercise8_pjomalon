/*
 * Program: Exercise 3 from Chapter 14 in textbook
 * File: Exercise3.java
 * Summary: Display three cards
 * Author: Pearl Jomalon
 * Date: October 21, 2018
 */
package exercise.pkg3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Exercise3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
            
            //random selection of cards
            int rand1 = (int)(Math.random() * 53);
            int rand2 = (int)(Math.random() * 53);
            int rand3 = (int)(Math.random() * 53);
        
        //displaying image of cards
        Image card1 = new Image("deck/" + rand1 + ".png");
        Image card2 = new Image("deck/" + rand2 + ".png");
        Image card3 = new Image("deck/" + rand3 + ".png");
        
            //set up screen display
            Pane pane = new HBox(10);
            pane.setPadding(new Insets(5,5,5,5));
            ImageView firstcard = new ImageView(card1);
            ImageView secondcard = new ImageView(card2);
            ImageView thirdcard = new ImageView(card3);
            pane.getChildren().addAll(firstcard, secondcard, thirdcard);
            
            Scene scene = new Scene(pane);
            primaryStage.setTitle("Three Cards from Deck");
            primaryStage.setWidth(150);
            primaryStage.setHeight(150);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
