package GeneralSokoban;

import java.io.Serializable;
import java.util.ArrayList;

public class Cell implements Serializable {

	private Position cellPosition;
	/**
	 * this class represents the cell in the matrix and holds the elements.
	 */
	private static final long serialVersionUID = -2887333206114841146L;
	private ArrayList<GeneralElement> elements;
	
	

	/**
	 * this method constructs a new cell.
	 */
	public Cell(Position position) {
		setCellPosition(position);
		setElements(new ArrayList<GeneralElement>());
	}
	
	

	public ArrayList<GeneralElement> getElements() {
		return elements;
	}

	public void setElements(ArrayList<GeneralElement> elements) {
		this.elements = elements;
	}

	public boolean hasWall() {
		for (GeneralElement e : elements) {
			if (e instanceof Wall) {
				return true;
			}
		}
		return false;
	}

	public boolean hasBox() {
		for (GeneralElement e : elements) {
			if (e instanceof Box) {
				return true;
			}
		}
		return false;
	}

	public boolean hasPlayer() {
		for (GeneralElement e : elements) {
			if (e instanceof Player) {
				return true;
			}
		}
		return false;
	}

	public boolean hasFloor() {
		for (GeneralElement e : elements) {
			if (e instanceof Floor) {
				return true;
			}
		}
		return false;
	}

	public boolean hasTarget() {
		for (GeneralElement e : elements) {
			if (e instanceof Target) {
				return true;
			}
		}
		return false;
	}



	public Position getCellPosition() {
		return cellPosition;
	}



	public void setCellPosition(Position cellPosition) {
		this.cellPosition = cellPosition;
	}
	
	public Box getBox(){
		for (GeneralElement e : elements) {
			if (e instanceof Box) {
				return (Box) e;
			}
		}
		return null;
	}
}
