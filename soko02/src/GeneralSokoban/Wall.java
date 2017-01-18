package GeneralSokoban;

public class Wall extends GeneralElement {
/**
 * this class represents the wall element.
 */
	private static final long serialVersionUID = -8456852333292758023L;
/*
 * this method constructs a new floor and initializes its position.
 */
	public Wall() {
		m_position = new Position(); // initializes the position to (0,0)
	}

	/*
	 * this method constructs a new floor and initializes its position with (x,y)
	 */
	public Wall(int x, int y) {
		m_position = new Position(x, y);
	}

}
