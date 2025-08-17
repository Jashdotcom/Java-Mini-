import java.util.Scanner;

public class RevNumber {

    //If a number has trailing zeros, then its reverse will not include them.
    // For e.g. reverse of 10400 will be 401 instead of 00401.

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n,rem,revNum=0;

        System.out.print("Enter a number : ");
        n = scanner.nextInt();

        while(n>0){
            rem=n%10;
            revNum=(revNum*10)+rem;
            n/=10;
        }
        System.out.printf("Reversed num is : %d",revNum);
        scanner.close();
    }
}
