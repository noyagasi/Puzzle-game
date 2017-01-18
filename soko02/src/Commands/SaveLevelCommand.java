package Commands;

import java.io.FileOutputStream;
import java.io.IOException;
import LevelSavers.LevelSaver;
import LevelSavers.MyObjectLevelSaver;
import LevelSavers.MyTextLevelSaver;
import LevelSavers.MyXmlLevelSaver;
import Levels.SokobanGame;

public class SaveLevelCommand implements Command {

	private SokobanGame sokobanGame;

	public SaveLevelCommand(SokobanGame game) {
		sokobanGame = game;
	}
	
	//this methods get the secend array from the CLI and (the name of the object that we want to save)  

	@Override
	public void execute(String[] args) {
		LevelSaver levelSaver; //we created a new levelSaver
		String thePathToSave = args[0]; //this tells us where to save the level
		String[] arrPath = new String[2];//create a new array
		arrPath = thePathToSave.split("\\."); //we split the word by a dot to know the type of the file
		try {
			if (arrPath[1].equals("txt")) {
				levelSaver = new MyTextLevelSaver();
				levelSaver.save(new FileOutputStream(thePathToSave), sokobanGame.getCurrentLevel()); //creats a new file or if the file is allready exists , and save the level in this file
			}
			if (arrPath[1].equals("obj")) {
				levelSaver = new MyObjectLevelSaver();

				levelSaver.save(new FileOutputStream(thePathToSave), sokobanGame.getCurrentLevel());
			}
			if (arrPath[1].equals("xml")) {
				levelSaver = new MyXmlLevelSaver();
				levelSaver.save(new FileOutputStream(thePathToSave), sokobanGame.getCurrentLevel());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
