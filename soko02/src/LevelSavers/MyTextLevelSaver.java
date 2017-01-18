package LevelSavers;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import Levels.Level;
import Manager.LevelConverter;

public class MyTextLevelSaver implements LevelSaver {

	@Override
	public void save(OutputStream out, Level levelToSave) throws IOException {
		

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		LevelConverter levelConverter = new LevelConverter(); // we create a new levelDisplyer 
		
		String levelString = levelConverter.displayLevel(levelToSave);//convert the level to string 
		writer.write(levelString); // puts the string in 
		writer.close(); // close the file
	}

}
