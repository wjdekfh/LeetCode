class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(3)
                .sorted()
                .collect(Collectors.toList());

        if(list.size() == 3) {
            return list.get(0);
        }else {
            return list.get(list.size()-1);
        }
    }
}