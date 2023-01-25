public class Exercise243 {
    public static void main(String[] args) {

        int [] array = {54,-85,46,-9,468,-7,9,58,991,900,1000,103,1782,169,36};

        int t = 20;
        int count=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%t==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
