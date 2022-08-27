class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());


        return list.get(list.size() == 3 ? 2:0);
    }
}