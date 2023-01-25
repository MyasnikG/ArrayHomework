public class Exercise239 {
    public static void main(String[] args) {

        int [] array = {54,-85,46,-9,468,-7,9,58,991,900,1000,-56,109,1783,169,36,20};

        int count=0;
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%5==0){
                count++;
                sum+=array[i]*array[i];
            }

        }
        System.out.println(sum/count);
    }



}
