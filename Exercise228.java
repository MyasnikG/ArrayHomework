public class Exercise228 {

    public static void main(String[] args) {

        int [] array = {-5,9,3,-1,2,70,-2,117,-500,25,-75,50,-599,-155,269,733,-51,29,86,-88};
        int k = 5;
        int count=0;
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            if(i%k==0){
                System.out.println(array[i]);
                sum+=array[i];

            }
        }
        System.out.println(sum);
    }
}
