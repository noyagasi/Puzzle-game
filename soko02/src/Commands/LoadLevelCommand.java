package Commands;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import LevelLoaders.LevelLoader;
import Levels.SokobanGame;
import Manager.LevelLoaderFactory;

public class LoadLevelCommand implements Command {

	SokobanGame sokobanGame;
	
	public LoadLevelCommand(SokobanGame game) {
		sokobanGame = game;
	}

	@Override
	public void execute(String[] args) {
		String thePathToLoad = args[0]; // create a new string and puts the secend array from the CLI in(the name of the file we want to load
		String[] arrPath = new String[2]; //create a new array
		arrPath = thePathToLoad.split("\\."); // split the word that we got from the array in the CLI by the dot for us to know the type of the file
		String secondLoadWord = arrPath[1];
		
		LevelLoaderFactory levelLoaderFactory = new LevelLoaderFactory();
		LevelLoader levelLoader = levelLoaderFactory.createLoader(secondLoadWord);
		InputStream is = null;
		try {
			is = new FileInputStream(thePathToLoad);
			sokobanGame.addLevel(levelLoader.loadLevel(is));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
