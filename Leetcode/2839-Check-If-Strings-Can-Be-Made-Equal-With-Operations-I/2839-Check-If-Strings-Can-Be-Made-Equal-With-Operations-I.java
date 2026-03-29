class Solution {
    public boolean canBeEqual(String s1, String s2) {
       char[] evenSet1 = {s1.charAt(0), s1.charAt(2)};
       char[] evenSet2 = {s2.charAt(0), s2.charAt(2)};
       char[] oddSet1 = {s1.charAt(1), s1.charAt(3)};
       char[] oddSet2 = {s2.charAt(1), s2.charAt(3)};

       Arrays.sort(evenSet1);
       Arrays.sort(evenSet2);
       Arrays.sort(oddSet1);
       Arrays.sort(oddSet2);

       return Arrays.equals(evenSet1, evenSet2) && Arrays.equals(oddSet1, oddSet2);
    }
}