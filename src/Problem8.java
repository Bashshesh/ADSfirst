public class Problem8 {
    public static boolean isAllDigits(String s) {
        //an empty string is considered all digits
        if (s.isEmpty()) {
            return true;
        }
        // check if the first character is a digit and recurse on the rest of the string
        else {
            char firstChar = s.charAt(0);
            if (Character.isDigit(firstChar)) {
                return isAllDigits(s.substring(1));
            } else {
                return false;
            }
        }
    }
}