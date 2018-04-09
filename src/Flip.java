import java.util.Random;

public class Flip {

	public static void main(String[] args) {
		// System.out.println(flip());
		// System.out.println(flip());
		// System.out.println(flip());
		// System.out.println(flip());

		System.out.println(arePermutations(new int[]{1, 2, 3, 4}, new int[]{1, 3, 2, 4}));
		System.out.println(arePermutations(new int[]{1, 4, 3, 2}, new int[]{1, 3, 6, 5}));
		System.out.println(arePermutations(new int[]{5, 2, 3, 4}, new int[]{4, 2, 5, 3}));
		System.out.println(arePermutations(new int[]{9, 4, 3, 2}, new int[]{1, 3, 6, 5}));


	}


	public static String flip() {
		Random random = new Random();
		int r = random.nextInt(3);
		String tails = new String("tails");
		String heads = new String("heads");

		if (r == 0) {
			return tails;
		}
		return heads;
	}

	public static boolean arePermutations(int[] a, int[] b) {
		int count = 0;
		for(int j = 0; j < a.length; j++) {
			for(int k = 0; k < a.length; k++) {
				if (a[j] == b[k]) {
					count++;
				} 
			}
		}
		if (count == a.length) {
			return true;
		}
		return false;
	}


}
