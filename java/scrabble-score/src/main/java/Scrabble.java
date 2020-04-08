class Scrabble {
    private int score = 0;

    char[] onePoint = {'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'};
    char[] twoPoint = {'D', 'G'};
    char[] threePoint = {'B', 'C', 'M', 'P'};
    char[] fourPoint = {'F', 'H', 'V', 'W', 'Y'};
    char[] fivePoint = {'K'};
    char[] eightPoint = {'J', 'X'};
    char[] tenPoint = {'Q', 'Z'};

    Scrabble(String word) {
        char[] wordSplit = word.toUpperCase().toCharArray();
        for (int i = 0; i < word.length(); i++) {
            for (char c : onePoint) {
                if (wordSplit[i] == c) {
                    score += 1;
                }
            }
            for (char c : twoPoint) {
                if (wordSplit[i] == c) {
                    score += 2;
                }
            }
            for (char c : threePoint) {
                if (wordSplit[i] == c) {
                    score += 3;
                }
            }
            for (char c : fourPoint) {
                if (wordSplit[i] == c) {
                    score += 4;
                }
            }
            for (char c : fivePoint) {
                if (wordSplit[i] == c) {
                    score += 5;
                }
            }
            for (char c : eightPoint) {
                if (wordSplit[i] == c) {
                    score += 8;
                }
            }
            for (char c : tenPoint) {
                if (wordSplit[i] == c) {
                    score += 10;
                }
            }

        }
    }
    int getScore() {
        return score;
    }
}