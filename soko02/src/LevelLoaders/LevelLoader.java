package LevelLoaders;

import java.io.InputStream;

import Levels.Level;

public interface LevelLoader {
	public Level loadLevel (InputStream in);
}