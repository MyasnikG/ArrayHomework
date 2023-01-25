public class Exercise232 {

    public static void main(String[] args) {

        int [] array = {-5,489,60,12,56,5,88,111,100,250,-58,65,33,87,20,9,20};

        int count =0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                count++;
            }

        }

        System.out.println(count);
    }
}
