class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int digitNumber = String.valueOf(numberToCheck).length();
		String[] splitDigit =  String.valueOf(numberToCheck).split("");

		int result = 0;
		for (int i = 0; i < digitNumber; i++) {
			double add = Math.pow((Integer.valueOf(splitDigit[i])),digitNumber);
			result += add;
		}
		return numberToCheck == result;
	}

}
