import java.util.Scanner;

public class TableOfNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num=0,i=0,result=0;

        System.out.print("Enter number to print it's table : ");
        num = scanner.nextInt();

        while(num<0){
            System.out.println("Enter a number greater than zero.");

            System.out.print("\nEnter number to print it's table : ");
            num = scanner.nextInt();
        }

        if(num>=0){
            for(i=1;i<11;i++){
                result = num*i;
                System.out.printf("\n%d * %d = %d",num,i,result);
            }
        }

        scanner.close();
    }
}
