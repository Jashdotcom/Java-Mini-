import java.util.Scanner;

public class PrintDivisors {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Enter a number : ");
        num = scanner.nextInt();

        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
            else{
                continue;
            }
        }
        scanner.close();
    }
}
