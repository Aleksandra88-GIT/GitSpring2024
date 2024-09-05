package codingbat.string1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int length = str.length();
        int mid = length / 2 ;
        if (str.length() >= 2){
            return str.substring(mid - 1, mid + 1);
        }
        return str;
    }
}
