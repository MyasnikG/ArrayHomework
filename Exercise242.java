public class Exercise242 {
    public static void main(String[] args) {

        int [] array = {54,-85,46,-9,468,-7,9,58,991,900,1000,103,1782,169,36};

        int m = 25;
        int product=1;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%m==0){
                product*=array[i];
            }
        }

        System.out.println(product);
    }
}
