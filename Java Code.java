import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.stage.Stage; 
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 
import javafx.scene.layout.VBox; 
import javafx.scene.Group; 
import java.io.*; 

import java.io.IOException; 
import java.util.stream.IntStream; 

public class Main extends Application { 

 public static Scene scene = null; 
 public static VBox root = new VBox(); 

 @Override 
 public void start(Stage stage) throws IOException { 
        stage.setTitle("Bound by Blocks"); 
        Button button = new Button("Spiel starten"); 
        button.setOnAction(event -> { 
            spielStarten(); 
        }); 
        button.setPadding(new Insets(10)); 
        button.setPrefWidth(250); 
        button.setPrefHeight(250);
root.getChildren().add(button); 
        Scene scene = new Scene(new Group());     
        scene.setRoot(root); 
        stage.setScene(scene); 
        stage.setFullScreen(true); 
        stage.show(); 
         
    } 
 
   public static void main(String[] args) { 
        launch(args); 
    } 
     
    public static void spielStarten() { 
        final ImageView selectedImage = new ImageView();    
        try {  
            Image image1 = new Image(new FileInputStream(System.getProperty("user.home") + "/Desktop/x.png")); 
            selectedImage.setImage(image1); 
            root.getChildren().clear(); 
            root.getChildren().addAll(selectedImage); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
} 
