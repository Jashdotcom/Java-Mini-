import java.util.Scanner;

public class SearchingInArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int target,size,i;
        boolean isFound=false;

        System.out.print("Enter the size of array : ");
        size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println();

        for(i=0;i<size;i++){
            System.out.print("Enter the element : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("\nEnter the element to be searched : ");
        target = scanner.nextInt();

        for(i=0;i<arr.length;i++){

            if(target == arr[i]){
                System.out.printf("\nElement %d found at index %d",target,i);
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.printf("\n%d element not found in array!",target);
        }
        scanner.close();
    }
}
