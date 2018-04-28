import java.util.Arrays;
import java.util.Random;

public class binarySearchTemplate { // start class

	// initialize the array with number 2, 4, 6 ... 2N
	public static int[] init(int N) {
		int[] a;
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = (2 * (i + 1));
		}
		return a;
	}

	// binary search, fill it in yourself
	public static int binarySearch(int[] a, int key, int min, int max) {
		// base case
		if (min > max) {
			return -1;
		}
		//recursive case
		else {
			int mid = (max + min)/2;
			if (key < a[mid]) {
				return binarySearch(a, key, min, max-1);
			}
			else if (key > a[mid]) {
				return binarySearch(a, key, min+1, max);
			}
			return mid;
		}
		

	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); // take a user input of the array
											// size
		int key = Integer.parseInt(args[1]);
		int a[] = init(n);
		System.out.println(Arrays.toString(a));
		System.out.println(binarySearch(a, key, 0, a.length - 1));
	}

}