package Commands;

import Levels.SokobanGame;
import Manager.LevelConverter;

public class DisplayLevelCommand implements Command {

	SokobanGame sokobanGame;
	
	public DisplayLevelCommand(SokobanGame game) {
		sokobanGame = game;
	}

	@Override
	public void execute(String[] args) {
		LevelConverter levelConverter = new LevelConverter();
		String levelString = levelConverter.displayLevel(sokobanGame.getCurrentLevel());
		System.out.println(levelString);
	}

}
