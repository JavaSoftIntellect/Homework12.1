import java.util.Arrays;

public class Main {

	public static void sort(int[] a, int maxVal) {
		int[] bucket = new int[maxVal + 1];

		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}

		for (int i = 0; i < a.length; i++) {
			bucket[a[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				a[outPos++] = i;
			}
		}
	}

	public static void main(String[] args) {
		int maxVal = 50;
		int[] data = { 11, 12, 5, 2, 4, 1, 13, 8, 49, 18};

		System.out.println("Before sorting: " + Arrays.toString(data));
		sort(data, maxVal);
		System.out.println("After sorting:  " + Arrays.toString(data));
	}
}