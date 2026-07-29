public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "HelLo-Naresh123@!$#@-()*%^&723Gupta";
        // way-1
        int vowels = 0, consonants = 0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'A' && ch <= 'Z')
                    || (ch >= 'a' && ch <= 'z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
        // CountVowAndCons(str);
    }

    // way-2
    public static void CountVowAndCons(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println ("Consonants: " + consonants);
        System.out.println ("Vowels: " + vowels);
    }
}
