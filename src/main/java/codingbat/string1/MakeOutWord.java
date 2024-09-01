package codingbat.string1;

public class MakeOutWord {
    public String makeOutWord(String out, String word) {
        String str = out.substring(0,2).concat(word).concat(out.substring(2));
        return str;
    }
}
