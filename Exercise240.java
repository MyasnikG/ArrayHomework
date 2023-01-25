public class Exercise240 {

    public static void main(String[] args) {

        int [] array = {54,-85,49,-9,468,-7,9,56,991,900,7000,-56,109,1783,169,36,20};

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
