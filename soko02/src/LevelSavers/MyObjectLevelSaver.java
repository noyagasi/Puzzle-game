package LevelSavers;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import Levels.Level;

public class MyObjectLevelSaver implements LevelSaver {

	@Override
	public void save(OutputStream out, Level levelToSave) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(levelToSave);
			oos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
