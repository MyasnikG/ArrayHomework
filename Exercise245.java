public class Exercise245 {
    public static void main(String[] args) {

        int [] array = {57,-85,46,-9,52,-7,502,58,991,900,1000,103,1782,169,27};

        long sum=0l;

        for (int i = 0; i < array.length; i++) {
            if((i+array[i])%3==0){
                sum+=array[i]*array[i];
            }
        }

        System.out.println(sum);
    }
}
