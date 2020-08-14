class Proverb {

    private StringBuilder result = new StringBuilder();

    Proverb(String[] words) {
        if(words.length>1) {
            for (int i = 0; i < words.length-1; i++) {
                result.append("For want of a ").append(words[i]).append(" the ").append(words[i + 1]).append(" was lost.\n");
            }
        }
        if(words.length != 0) result.append("And all for the want of a ").append(words[0]).append(".");
    }
    String recite() {
        return String.valueOf(result); }
}