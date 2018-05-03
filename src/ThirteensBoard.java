import java.util.List;
import java.util.ArrayList;

/**
 * The ThirteensBoard class represents the board in a game of Thirteens.
 */
public class ThirteensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 10;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

	/**
	 * Creates a new <code>ThirteensBoard</code> instance.
	 */
	 public ThirteensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Thirteens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 13, and (2) a king.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		int[] idx1 = new int[2];
		int[] idx2 = new int[1];
		if (selectedCards.size() == 2) {
			idx1 = findPairSum13(selectedCards);
			if (idx1[0] != -1) {
				return true;
			}
		} else if (selectedCards.size() == 1) {
			idx2 = findK(selectedCards);
			if (idx2[0] != -1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Thirteens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 13, or (2) a king.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		int[] index1 = new int[2];
		int[] index2 = new int[1];
		List<Integer> cIndexes = cardIndexes();
		index1 = findPairSum13(cIndexes);
		index2 = findK(cIndexes);
		if (index2[0] != -1) {
			return true;
		} else if (index1[0] != -1) {
			return true;
		}
		return false;
	}

	/**
	 * Look for an 13-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 13-pair.
	 * @return a list of the indexes of an 13-pair, if an 13-pair was found;
	 *         an empty list, if an 13-pair was not found.
	 */
	private int[] findPairSum13(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findPairSum13 IN ACTIVITY 11 *** */
		int[] list = new int[2];
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) {
			int k1 = selectedCards.get(sk1).intValue();
			for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) {
				int k2 = selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 13) {
					list[0] = k1;
					list[1] = k2;
					return list;
				}
			}
		}
		list[0] = -1;
		return list;
	}

	/**
	 * Look for a king in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a king.
	 * @return a list of the index of a king, if a king was found;
	 *         an empty list, if a king was not found.
	 */
	private int[] findK(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findKing IN ACTIVITY 11 *** */
		int[] list = new int[1];
		for (Integer kObj : selectedCards) {
			int k = kObj.intValue();
			if (cardAt(k).rank().equals("king")) {
				list[0] = k;
				return list;
			}
		}
		list[0] = -1;
		return list;
	}

	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false othewise.
	 */
	public boolean playIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		return playPairSum13IfPossible() || playKIfPossible(); 
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 13.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 13-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum13IfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		List<Integer> cIndexes = cardIndexes();
		int[] index = new int[2];
		index = findPairSum13(cIndexes);
		List<Integer> indexList = new ArrayList<Integer>();
		for (int i : index) {
			indexList.add(i);
		}
		if (index[0] != -1) {
			replaceSelectedCards(indexList);
			return true;
		}
		return false;
	}

	/**
	 * Looks for a King.
	 * If found, replace it with the next card in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a king play was found (and made); false othewise.
	 */
	private boolean playKIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		List<Integer> cIndexes = cardIndexes();
		int[] index = new int[3];
		index = findK(cIndexes);
		List<Integer> indexList = new ArrayList<Integer>();
		for (int i : index) {
			indexList.add(i);
		}
		if (index[0] != -1) {
			replaceSelectedCards(indexList);
			return true;
		}
		return false;
	}
}
