public class Exercise223 {

    public static void main(String[] args) {

        double [] array3 = {5,-8.5,74,89.1,-6,890.89,65,499.5,597.997,433.3,119.6,321.78,-99.7,496.0,285.1,-694,-823,-7};

        double x = -10.9;
        double y = 597.6;
        int count=0;

        for (int i = 0; i < array3.length; i++) {
            if(array3[i]>x && array3[i]<y){
                count++;
            }
        }
        System.out.println(count);
    }
}
