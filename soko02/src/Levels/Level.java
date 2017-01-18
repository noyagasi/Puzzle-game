package Levels;

import java.io.Serializable;

import GeneralSokoban.*;

public class Level implements Serializable {

	private static final long serialVersionUID = 6030500903486539420L;
	private Cell[][] board;
	private Player player;

	public Level() {
	}

	public boolean isSolved() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				Cell c = board[i][j];
				if (c.hasTarget() && !c.hasBox()) {
					return false;
				}
			}
		}
		return true;
	}

	public Cell[][] getBoard() {
		return board;
	}

	public void setBoard(Cell[][] board) {
		this.board = board;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
