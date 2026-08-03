public class hashing{
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2};
        int[] hash = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            hash[arr[i]] += 1;
        }
        System.out.println(hash[1]);
    }
}