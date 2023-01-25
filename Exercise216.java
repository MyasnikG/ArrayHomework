public class Exercise216 {

    public static void main(String[] args) {

        int [] array = {5,-8,74,89,-6,890,597,433,119,-99,285,-694,-823,-7};
        int sum=1;

        for (int i = 0; i < array.length; i++) {
            if(i%2==0){
                sum*=array[i];
            }
        }
        System.out.println(sum);


        System.out.println();
    }
}
