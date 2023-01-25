public class Exercise237 {

    public static void main(String[] args) {

        int [] array = {0,54,-85,0,46,-9,468,-7,0,58,991,900,1000,103,1782,169,0,0};

        int count = 0;

        for (int z: array) {
            if(z==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
