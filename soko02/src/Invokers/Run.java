package Invokers;

import java.io.IOException;

import Levels.SokobanGame;

public class Run {

	public static void main(String[] args) {
		SokobanGame game = new SokobanGame(); //creates a new game
		CLI cli = new CLI(game); //puts the game inside the cli
		try {

			
			cli.listen(); //invoke listen for our game
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	


}
