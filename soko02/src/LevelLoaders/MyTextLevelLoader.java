package LevelLoaders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import GeneralSokoban.Cell;
import GeneralSokoban.Floor;
import GeneralSokoban.GeneralElement;
import GeneralSokoban.Movable;
import GeneralSokoban.Player;
import GeneralSokoban.Position;
import GeneralSokoban.Target;
import Levels.Level;
import Manager.ElementFactory;

public class MyTextLevelLoader implements LevelLoader {

	@Override
	public Level loadLevel(InputStream in) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		Level level = new Level();
		String line;
		int countRow = 0;
		int countColumn = 0;

		StringBuilder str = new StringBuilder();
		try {
			while ((line = reader.readLine()) != null) {
				str.append(line).append("\n");
				countRow++;
				if (line.length() > countColumn)
					countColumn = line.length();
			}
		} catch (IOException e1) {
			e1.printStackTrace();

		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		level.setBoard(new Cell[countRow][countColumn]);

		ElementFactory elementFactory = new ElementFactory();

		String[] arr = str.toString().split("\n");
		for (int i = 0; i < countRow; i++) {
			line = arr[i];
			for (int column = 0; column < line.length(); column++) {
				GeneralElement ge = elementFactory.createElement(line.charAt(column));
				ge.setPosition(new Position(column, i));
				Cell cell = new Cell(new Position(column, i));
				cell.getElements().add(ge);
				if (line.charAt(column) == 'A') {
					cell.getElements().add(new Floor(column, i));
					level.setPlayer(new Player(column, i));
				}
				if (line.charAt(column) == '@')
					cell.getElements().add(new Floor(column, i));
				if (line.charAt(column) == '&')
					cell.getElements().add(new Target(column, i));
				if (line.charAt(column) == '+')
					cell.getElements().add(new Target(column, i));
				level.getBoard()[i][column] = cell;
			}
		}
		return level;
	}
}
