public class Exercise235 {
    public static void main(String[] args) {

        int [] array = {-5,489,60,12,56,5,88,112,100,25,-58,65,33,87,20,9,20};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                count++;
                sum+=array[i]*array[i];
            }
        }

        System.out.println(sum/count);
    }
}
