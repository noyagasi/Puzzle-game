package Policies;

import java.io.Serializable;
import java.util.ArrayList;

import GeneralSokoban.Cell;
import GeneralSokoban.GeneralElement;
import GeneralSokoban.Player;
import GeneralSokoban.Position;
import GeneralSokoban.Wall;
import Levels.Level;

public class MySokobanPolicy implements SokobanPolicy, Serializable {

	private static final long serialVersionUID = 1955650286132226809L;
	private boolean PlayerWalkOverWalls = false;
	private boolean PlayerPushBlockedBox = false;
	private boolean PlayerDrawBox = false;
	private boolean DestinationLegal = false;
	private int AmountCanYouMove = 1;

	public void Action(Level level, String wayToMove) {
		Position playerPosition = level.getPlayer().getPosition();
		switch (wayToMove) {
		case "up":
			makeMoveIfLegal(level, level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()],
					level.getBoard()[playerPosition.getM_y()-1][playerPosition.getM_x()],
					level.getBoard()[playerPosition.getM_y()-2][playerPosition.getM_x()]);
			break;
		case "down":
			makeMoveIfLegal(level, level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()],
					level.getBoard()[playerPosition.getM_y()+1][playerPosition.getM_x()],
					level.getBoard()[playerPosition.getM_y()+2][playerPosition.getM_x()]);
		case "right":
			makeMoveIfLegal(level, level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()],
					level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()+1],
					level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()+2]);
		case "left":
			makeMoveIfLegal(level, level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()],
					level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()-1],
					level.getBoard()[playerPosition.getM_y()][playerPosition.getM_x()-2]);
		}
	}

	private boolean makeMoveIfLegal(Level level, Cell currentPlayerCell, Cell nextPlayerCell, Cell nextElementCell){
		
		Player player = level.getPlayer();
		
		if (nextPlayerCell.hasWall())
			return false;
		if (nextPlayerCell.hasBox() == false)
		{
			System.out.println(currentPlayerCell.getCellPosition().getM_x());
			System.out.println(currentPlayerCell.getCellPosition().getM_y());
			int i;
			for (i=0; i<2; i++)
			{
				if (level.getBoard()[currentPlayerCell.getCellPosition().getM_y()]
					[currentPlayerCell.getCellPosition().getM_x()].getElements().get(i) instanceof Player)
					break;
			}
			level.getBoard()[currentPlayerCell.getCellPosition().getM_y()]
					[currentPlayerCell.getCellPosition().getM_x()].getElements().remove(i);
			level.getPlayer().setPosition(nextPlayerCell.getCellPosition());
			nextPlayerCell.getElements().add(player);
			//currentPlayerCell.getElements().remove(player);
			level.setPlayer(player);
			return true;
		}
		else
		{
			if (nextElementCell.hasWall() || nextElementCell.hasBox())
			{
				return false;
			}
			else
			{
				nextElementCell.getElements().add(nextPlayerCell.getBox());
				nextPlayerCell.getElements().remove(nextPlayerCell.getBox());
				level.getPlayer().setPosition(nextPlayerCell.getCellPosition());
				nextPlayerCell.getElements().add(player);
				currentPlayerCell.getElements().remove(player);
				return true;
			}
			
		}
	}

	private boolean canPlayerWalkOverWalls() {
		// TODO Auto-generated method stub
		return PlayerWalkOverWalls;
	}

	private boolean canPlayerPushBlockedBox() {
		// TODO Auto-generated method stub
		return PlayerPushBlockedBox;
	}

	private boolean canPlayerDrawBox() {
		return PlayerDrawBox;
	}

	private boolean DoesTheDestinationLegal() {
		return DestinationLegal;
	}

	private int howManyCanYouMove() {
		return AmountCanYouMove;
	}

	private void setPlayerWalkOverWalls(boolean playerWalkOverWalls) {
		PlayerWalkOverWalls = playerWalkOverWalls;
	}

	private void setPlayerPushBlockedBox(boolean playerPushBlockedBox) {
		PlayerPushBlockedBox = playerPushBlockedBox;
	}

	private void setPlayerDrawBox(boolean playerDrawBox) {
		PlayerDrawBox = playerDrawBox;
	}

	private void setDestinationLegal(boolean destinationLegal) {
		DestinationLegal = destinationLegal;
	}

	private void setAmountCanYouMove(int amountCanYouMove) {
		AmountCanYouMove = amountCanYouMove;
	}

}
