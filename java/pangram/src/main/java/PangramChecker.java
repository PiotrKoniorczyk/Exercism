public class PangramChecker {

    public boolean isPangram(String input) {
        char[] AllChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r',
                's', 't', 'u', 'w', 'x', 'y', 'z'};
        input = input.toLowerCase();
        char[] inputTest;
        inputTest = input.toCharArray();
        boolean isPangram = true;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < AllChar.length; j++)
                if (inputTest[i] == AllChar[j]) {
                    AllChar[j] = '0';
                }
        }
        for (char c : AllChar) {
            if (c != '0') {
                isPangram = false;
                break;
            }
        }
        return isPangram;
    }
}