package codingbat.string1;

public class Right2 {
    public String right2(String str) {
        String nstr ="";
        String start = "";
        String end = "";
        if (str.length() >= 2){
            start = str.substring(str.length()-2);
            end = str.substring(0,str.length()-2);
            return nstr = start + end;
        }
        return str;
    }
}
