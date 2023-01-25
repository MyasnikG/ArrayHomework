public class Exercise241 {
    public static void main(String[] args) {

        int [] array = {54,-85,46,-9,468,-7,9,58,991,900,1000,103,1782,169,36};

        int k = 100;
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%k==0){
                sum+=array[i];
            }
        }

        System.out.println(sum);
    }
}
