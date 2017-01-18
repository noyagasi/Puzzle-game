package Levels;

import java.util.ArrayList;

public class SokobanGame {
	private ArrayList<Level> levels;
	private int levelNo = 0;

	public SokobanGame() {
		levels = new ArrayList<Level>();
	}

	public Level getCurrentLevel() {
		return levels.get(levelNo-1);
	}

	public void addLevel(Level level) {
		levels.add(level);
		setLevelNo(getLevelNo() + 1);
	}

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

}
