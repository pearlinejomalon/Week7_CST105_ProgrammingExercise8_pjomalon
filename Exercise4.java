/*
 * Program: Exercise 4 from Chapter 14 in textbook
 * File: Exercise4.java
 * Summary: Displays text vertically in differnt colors
 * Author:Pearl Jomalon
 * Date: October 21, 2018
 */
package exercise.pkg3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class Exercise4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //set up screen
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(10,10,10,10));
        
        //first text
        Text text1 = new Text("Global");
        text1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text1.setOpacity(Math.random());
        text1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text1.setRotate(90);
        text1.setTranslateY(20);
        pane.getChildren().add(text1);
        
        //second text
        Text text2 = new Text("Global");
        text2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text2.setOpacity(Math.random());
        text2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text2.setRotate(90);
        text2.setTranslateY(20);
        pane.getChildren().add(text2);
        
        //third text
        Text text3 = new Text("Global");
        text3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text3.setOpacity(Math.random());
        text3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text3.setRotate(90);
        text3.setTranslateY(20);
        pane.getChildren().add(text3);
        
        //fourth text
        Text text4 = new Text("Global");
        text4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text4.setOpacity(Math.random());
        text4.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text4.setRotate(90);
        text4.setTranslateY(20);
        pane.getChildren().add(text4);
        
        //fifth text
        Text text5 = new Text("Global");
        text5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text5.setOpacity(Math.random());
        text5.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        text5.setRotate(90);
        text5.setTranslateY(20);
        pane.getChildren().add(text5);
        
        Scene scene = new Scene(pane, 350, 150);
            primaryStage.setTitle("Text");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
