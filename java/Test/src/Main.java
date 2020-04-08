import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Acronym (String phrase) {
            String acronym = "";
            char[] pharseSplit = phrase.toCharArray();
            for (int i = 0; i < phrase.length(); i++) {
                if (i == 0) {
                    acronym += String.valueOf(pharseSplit[i]);
                } else if (pharseSplit[i] == ' ') {
                    acronym += String.valueOf(pharseSplit[i + 1]);
                }
            }
        }

        System.out.println(acronim);
    }
}
