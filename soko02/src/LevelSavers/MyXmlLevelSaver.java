package LevelSavers;

import java.beans.XMLEncoder;
import java.io.OutputStream;

import Levels.Level;

public class MyXmlLevelSaver implements LevelSaver {

	@Override
	public void save(OutputStream out, Level levelToSave) {

		XMLEncoder encoder = new XMLEncoder(out);
		encoder.writeObject(levelToSave);
		encoder.close();

	}

}
