public class Exercise236 {

    public static void main(String[] args) {

        int [] array = {-5,489,60,12,56,5,88,112,100,25,-58,65,33,87,20,9,20};

        int count = 0;
        long multiply = 1l;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                count++;
                multiply*=array[i];
            }

        }
        System.out.println("Count is " + count);
        System.out.println("Multiply is " + multiply);
    }
}
