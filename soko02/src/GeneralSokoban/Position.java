package GeneralSokoban;

import java.io.Serializable;
/*
 * this class represents a position for the elementes.
 */
public class Position implements Serializable {
//declarations of Variables
	private static final long serialVersionUID = 3996969487902725928L;
	private int m_x, m_y;

	/*
	 * this methods consrtucts a new position and initializes its parameters with (x,y)
	 */
	public Position() {
		m_x = 0;
		m_y = 0;
	}

	public Position(int x, int y) {
		m_x = x;
		m_y = y;
	}

	public boolean equals(Position position) {
		if ((position.getM_x() == m_x) && (position.getM_y() == m_y))
			return true;
		else
			return false;
	}

	public int getM_x() {
		return m_x;
	}

	public void setM_x(int m_x) {
		this.m_x = m_x;
	}

	public int getM_y() {
		return m_y;
	}

	public void setM_y(int m_y) {
		this.m_y = m_y;
	}
}
