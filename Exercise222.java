public class Exercise222 {

    public static void main(String[] args) {

        int [] array2 = {5,-8,74,89,-6,890,65,499,597,433,119,321,-99,496,285,-694,-823,-7};
        int c = 200;
        int d = 560;
        int multiply=1;

        for (int i = 0; i < array2.length; i++) {
            if(array2[i]>=c && array2[i]<d){
                multiply*=array2[i];
            }
        }
        System.out.println(multiply);
    }
}
