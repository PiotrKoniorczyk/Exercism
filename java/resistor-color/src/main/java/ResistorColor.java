class ResistorColor {
    int colorCode(String color) {
        int result = 0;
        String[] colorList = new String[10];
        colorList[0] = "Black";
        colorList[1] = "Brown";
        colorList[2] = "Red";
        colorList[3] = "Orange";
        colorList[4] = "Yellow";
        colorList[5] = "Green";
        colorList[6] = "Blue";
        colorList[7] = "Violet";
        colorList[8] = "Greyck";
        colorList[9] = "White";
        for (int i = 0; i < colorList.length; i++) {
            if(colorList[i].equals(color)){
                result = i;
            }
        }return result;
    }

    String[] colors() {
        String[] colors = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey"};

        return colors;
    }
}
