import java.util.Scanner;
public class GCD {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1,num2,num3,count=0,gcd=0;

        System.out.print("Enter a first number : ");
        num1 = scanner.nextInt();

        System.out.print("Enter a second number : ");
        num2 = scanner.nextInt();

        num3=Math.min(num1,num2);

        System.out.printf("GCD(%d,%d)  : ",num1,num2);

        for(int i=1;i<=num3;i++){         //Running the loop till minimum of the tow numbers coz running it till the greatest number will not divide the minimum number.
                                         //Ex. : If the numbers are 9 & 12 running the loop till 12 doesn't makes sense coz 9 will not get divided by 10,11,12.
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.print(gcd);

        scanner.close();
    }
}
