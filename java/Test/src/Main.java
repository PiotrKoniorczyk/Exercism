
class Proverb {
    public static void main(String[] args) {

        String candidate = "055 444 285a";
        candidate = candidate.replace(" ","");
        if(candidate.length() <= 0){
            System.out.println(false);}
        char[]x = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if(Character.isLetter(x[i])){
                System.out.println(false);;
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
                        sum += add;
                    } else { sum += add; }
                }
                else{sum += Integer.parseInt(candidate_split[i]);}
            }else if(candidate_split.length%2 != 0){
                if(i%2 !=0){
                    int add = Integer.parseInt(candidate_split[i])*2;
                    if (add > 9) {
                        add -= 9;
                        sum += add;
                    }else { sum += add; }
                }
                else{sum += Integer.parseInt(candidate_split[i]);}


            }

            }
        System.out.println(sum%10 == 0);











        }
}

