import java.util.Scanner;

public class UserInputInArray{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int size;

        System.out.print("What number of food items would you like to add? : ");
        size = scanner.nextInt();
        System.out.println();

        String[] foods = new String[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter a food item : ");
            foods[i] = scanner.next();
        }
        System.out.println();
        System.out.println("Array consists of food item/s : ");
        for(int i=0;i<size;i++){
            System.out.println(foods[i]);
        }




        scanner.close();



    }



}