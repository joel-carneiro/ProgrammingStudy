package arraysbasic;

public class TryArrays {
	
	public static double mean(int[] arr) {
		int total = 0;
		for (double value : arr) {
			total += value;
		}
		return total / arr.length;
	}
	
	public static void main(String[] args) {
		final int[] IFCE = {66, 53, 52, 12, 99, 96, 76};
		final int[] UECE = {43, 89, 78, 67, 91, 54, 78};
		
		for (int i = 0; i < IFCE.length; i++) {
			System.out.printf("IFCE: %d; UECE: %d; DIFF: %d\n", IFCE[i], UECE[i], Math.abs(IFCE[i] - UECE[i]));
		}
	}
}