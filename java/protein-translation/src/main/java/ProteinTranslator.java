import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        String[] rnaSequence_Split ={};
        rnaSequence_Split = rnaSequence.split("(?<=\\G...)");

        List<String> result= new ArrayList<String>();
        for (int i = 0; i < rnaSequence_Split.length; i++) {
            if (rnaSequence_Split[i] == "AUG") {
                result.add("Methionine");
            }else if(rnaSequence_Split[i] == "UUU"||
                    rnaSequence_Split[i] == "UUC"){
                result.add("Phenylalanine");
            }else if(rnaSequence_Split[i] == "UUA"||
                    rnaSequence_Split[i] == "UUG"){
                result.add("Leucine");
            }else if(rnaSequence_Split[i] == "UCU"||
                    rnaSequence_Split[i] == "UCC"||
                    rnaSequence_Split[i] == "UCA"||
                    rnaSequence_Split[i] == "UCG") {
                result.add("Serine");
            }else if(rnaSequence_Split[i] == "UAU"||
                    rnaSequence_Split[i] == "UAC") {
                result.add("Tyrosine");
            }else if(rnaSequence_Split[i] == "UGU"||
                    rnaSequence_Split[i] == "UGC") {
                result.add("Cysteine");
            }else if(rnaSequence_Split[i] == "UGG") {
                result.add("Tryptophan");
            }else if(rnaSequence_Split[i] == "UAA"||
                    rnaSequence_Split[i] == "UAG"||
                    rnaSequence_Split[i] == "UGA") {
                break;
            }

        }
            return result;
    }
}