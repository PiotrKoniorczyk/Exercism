class ReverseString {

    String reverse(String inputString) {
        if (inputString == "") {
            return "";
        } else {
            inputString = reverse(inputString);
            return inputString;
        }
    }
  
}