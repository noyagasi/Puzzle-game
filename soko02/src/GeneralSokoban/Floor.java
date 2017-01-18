package GeneralSokoban;

public class Floor extends GeneralElement implements Standable {

	/*
	 * this class is the floor element.
	 */
	private static final long serialVersionUID = 1124762817745192629L;

	/*
	 * this method constructs a new floor and initializes its position.
	 */
	public Floor() {
		m_position = new Position(); // initializes the position to (0,0)
	}

	/* this method constructs a new floor and intalizes its position to the x,y
	 * values its got.
	 */
	public Floor(int x, int y) {
		m_position = new Position(x, y);
	}
}
