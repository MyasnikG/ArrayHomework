public class Exercise227 {
    public static void main(String[] args) {


        int [] array = {-5,9,70,-1,2,-2,3,117,-500,25,-75,50,-599,-155,269,733,-51,29,86,-88};
        int k = 3;
        int count=0;
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if(i%k==0){
                sum+=array[i];
                count++;
            }
        }

        System.out.println(sum/count);

    }
}
