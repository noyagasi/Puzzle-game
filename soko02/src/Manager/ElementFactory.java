package Manager;

import java.util.HashMap;

import GeneralSokoban.Box;
import GeneralSokoban.Floor;
import GeneralSokoban.GeneralElement;
import GeneralSokoban.Player;
import GeneralSokoban.Target;
import GeneralSokoban.Wall;

public class ElementFactory {

	HashMap<Character, Creator> generalElementCreators;

	public ElementFactory() {
		generalElementCreators = new HashMap<Character, Creator>();
		generalElementCreators.put('@', new BoxCreator());
		generalElementCreators.put('A', new PlayerCreator());
		generalElementCreators.put('&', new BoxCreator());
		generalElementCreators.put('+', new PlayerCreator());

		generalElementCreators.put(' ', new FloorCreator());
		generalElementCreators.put('#', new WallCreator());
		generalElementCreators.put('o', new TargetCreator());

	}

	public GeneralElement createElement(char type) {
		Creator c = generalElementCreators.get(type);
		if (c != null)
			return c.create();
		return null;
	}

	private interface Creator {
		GeneralElement create();
	}

	public class BoxCreator implements Creator {

		@Override
		public GeneralElement create() {
			return new Box();
		}

	}

	public class FloorCreator implements Creator {

		@Override
		public GeneralElement create() {
			return new Floor();
		}

	}

	private class PlayerCreator implements Creator {

		@Override
		public GeneralElement create() {
			return new Player();
		}

	}

	private class TargetCreator implements Creator {

		@Override
		public GeneralElement create() {
			return new Target();
		}

	}

	private class WallCreator implements Creator {

		@Override
		public GeneralElement create() {
			return new Wall();
		}

	}

}