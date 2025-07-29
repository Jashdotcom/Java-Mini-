public class Varargs1 {

    public static void main(String[] args){

        //Finding sum of numbers using Varargs

        System.out.println("Sum = " + add(1,2,3,4));   //We can pass in any number of argument in this "add" method.
                                                       //These arguments are going to be packed into an array when we send them into the method.In this case "numebrs" is the array.
                                                       //So this will get packed in array "numbers".
    }
    static int add(int... numbers){

        int sum=0;                                     //int... (name of array).In this case "numbers" is the array.

        for(int number : numbers){
            sum += number;
        }
        return sum;

    }
}
