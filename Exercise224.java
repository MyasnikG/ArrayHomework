public class Exercise224 {
    public static void main(String[] args) {

        int k = 10;
        int sum = 0;
        int [] array = {-5,9,70,-1,2,-2,3,25,-75,50};
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0 && array[i]<k){
                sum=sum+(array[i]*array[i]*array[i]);
            } else if (array[i]<0 && (-array[i])<k){
                sum+=(-array[i])*(-array[i])*(-array[i]);
            }
        }
        System.out.println(sum);
    }

}
