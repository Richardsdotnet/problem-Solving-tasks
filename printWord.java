package ProblemSolvingTaks;

public class printWord {
    public static void alphabetPrint(){
        String word = "SEMICOLON";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }


    public static void main(String[] args) {
        alphabetPrint();
    }
}