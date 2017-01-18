package LevelLoaders;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.InputStream;

import Levels.Level;

public class MyXmlLevelLoader implements LevelLoader {

	@Override
	public Level loadLevel(InputStream in) {
		XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(in));
	    Level level = (Level) decoder.readObject();
		decoder.close();
		return level;
	}

}
