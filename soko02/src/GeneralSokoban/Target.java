package GeneralSokoban;

public class Target extends GeneralElement implements Standable {
	
	/*
	 * this class is the target element.
	 */

	private static final long serialVersionUID = 3570624605279985241L;

	/*
	 * this method constructs a new target and initializes its position.
	 */
	public Target() {
		m_position = new Position(); // initializes the position to (0,0)
	}

	
	/*
	 * this method constructs a new target and initializes its position with (x,y).
	 */
	public Target(int x, int y) {
		m_position = new Position(x, y);
	}

}
