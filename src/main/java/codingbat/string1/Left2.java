package codingbat.string1;

public class Left2 {
    public String left2(String str) {
        String nString = "";
        String start = "";
        String end = "";
        if (str.length() >= 2){
            start = str.substring(0,2);
            end = str.substring(2);
            return nString = end + start;
        }
        return str;

    }
}
