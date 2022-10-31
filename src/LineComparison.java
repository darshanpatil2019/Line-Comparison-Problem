import java.util.*;
import java.lang.Math;

public class LineComparison {

    private void calculateLength() {
        // Object creation for Scanner class
        Scanner sc = new Scanner(System.in);
        double length[] = new double[2];
        // user inputs
        for (int i = 0; i < 2; i++) {

            System.out.println((i + 1) + ":Enter the values for x1,y1,x2,y2");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            // calculate length of line and store in array
            length[i] = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
            System.out.println("Length of line" + (i + 1) + ":" + length[i]);
        }
        // checking equality of 2 lines - comparing lengths of two lines
        if (Objects.equals(length[1], length[2])) {
            System.out.println("The length of two lines are equal");
        } else if (length[1] > length[2]) {
            System.out.println("The Length of line 1 is greater than the length of line 2");
        } else {
            System.out.println("Length of line 2 is greater than the length of line 1");
        }
    }

    public static void main(String[] args) {
        LineComparison lC = new LineComparison();
        lC.calculateLength();
    }
}
