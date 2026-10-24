class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxCountNumber=0;
        int maxCount=0;
        for(int i:map.keySet()){
            if(map.get(i)>maxCount){
                maxCountNumber=i;
                maxCount=map.get(i);
            }
        }
        return maxCountNumber;
        
    }
}