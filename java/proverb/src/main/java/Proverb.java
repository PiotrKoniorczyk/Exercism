
class Proverb {
    public enum keywoard  {SHOE, HORSE, RIDER, MESSAGE, BATTLE, KINGDOM, NAIL};


    private StringBuilder result;

    Proverb(String[] words) {
        String[] rhyme = new String[7];

        rhyme[0] = "For want of a nail the shoe was lost.\n";
        rhyme[1] = "For want of a shoe the horse was lost.\n";
        rhyme[2] = "For want of a horse the rider was lost.\n";
        rhyme[3] = "For want of a rider the message was lost.\n";
        rhyme[4] = "For want of a message the battle was lost.\n";
        rhyme[5] = "For want of a battle the kingdom was lost.\n";
        rhyme[6] = "And all for the want of a nail.";


        for(String x:rhyme){
            if(words.equals("shoe")){
                result.append()
            }

        }
    }



    String recite() {
        return result; }

}
