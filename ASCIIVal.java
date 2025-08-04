import java.util.Scanner;

public class ASCIIVal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char ch;

        System.out.print("Enter a character to know it's ASCII value : ");
        ch = scanner.next().charAt(0); //charAt() function will read the character at index 0

        int Val = (int) ch;//Converts a character to its respective integer value

        System.out.printf("ASCII value of '%c' is '%d'",ch,Val);
    }
}
