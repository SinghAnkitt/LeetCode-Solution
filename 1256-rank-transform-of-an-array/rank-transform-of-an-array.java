class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : newArr) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}