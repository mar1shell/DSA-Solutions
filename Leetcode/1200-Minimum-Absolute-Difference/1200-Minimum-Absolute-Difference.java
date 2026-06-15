class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE,
            currDiff;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            currDiff = arr[i] - arr[i - 1];

            if (currDiff < minDiff) {
                minDiff = currDiff;
                result = new ArrayList<>();
                result.add(new ArrayList<>(List.of(arr[i - 1], arr[i])));
            } else if (currDiff == minDiff) {
                result.add(new ArrayList<>(List.of(arr[i - 1], arr[i])));
            }
        }

        return result;
    }
}
