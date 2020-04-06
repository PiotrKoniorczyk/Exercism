class ReverseString {
    String reverse(String inputString) {
        StringBuilder inputString_rev = new StringBuilder();

        inputString_rev.append(inputString);

        return inputString_rev.reverse().toString();
    }
}
