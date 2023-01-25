public class Exercise233 {
    public static void main(String[] args) {

        int [] array = {-5,489,60,12,56,5,88,111,100,25,-58,65,33,87,20,9,20};

        int multiply = 1;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                multiply*=array[i];
                sum+=array[i];
            }

        }

        System.out.println("Multiply is "+ multiply);
        System.out.println("Sum is " + sum);
    }
}
