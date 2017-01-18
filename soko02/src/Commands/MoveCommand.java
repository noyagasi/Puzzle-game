package Commands;

import Levels.SokobanGame;
import Policies.MySokobanPolicy;

public class MoveCommand implements Command {

	SokobanGame sokobanGame;

	public MoveCommand(SokobanGame game) {
		sokobanGame = game;
	}

	@Override
	public void execute(String[] args) {
		String theMove = args[0]; //will be like "up"
		MySokobanPolicy mySokobanPolicy = new MySokobanPolicy();
		mySokobanPolicy.Action(sokobanGame.getCurrentLevel(), theMove);
	}
}
