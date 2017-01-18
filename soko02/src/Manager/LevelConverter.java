package Manager;

import Levels.Level;

public class LevelConverter {

	public String displayLevel(Level level) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < level.getBoard().length; i++) { // run over the rows
			for (int j = 0; j < level.getBoard()[i].length; j++) {			
				if (level.getBoard()[i][j].hasPlayer()) // if a floor can also
														// be a player
				{
					if (level.getBoard()[i][j].hasFloor()) // check if a floor
						sb.append("A");
					else if (level.getBoard()[i][j].hasTarget()) // check if a
																	// target
						sb.append("+");
	
				} 
				else if (level.getBoard()[i][j].hasBox()) // if a floor can
															// also be a box
				{
					if (level.getBoard()[i][j].hasFloor()) // check if a floor
						sb.append("@");
					else if (level.getBoard()[i][j].hasTarget()) // check if a
																	// target
						sb.append("&");
				}
				else if (level.getBoard()[i][j].hasWall()) { // check if a
																	// wall
					sb.append("#");
				}
				else 
				{
					if (level.getBoard()[i][j].hasFloor())
						sb.append(" ");
					else // targer
						sb.append("o");
				}
			}
			
			sb.append("\n"); // get one line down in the and of the row
		}
	

		return sb.toString(); // return a stringBuilder
	}
}
