public class charHashing {
    public static void main(String[] args) {
        String s = "Sushma".toLowerCase();
        int hash[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.println(hash['s' - 'a']);
    }
}
