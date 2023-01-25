public class Exercise247 {

    public static void main(String[] args) {

        int [] array = {-1,-2,1,-9,52,-7,5,58,7,9,3,11,1782,16,10,7,8,1,6,18,2};

        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>i){
               count++;
               sum+=array[i]*array[i];
            }
        }

        System.out.println(sum/count);
    }
}
