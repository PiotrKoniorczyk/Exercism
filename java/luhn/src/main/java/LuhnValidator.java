
class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ","");
        if(candidate.length() <= 1){
            return false;
        }
        char[]digitCheck = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (!Character.isDigit(digitCheck[i])) {
                return false;
            }
        }
        String[] candidate_split = candidate.split("");

        int sum = 0;
        for (int i = 0; i < candidate_split.length; i++) {
            if(candidate_split.length%2 == 0){
                if(i%2 ==0) {
                    int add = Integer.parseInt(candidate_split[i])*2;
                    if (add > 9) {
                        add -= 9;
                    }
                    sum += add;
                }
                else{sum += Integer.parseInt(candidate_split[i]);}
            }else {
                if(i%2 !=0){
                    int add = Integer.parseInt(candidate_split[i])*2;
                    if (add > 9) {
                        add -= 9;
                    }
                    sum += add;
                }
                else{sum += Integer.parseInt(candidate_split[i]);}
            }
        }
        return sum%10 == 0;
    }
}