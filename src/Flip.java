import java.util.Random;

public class Flip {

	public static void main(String[] args) {
		System.out.println(flip());
		System.out.println(flip());
		System.out.println(flip());
		System.out.println(flip());

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
		for(int j = 0; j < a.length;) {
			if(a[j] == b[count]) {
				j++;
				count++;
			} else {
				return false;
			}
		}
		return true;
	}


}
