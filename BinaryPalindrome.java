public class BinaryPalindrome {


    public static int findReverse(int n){
        int reverse_bin = 0;

        int temp = n;
        while (temp > 0) {
            reverse_bin = (reverse_bin << 1) | (temp & 1);
            temp = temp >> 1;
        }
        return reverse_bin;
    }

    public static boolean isPalindrome(int n) {
        return n == findReverse(n);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Binary Representation Of " + n + " a palindraome is :- " + (isPalindrome(n)?" Yes":" No"));
    }
}