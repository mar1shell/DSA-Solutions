class Solution {

    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                result.append(result.toString());
            } else if (c == '%') {
                result.reverse();
            } else if (c == '*' && result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            } else if (c != '*') {
                result.append(c);
            }
        }

        return result.toString();
    }
}
