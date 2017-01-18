package GeneralSokoban;

public class Player extends GeneralElement implements Movable {
	/*
	 * this class is the player element.
	 */
	private static final long serialVersionUID = -3296436730290809567L;

	/*
	 * this method creates a new player and initialize its new position.
	 */
	public Player() {
		m_position = new Position(); // initializes the position to (0,0)
	}

	/*
	 * this method creates a new player and initializes its new position with(x,y).
	 */
	public Player(int x, int y) {
		m_position = new Position(x, y);
	}

	
	/*
	 * this method moves the position of the player 1 step right.
	 */
	@Override
	public void moveRight() {
		m_position.setM_y(m_position.getM_y() + 1);
	}

	/*
	 * this method moves the position of the player 1 step left.
	 */
	@Override
	public void moveLeft() {
		m_position.setM_y(m_position.getM_y() - 1);
	}

	/*
	 * this method moves the position of the playrt 1 step up.
	 */
	@Override
	public void moveUp() {
		m_position.setM_x(m_position.getM_x() - 1);
	}

	/*
	 * this method moves the position of the player 1 step down.
	 */
	@Override
	public void moveDown() {
		m_position.setM_x(m_position.getM_x() + 1);
	}

}
