class ResistorColorDuo {
    int value(String[] colors) {

        String[] colorList = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        int result = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < colorList.length; j++) {
                if(colorList[j] == colors[i]) {
                    if(i == 1){
                        result += j;
                    }
                    if(i == 0) {
                        result += j*10;
                    }
                }
            }
        }
        return result;
    }
}