public class Exercise213 {

    public static void main(String[] args) {

        int [] array = {5,-8,74,89,-6,890,597,433,119,-99,285,-694,-823,-7};
        int negativeCount = 0;
        int negativeSum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                negativeCount++;
                negativeSum+=array[i]*array[i];
            }
        }

        System.out.println(negativeSum/negativeCount);

    }
}
