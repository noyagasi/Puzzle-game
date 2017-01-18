package GeneralSokoban;

public class Box extends GeneralElement implements Movable {

	/*
	 * this class is the box element.
	 */
	private static final long serialVersionUID = 2537322788360114782L;

	/*
	 * this method constructs a new box, and initalizes its position.
	 */
	public Box() {
		m_position = new Position(); // initializes the position to (0,0)
	}

	/*
	 * this method constructs a new box and intalizes its position to the x,y
	 * values its got.
	 */
	public Box(int x, int y) {
		m_position = new Position(x, y);
	}

	/*
	 * this method moves the position of the box 1 step right.
	 */
	@Override
	public void moveRight() {
		m_position.setM_y(m_position.getM_y() + 1);
	}

	/*
	 * this method moves the position of the box 1 step left.
	 */
	@Override
	public void moveLeft() {
		m_position.setM_y(m_position.getM_y() - 1);
	}

	/*
	 * this method moves the position of the box 1 step up.
	 */
	@Override
	public void moveUp() {
		m_position.setM_x(m_position.getM_x() - 1);
	}

	/*
	 * this method moves the position of the box 1 step down.
	 */
	@Override
	public void moveDown() {
		m_position.setM_x(m_position.getM_x() + 1);
	}
}
