public class Exercise212 {

    public static void main(String[] args) {

        int [] array = {5,-8,74,89,-6,890,597,433,119,-99,285,-694,-823,-7};
        int positiveCount = 0;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                positiveCount++;
                sum+=array[i]*array[i];
            }
        }

        System.out.println(sum/positiveCount);
    }
}
