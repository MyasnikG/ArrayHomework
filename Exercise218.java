public class Exercise218 {
    public static void main(String[] args) {

        int [] array1 = {5,-1,8,-5,2,9,2,-10};
        int s = 0;
        for(int i = 0; i < array1.length; i++) {
            if(i%2!=0){
                if(array1[i]<0){
                    array1[i]=-(array1[i]);
                    s=s+array1[i];
                } else {
                    s+=array1[i];
                }
            }
        }
        System.out.println(s);
    }

}
