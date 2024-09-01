package codingbat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String s = "";
        if(str.length() >= 2){
            s = str.substring(str.length()-2);
        }
        return   s + s + s ;

    }
}
