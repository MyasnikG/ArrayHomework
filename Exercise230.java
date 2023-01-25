public class Exercise230 {
    public static void main(String[] args) {

        int [] array = {-5,9,3,-1,2,70,-2,-50,25,-75,50,-599,-15,69,-51,29,-88};
        int count=0;
        int sum = 0;
        int k = 2;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%k==0){
                sum+=(array[i]*array[i]);
                count++;
            }
        }
        System.out.println(sum/count);


    }
}
