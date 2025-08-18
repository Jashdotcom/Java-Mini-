import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //If the number is an armstrong print "True" else "False".

        int num,sum=0,rem=0,dup,count=0,org;

        System.out.print("Enter a number : ");
        num = scanner.nextInt();

        dup=num;
        org=dup;

        while(num>0){
            rem=num%10;
            num/=10;
            count++;
        }
        while(dup>0) {
            rem = dup % 10;
            dup /= 10;
            sum += (int) Math.pow(rem, count);
        }
        if(sum==org){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        scanner.close();

    }
}
