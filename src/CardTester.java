/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("Queen", "Hearts", 12);
		Card two = new Card("King", "Spades", 13);
		Card three = new Card("Ten", "Clubs", 10);

		System.out.println(one.toString());
	}
}
