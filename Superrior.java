public class Superrior {

    public static void main(String[] args) {
        int[] arr= {8,10,6,11,9,11};
        int c = 0;
        for(int i = 0;i<arr.length- 1; i++){
            if(arr[i] > arr[i+1]){
                c++;
            }
        }
        System.out.println(c);
    }
}