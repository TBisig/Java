public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }

    public Integer getIndexOrNull(String str, char letter) {
        if(str.indexOf(letter) != -1) {
            return str.indexOf(letter);
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String str1, String str2) {
        if(str1.contains(str2)) {
            return str1.indexOf(str2);
        } else {
            return null;
        }
    }

    public String concatSubstring(String str1, int int1, int int2, String str2) {
        return str1.substring(int1, int2) + str2;
    }
}