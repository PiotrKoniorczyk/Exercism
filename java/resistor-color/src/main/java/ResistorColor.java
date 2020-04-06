class ResistorColor {
    int colorCode(String color) {
        int result = 0;
        String[] colorList = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < colorList.length; i++) {
            if(colorList[i].equals(color)){
                result = i;
            }
        }return result;
    }

    String[] colors() {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }
}
