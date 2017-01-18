package LevelLoaders;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import Levels.Level;

public class MyObjectLevelLoader implements LevelLoader {

	Level theLevel;
	@Override
	public Level loadLevel(InputStream in) {
		try {
			theLevel = new Level();
			ObjectInputStream ois = new ObjectInputStream(in);
			theLevel = (Level)ois.readObject();
			ois.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return theLevel;
	}

}
