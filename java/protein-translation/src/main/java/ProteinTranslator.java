import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        String[] rnaSequence_Split;
        rnaSequence_Split = rnaSequence.split("(?<=\\G...)");

        List<String> result= new ArrayList<>();
        label:
        for (String s : rnaSequence_Split) {
            switch (s) {
                case "AUG":
                    result.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    result.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    result.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    result.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    result.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    result.add("Cysteine");
                    break;
                case "UGG":
                    result.add("Tryptophan");
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    break label;
            }
        }
        return result;
    }
}