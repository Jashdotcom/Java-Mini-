public class Varargs2{

    public static void main(String[] args){

        //Finding average of numbers

        System.out.println("Average = " + average(25,26,1649,991)); //If we will pass no arguments,then it print "NaN i.e. Not a Number" coz we are dividing by zero.Passing no arguments = 0.
    }
    static double average(double... numbers){

        double sum=0;

        if(numbers.length==0){                       //This line of code will return "0" if no arguments are passed i.e. it solves the NaN case.
            return 0;
        }

        for(double number : numbers){  //For every "number" in my array of "numebers" do the following code(enhanced for loop).
            sum+=number;
        }
        return sum/numbers.length;
    }
}