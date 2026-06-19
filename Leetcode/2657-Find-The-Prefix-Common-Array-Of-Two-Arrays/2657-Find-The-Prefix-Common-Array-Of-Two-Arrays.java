class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>(), setB = new HashSet<>();
        int[] result = new int[A.length];
        int prefixCount = 0;

        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
            setB.add(B[i]);

            prefixCount = (setB.contains(A[i]))
                ? prefixCount + 1
                : prefixCount;

            prefixCount = (A[i] != B[i] && setA.contains(B[i]))
                ? prefixCount + 1
                : prefixCount;

            result[i] = prefixCount;
        }

        return result;
    }
}
