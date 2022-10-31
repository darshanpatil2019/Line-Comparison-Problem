import java.util.*;
import java.lang.Math;

public class UC2_CheckEqualityOfLines {
    public static void main(String[] args) {
        // Object creation for Scanner class
        Scanner sc = new Scanner(System.in);
        double length[] = new double[2];
        // user inputs
        for (int i = 0; i < 2; i++) {

            System.out.println((i + 1) + "Enter the values for x1,y1,x2,y2");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            // calculate length of line and store in array
            length[i] = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
            System.out.println("Length of line" + (i + 1) + ":" + length[i]);
        }
        // checking equality of 2 lines - comparing lengths of two lines
        if (Objects.equals(length[0], length[1])) {
            System.out.println("The length of two lines are equal");
        } else {
            System.out.println("The Length of Two lines are not equal");
        }
    }
}

