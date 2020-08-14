class Hamming {
    private int HammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        if(rightStrand.equals("") && !leftStrand.equals("")){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if(leftStrand.equals("") && !rightStrand.equals("")) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand.length() != leftStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        HammingDistance = 0;
        char[] leftStrandCheck = leftStrand.toCharArray();
        char[] rightStrandCheck = rightStrand.toCharArray();
        for (int i = 0; i < leftStrand.length(); i++) {
            if(leftStrandCheck[i] != rightStrandCheck[i]){
                HammingDistance += 1;
            }
        }
    }

    public int getHammingDistance() {
        return HammingDistance;
    }
}
