class Solution {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += k) {
            result.append(hash(s, i, k));
        }

        return result.toString();
    }

    char hash(String s, int curr, int k) {
        int charCode = 0;

        for (int i = curr; i < curr + k; i++) {
            charCode += s.charAt(i) - 'a';
        }

        return (char) ((charCode % 26) +  'a');
    }
}
