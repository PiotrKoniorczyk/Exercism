class Proverb {

    private StringBuilder result = new StringBuilder();
    private String[] wordsList = {"shoe", "horse", "rider", "message", "battle", "kingdom", "nail"};

    Proverb(String[] words) {
        String[] rhyme = new String[7];
        rhyme[0] = "For want of a nail the shoe was lost.\n";
        rhyme[1] = "For want of a shoe the horse was lost.\n";
        rhyme[2] = "For want of a horse the rider was lost.\n";
        rhyme[3] = "For want of a rider the message was lost.\n";
        rhyme[4] = "For want of a message the battle was lost.\n";
        rhyme[5] = "For want of a battle the kingdom was lost.\n";
        rhyme[6] = "And all for the want of a nail.";

        for (int i = 0; i < wordsList.length; i++) {
            for (int j = 0; j < words.length ; j++) {
                if (wordsList[i].equals(words[j])){
                    result.append(rhyme[i]);
                }
            }
        }
    }
    String recite() {
        return String.valueOf(result); }
}