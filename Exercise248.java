public class Exercise248 {

    public static void main(String[] args) {

        int [] array = {57,-85,46,-9,52,-7,502,58,991,900,1000,103,1782,169,27};

        int k = 10;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(((array[i]+i)*(array[i]+i))%k==0){
                sum+=array[i];
            }
        }

        System.out.println(sum);
    }

}
