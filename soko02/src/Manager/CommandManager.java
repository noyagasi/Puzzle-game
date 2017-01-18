package Manager;

import java.util.HashMap;

import Commands.*;
import Levels.SokobanGame;

public class CommandManager {

	HashMap<String, Command> commands;
	
	/*
	 * this is the hashMap that maps between the word was given to us from the user and the right command
	 */
	public CommandManager(SokobanGame sokobanGame) {
		commands = new HashMap<String, Command>();
		commands.put("display", new DisplayLevelCommand(sokobanGame));
		commands.put("exit", new ExitCommand());
		commands.put("load", new LoadLevelCommand(sokobanGame));
		commands.put("move", new MoveCommand(sokobanGame));
		commands.put("save", new SaveLevelCommand(sokobanGame));

	}
	//this func returns the command by the right word
	public Command getCommand(String commandName) {
		return commands.get(commandName);
	}
}
