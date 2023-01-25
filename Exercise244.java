public class Exercise244 {
    public static void main(String[] args) {

        int [] array = {57,-85,46,-9,52,-7,502,58,991,900,1000,103,1782,169,27};

        long product=1l;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%5==2){
                product*=array[i];
            }
        }

        System.out.println(product);
    }
}
