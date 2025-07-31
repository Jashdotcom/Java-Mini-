public class TelephoneNumPad {

    public static void main(String[] args){

        char[][] telephone = {{'1','2' ,'3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row : telephone){  //We have an array of characters "row" in our org array of "telephone".
            for(char number : row){   //For every number in each array of "row" we will print the below statement.

                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
