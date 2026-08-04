public class BitwiseOperator{
    public static void main(String[] args) {
        // System.out.println(10 << 2);
        // System.out.println(10 >> 1);
        // System.out.println(6 & 10);
        // System.out.println(6|10);
        // System.out.println(6^10);
        // System.out.println((5 - 2) * 6);
        // Rules of associativity(*,/,%)(precendence left to right)
        // In a single expression we have operators with same precedence
        // unary operators(!, +, -) ->precendence Right to left 
        // System.out.println(4*5 % 2);
        // Figure out how to find a number if a number is power of 2 without any loop
        // scope
        int x = 6;
        if(x > 0 && (x & (x-1)) == 0){
            System.out.println("yes number is power of 2");
        }else{
            System.out.println("not power of 2");
        }
        // WAF to reverse an Integer n.
    }
}