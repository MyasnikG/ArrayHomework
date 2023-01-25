public class Exercise231 {
    public static void main(String[] args) {

        int [] array = {-5,489,60,12,56,100,250,-58,65,33,87,20};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                sum+=array[i]*array[i];
            }
        }

        System.out.println(sum);
    }
}
