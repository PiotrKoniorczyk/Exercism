class RaindropConverter {

    String convert(int number) {
        StringBuilder convert = new StringBuilder();
        if(number%3 == 0) {
            convert.append("Pling");
        }if(number%5 == 0){
            convert.append("Plang");
        }if(number%7 == 0){
            convert.append("Plong");
        }else if(number%3 !=0 && number%5 !=0 && number%7 !=0){convert.append(number);
    }
        return String.valueOf(convert);
    }
}