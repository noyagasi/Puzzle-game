package GeneralSokoban;

import java.io.Serializable;

public abstract class GeneralElement implements Serializable {

	private static final long serialVersionUID = 233856235998020361L;
	Position m_position;

	/**
	 * This constructs a GeneralElement with new initialized position.
	 */
	public GeneralElement() {
		m_position = new Position(); // initializes the position to (0,0)
	}
	
	/**
	 * This constructs a General Element with new position that got x,y.
	 * @param x the horizontal position's value.
	 * @param y the vertical position's value.
	 */

	public GeneralElement(int x, int y) {
		m_position = new Position(x, y);
	}
	
	/**
	 * This method gives the current position of the General Element.
	 * @return the current position.
	 */

	public Position getPosition() {
		return m_position;
	}
	
	/**
	 * sets a new Position on the current element.
	 * @param position will be the new 
	 */

	public void setPosition(Position position) {
		m_position = position;
	}
}