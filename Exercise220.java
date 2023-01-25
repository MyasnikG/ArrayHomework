public class Exercise220 {

    public static void main(String[] args) {

        int [] array = {5,-8,74,89,-6,890,597,433,119,-99,285,-694,-823,-7};
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>0){
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
    }
}
