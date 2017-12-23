/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invincibagel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author chowd
 */
public class InvinciBagel extends Application {
    Scene scene;
    StackPane root;
    Image splashScreen, instructionLayer, legalLayer, scoreLayer;
    ImageView splashScreenBackplate, splashScreenTextArea;
    Button gameButton, helpButton, scoreButton, legalButton;
    HBox buttonContainer;
    Insets buttonContainerPadding;
    @Override
    public void start(Stage primaryStage) {
        createSplashScreenNodes();
        addNodesToStackPane();
        primaryStage.setTitle("InvinciBagel");
        primaryStage.setScene(scene);
        primaryStage.show();
        gameButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
        helpButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                splashScreenTextArea.setImage(instructionLayer);
            }
        });
        scoreButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                splashScreenTextArea.setImage(scoreLayer);
            }
        });
        legalButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                splashScreenTextArea.setImage(legalLayer);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    private void createSplashScreenNodes(){
        root = new StackPane();
        scene = new Scene(root,640,400);
        buttonContainer = new HBox(12);
        buttonContainer.setAlignment(Pos.BOTTOM_LEFT);
        buttonContainerPadding = new Insets(0,0,10,16);
        buttonContainer.setPadding(buttonContainerPadding);
        gameButton = new Button();
        gameButton.setText("PLAY GAME");
        gameButton.setLayoutX(0);
        helpButton = new Button();
        helpButton.setText("INSTRUCTIONS");
        scoreButton = new Button();
        scoreButton.setText("HIGH SCORES");
        legalButton = new Button();
        legalButton.setText("LEGAL & CREDITS");
        buttonContainer.getChildren().addAll(gameButton,helpButton,scoreButton,legalButton);
        splashScreen = new Image("/invincibagelsplash.png",700,400,true,false,true);
        splashScreenBackplate = new ImageView();
        splashScreenBackplate.setImage(splashScreen);
        instructionLayer = new Image("/invincibagelinstruct.png",640,400,true,false,true);
        splashScreenTextArea = new ImageView();
        splashScreenTextArea.setImage(instructionLayer);
        legalLayer = new Image("/invincibagelcreds.png",640,400,true,false,true);
        scoreLayer = new Image("/invincibagelscores.png",640,400,true,false,true);
    }
    private void addNodesToStackPane(){
        root.getChildren().add(splashScreenBackplate);
        root.getChildren().add(splashScreenTextArea);
        root.getChildren().add(buttonContainer);

    }

}