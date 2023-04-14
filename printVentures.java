package ProblemSolvingTaks;

public class printVentures {
    public static void printingVentures(){
        String word = "VENTURES";
        for (int i = 0; i < word.length(); i+= 2) {
            System.out.println(word.charAt(i) + " " + word.charAt(i + 1) );

        }
    }


    public static void main(String[] args) {
        printingVentures();
    }
}