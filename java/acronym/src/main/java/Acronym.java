class Acronym {

    private String pharse;

    Acronym(String phrase) {
        this.pharse = phrase;
    }
    String get() {
        StringBuilder acronym = new StringBuilder();
        char[] pharseSplit = pharse.toCharArray();
        for (int i = 0; i < pharse.length(); i++) {
            if (i == 0) {
                acronym.append(pharseSplit[i]);
            } else if (pharseSplit[i] != ' ' && pharseSplit[i] != '-'){
                acronym.append(pharseSplit[i]);
            }
        }
        return acronym.toString().toUpperCase();
    }
}