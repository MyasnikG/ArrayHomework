public class Exercise249 {

    public static void main(String[] args) {

        int [] array = {-5,9,3,-1,2,70,-2,117,-500,25,-75,50,-599,-155,269,733,-51,29,86,-88,-60,-800,60,-200,500};

        int k = 5;
        int count=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>0 && array[i]-i>k) {
                count++;
            } else if (array[i]<0 && -(array[i])-i>k){
                count++;
            }
        }

        System.out.println(count);
    }
}
