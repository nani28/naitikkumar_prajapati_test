import java.util.Scanner;

public class LineSegmentOverlap {
	public static boolean doSegmentsOverlap(int x1, int x2, int x3, int x4) {
		// Here we are checking two line segments overlap by comparing their endpoint
		// values.
		// Segments (x1, x2) and (x3, x4) can be overlap if x2 is greater than or equal
		// to x3,
		// and x4 is greater than or equal to x1.
		return x2 >= x3 && x4 >= x1;
	}

	public static void main(String[] args) {

		// Input: Take two pairs of points (x1, x2) and (x3, x4) from the user.
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Enter the endpoints of the first line segment (x1 x2): ");
			int x1 = scanner.nextInt();
			int x2 = scanner.nextInt();

			System.out.print("Enter the endpoints of the second line segment (x3 x4): ");
			int x3 = scanner.nextInt();
			int x4 = scanner.nextInt();

			// Check if the line segments overlap and display the result.
			boolean overlap = doSegmentsOverlap(x1, x2, x3, x4);
			if (overlap) {
				System.out.println("The line segments overlap.");
			} else {
				System.out.println("The line segments do not overlap.");
			}
		}
	}
}
