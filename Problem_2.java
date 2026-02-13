import java.util.Scanner;
public class Hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter nember--> ");
        int n = scanner.nextInt();
        int steps = 0;
        System.out.print("Sequence:  " + n);
        while (n != 1) {
            if (n % 2== 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(" -> " + n);
            steps++;
        }
        System.out.println();
        System.out.println("Total steps: " + steps);
        scanner.close();
    }
}
