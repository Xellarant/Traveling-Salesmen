package hangman;

/*
 * COMP585 Spring 2018
 * Project 3
 * Group 0
 * Kyle Rickets, Rallante Hunt, Xiaohan Yang, Yixin Chen
 * 
 * Hangman game
 * The user guesses a word by entering one letter at a time. 
 * If the user misses seven times, a hanging man hangs. 
 * User can use hint button once.
 * Once a word is finished, the user can press the Enter key to start a new game.
 * 
 * Contributions:
 * 1. Fix bugs
 * 		--Kyle Rickets, Rallante Hunt, Xiaohan Yang and Yixin Chen
 * 
 * 2. Change appearance (color, look and feel)
 * 		-- Rallante Hunt, Kyle Rickets and Xiaohan Yang
 * 
 * 3. Add additional box which shows user input 
 * 		-- Xiaohan Yang
 * 
 * 4. Fix stick figure (draw section of figure on incorrect responses) #of steps and figure must lineup
 * 		--Yixin Chen
 * 
 * 5. Make sure user can start a new game
 * 		--Kyle Rickets and Rallante Hunt
 * 
 * 6. Read in a dictionary and randomly pick a starting word 
 * 		-- Yixin Chen
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Hangman extends Application {

	@Override
	public void start(final Stage primaryStage) throws IOException {
		final Game game = new Game();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Hangman.fxml"));
		loader.setController(new GameController(game));
		Parent root = loader.load();
		Scene scene = new Scene(root, 500, 580);
		scene.getStylesheets().add(getClass().getResource("Hangman.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.getIcons().add(new Image("file:icon.png"));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
