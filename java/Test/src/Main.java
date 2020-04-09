import java.util.ArrayList;
import java.util.List;

class NaturalNumber {
    public static void main(String[] args) {
        String rnaSequence = "AUGUUC";
        String[] rnaSequence_Split ={};
        rnaSequence_Split = rnaSequence.split("(?<=\\G...)");

        List<String> result= new ArrayList<String>();
        for (int i = 0; i < rnaSequence_Split.length; i++) {
            if (rnaSequence_Split[i].equals("AUG")) {
                result.add("Methionine");
            }else if(rnaSequence_Split[i].equals("UUU") ||
                    rnaSequence_Split[i].equals("UUC")){
                result.add("Phenylalanine");
            }else if(rnaSequence_Split[i].equals("UUA") ||
                    rnaSequence_Split[i].equals("UUG")){
                result.add("Leucine");
            }else if(rnaSequence_Split[i].equals("UCU") ||
                    rnaSequence_Split[i].equals("UCC") ||
                    rnaSequence_Split[i].equals("UCA") ||
                    rnaSequence_Split[i].equals("UCG")) {
                result.add("Serine");
            }else if(rnaSequence_Split[i].equals("UAU") ||
                    rnaSequence_Split[i].equals("UAC")) {
                result.add("Tyrosine");
            }else if(rnaSequence_Split[i].equals("UGU") ||
                    rnaSequence_Split[i].equals("UGC")) {
                result.add("Cysteine");
            }else if(rnaSequence_Split[i].equals("UGG")) {
                result.add("Tryptophan");
            }else if(rnaSequence_Split[i].equals("UAA") ||
                    rnaSequence_Split[i].equals("UAG") ||
                    rnaSequence_Split[i].equals("UGA")) {
                break;
            }

        }
        System.out.println(result);



            
        }
}