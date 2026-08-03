// return max no of pieces that can be obtained by making n number of cuts
public class CakeCuts {

    public static void main(String[] args) {
        int n = 5;
        int piece = 1;
        for(int i = 0; i<n; i++){
            piece = piece + i + 1;
        }
        System.out.println(piece);
    }
}