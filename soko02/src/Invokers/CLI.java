package Invokers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Commands.Command;
import Displayers.CliDisplayer;
import Levels.Level;
import Levels.SokobanGame;
import Manager.CommandManager;

public class CLI {

	private SokobanGame sokobanGame;

	public CLI(SokobanGame game) {
		sokobanGame = game;
	}

	public void listen() throws IOException {
		CliDisplayer cDisplayer = new CliDisplayer();
		// create a new command cli printer
		cDisplayer.printCommandMenu(); // prints the commands
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// get input from the user
		String line = (in.readLine()).toLowerCase();
		// convets the input to one line with lower letters
		String[] arrString = line.split(" ");
		// puts in the arr the words of the line
		while (arrString[0] != "exit") {
			// starts if the first word is not "exit"
			String firstWord = arrString[0];
			// take the first word from our array
			String[] args = new String[arrString.length - 1];
			// creates new array for all the other words
			System.arraycopy(arrString, 1, args, 0, arrString.length - 1);
			// copy the arrString array to the new array minus the first word
			CommandManager commandManager = new CommandManager(sokobanGame);
			// creates a new class that maps between the word to the command
			Command TheCommand = commandManager.getCommand(firstWord);
			// returns the command that  match the word

			if (TheCommand != null) {
				// check if the word exists in the hashMap if not it will return NULL
				TheCommand.execute(args); 
				// if the word does exists , it will turn on the execute func
			} else {
				System.out.println("Command not found."); 
				// if it returns NULL it will print to the user that the command is not found
			}
			line = in.readLine(); 
			// get a new command from the user and puts it in "line"
			if (line.contains(" ")) {
				arrString = line.split(" ");
			}
			else
				arrString[0] = line;
		}
		in.close();// close the bufferreader
	}

}
