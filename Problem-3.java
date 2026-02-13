import java.util.Scanner;
public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds-> ");
        int totalSeconds = sc.nextInt();
        int passedSeconds = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.printf("%02d:%02d:%02d\n", h, m, s);
                    passedSeconds++;
                    if (passedSeconds == totalSeconds) {
                        return; 
                    }
                }
            }
        }
    }
}
