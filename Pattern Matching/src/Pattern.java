import java.util.Scanner;
import java.util.regex.Pattern;

class PatternMatching {
    public void Matching(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Input String : ");
        String st = input.next();
        String pat = "Love";
        boolean Matches = Pattern.matches(pat,st);
        System.out.printf("Matches : "+Matches);
    }
}
