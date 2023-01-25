public class Exercise226 {

    public static void main(String[] args) {

        int [] array = {-5,9,70,-1,2,-2,3,117,-500,25,-75,50,-599,-155,269,733,-51,29,86,-88};
        int k = 150;
        int count=0;



        for (int i = 0; i < array.length; i++) {
            if(array[i]>0 && array[i]<k){
                count++;
            } else if(array[i]<0){
                if(-(array[i])<k){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
