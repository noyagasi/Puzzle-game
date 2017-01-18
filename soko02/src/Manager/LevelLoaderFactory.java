package Manager;

import java.util.HashMap;
import LevelLoaders.*;

public class LevelLoaderFactory {

	HashMap<String, Creator> LevelLoaderCreators;

	public LevelLoaderFactory() {
		LevelLoaderCreators = new HashMap<String, Creator>();
		LevelLoaderCreators.put("txt", new TextLevelLoaderCreator());
		LevelLoaderCreators.put("xml", new XmlLevelLoaderCreator());
		LevelLoaderCreators.put("obj", new ObjectLevelLoaderCreator());
	}

	public LevelLoader createLoader(String type) {
		Creator c = LevelLoaderCreators.get(type);
		if (c != null)
			return c.create();
		return null;
	}

	private interface Creator {
		LevelLoader create();
	}

	public class TextLevelLoaderCreator implements Creator {

		@Override
		public LevelLoader create() {
			return new MyTextLevelLoader();
		}

	}

	public class XmlLevelLoaderCreator implements Creator {

		@Override
		public LevelLoader create() {
			return new MyXmlLevelLoader();
		}

	}

	private class ObjectLevelLoaderCreator implements Creator {

		@Override
		public LevelLoader create() {
			return new MyObjectLevelLoader();
		}

	}
}
