package LevelSavers;

import java.io.IOException;
import java.io.OutputStream;
import Levels.Level;

public interface LevelSaver {
	void save(OutputStream out, Level levelToSave) throws IOException;
}
