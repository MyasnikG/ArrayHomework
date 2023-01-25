public class Exercise246 {

    public static void main(String[] args) {

        int [] array = {57,-85,46,-9,52,-7,502,58,991,900,1000,103,1782,169,27,77,90};

        int count = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(j*j==i){
                    count++;
                    sum+=array[i];
                }
            }

        }

        System.out.println(sum/count);
    }
}
