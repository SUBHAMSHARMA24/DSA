public class Permutation {

    static void Perm(String str, String result) {
        // Base Case
        if(str.length() == 0) {
            System.out.println(result);
            return;
        }

        // iterate no of times recursion for each character
        for(int i = 0; i < str.length(); i++) {
            char singleChar = str.charAt(i);
            String remString = str.substring(0, i) + str.substring(i+1);
            Perm(remString, result + singleChar);
        }
    }


    public static void main(String[] args) {
        Perm("abc", "");
    }
}