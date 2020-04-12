import java.util.Arrays;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replace("-", "");
        String stringToverify_split = stringToVerify.replaceAll("[^0-9]", "");
        char[] stringToverify_char = stringToverify_split.toCharArray();
        int sbnResult = 0;

        if(stringToVerify.length() < 9 || stringToVerify.length() > 10) return false;
        if (stringToverify_split.length() == 9 && stringToVerify.toCharArray()[stringToVerify.length() - 1] != 'X') return false;



        int sum = 10;
        for (int i =0,j = 10; i<stringToverify_char.length; i++,j--) {
            sum += stringToverify_char[i] * j;

        }
        return sum%11 == 0;
    }
}


