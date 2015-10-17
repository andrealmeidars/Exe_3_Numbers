
public class Numbers {
    private int numberA;
    private  int numberB;






    public int getSumNumbers(int numberA, int numberB){

        if ( (numberA < 1 ) || (numberB < 1) ) {
            return  -1;
        }


        if (numberA == numberB){
            return ((numberA + numberB) * 2);
        }

        return numberA + numberB;

    }








}



