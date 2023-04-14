package ProblemSolvingTaks;

public class integersDivisibleByThree {

    public static void main(String[] args) {
        double pi = 0.0;
        double denominator = 1;
        int count = 1;

        for (int i = 0; i < 136_121; i++) {
            if (count % 2 == 0) {
                pi -= 4 / denominator;
                count++;
                denominator += 2;

            } else if (count % 2 == 1) {
                pi += 4 / denominator;
                count++;
                denominator += 2;

            }
            System.out.println(i + pi);
        }
    }
}

