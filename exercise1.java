import java.util.Scanner;
public class exercise1 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String input = iScanner.nextLine();
        iScanner.close();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--){
            if (words[i].length() != 0){
                if (result.length() != 0){
                    result.append(" ");
                }
                    result.append(words[i]);
            }
        }
        System.out.println(result.toString());
    }
}