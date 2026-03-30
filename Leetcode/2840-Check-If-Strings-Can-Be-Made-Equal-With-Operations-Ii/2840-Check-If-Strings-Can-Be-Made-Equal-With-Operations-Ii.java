class Solution {
    public boolean checkStrings(String s1, String s2) {
        Map<Character, Integer> evenMap1 = new HashMap<>(), evenMap2 = new HashMap<>();
        Map<Character, Integer> oddMap1 = new HashMap<>(), oddMap2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenMap1.put(s1.charAt(i), evenMap1.getOrDefault(s1.charAt(i), 0) + 1);
            } else {
                oddMap1.put(s1.charAt(i), oddMap1.getOrDefault(s1.charAt(i), 0) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (i % 2 == 0) {
                evenMap2.put(s2.charAt(i), evenMap2.getOrDefault(s2.charAt(i), 0) + 1);
            } else {
                oddMap2.put(s2.charAt(i), oddMap2.getOrDefault(s2.charAt(i), 0) + 1);
            }
        }


        return evenMap1.equals(evenMap2) && oddMap1.equals(oddMap2);
    }
}