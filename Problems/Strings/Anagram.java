package Problems.Strings;

public class Anagram {

    static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }

        for (int count : frequency) {

            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }
}
