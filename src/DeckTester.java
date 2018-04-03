/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck deck1 = new Deck(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}, new String[]{"Spades", "Hearts", "Diamonds", "Clubs"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13});
		Deck deck2 = new Deck(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, new String[]{"Cupcakes", "Brownies", "Pie"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
		Deck deck3 = new Deck(new String[]{"2", "4", "6", "8", "10", "12"}, new String[]{"Rainbows", "Unicorns"}, new int[]{1, 2, 3, 4, 5, 6});

		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.deal());
		System.out.println(deck1);

		System.out.println(deck2.size());
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.deal());
		System.out.println(deck2);

		System.out.println(deck3.size());
		System.out.println(deck3.isEmpty());
		System.out.println(deck3.deal());
		System.out.println(deck3);

	}
}
