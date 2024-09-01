package codingbat.string1;

public class NonStart {
    public String nonStart(String a, String b) {
        return a.length() >= 1 && b.length() >= 1 ?
                a.substring(1).concat(b.substring(1)) : "";
    }

}
