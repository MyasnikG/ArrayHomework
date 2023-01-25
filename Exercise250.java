public class Exercise250 {

    public static void main(String[] args) {

        int [] array = {-5,9,3,-1,2,70,-2,117,-500,25,-75,50,-599,-155,269,733,-51,29,86,-88};

        long product = 1l;

        for (int i = 0; i < array.length; i++) {
         if((array[i]*i)%3==2){
             product*=array[i]*array[i];
         }
        }

        System.out.println(product);
    }
}
