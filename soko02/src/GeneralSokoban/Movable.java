package GeneralSokoban;

/*
 * this interface has the method and the functionality of the elements that can move.
 */
public interface Movable {

	/*
	 * this method is resposible to move the element right.
	 */
	public void moveRight();

	/*
	 * this method is resposible to move the element left.
	 */
	public void moveLeft();

	/*
	 * this method is resposible to move the element up.
	 */
	public void moveUp();

	/*
	 * this method is resposible to move the element down.
	 */
	public void moveDown();

}
