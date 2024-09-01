package codingbat.string1;

public class ComboString {
    public String comboString(String a, String b) {
        if (a.length() != 0 && b.length() != 0){
            if (a.length() < b.length()){
                return a + b + a;
            } else if (b.length() < a.length()){
                return b + a + b;
            }
        }
        return a + b;
    }
}
