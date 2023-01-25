public class Exercise221 {
    public static void main(String[] args) {

        int [] array2 = {5,-8,74,89,-6,890,65,499,597,433,119,321,-99,496,285,-694,-823,-7};
        int a = 50;
        int b = 500;
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            if(array2[i]>=a && array2[i]<=b){
                sum+=array2[i];
            }
        }
    }
}
