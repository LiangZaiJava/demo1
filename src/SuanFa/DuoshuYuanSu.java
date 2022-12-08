package SuanFa;

import java.util.HashMap;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class DuoshuYuanSu {
    //方法一，遍历查找
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        int num = (nums.length+1)/2;
        System.out.println(num);
        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);
        }
        for (int i=0;i<nums.length;i++){
            Integer inte = maps.get(nums[i]);
            if(inte>= num){
                return nums[i];
            }
        }
        return -1;
    }
   // 方法2：  排序，然后取中间位置的数，就是答案
   //方法3：摩尔排序 候选人(cand_num)初始化为nums[0]，票数count初始化为1。 当遇到与cand_num相同的数，
    // 则票数count = count + 1，否则票数count = count - 1。 当票数count为0时，更换候选人，并将票数count重置为1。 遍历完数组后，cand_num即为最终答案。
    //为何这行得通呢？ 投票法是遇到相同的则票数 + 1，遇到不同的则票数 - 1。 且“多数元素”的个数> ⌊ n/2 ⌋，其余元素的个数总和<= ⌊ n/2 ⌋。
    // 因此“多数元素”的个数 - 其余元素的个数总和 的结果 肯定 >= 1。 这就相当于每个“多数元素”和其他元素 两两相互抵消，抵消到最后肯定还剩余至少1个“多数元素”。
   public int majorityElement2(int[] nums) {
       int cand_num = nums[0], count = 1;
       for (int i = 1; i < nums.length; ++i) {
           if (cand_num == nums[i])
               ++count;
           else if (--count == 0) {
               cand_num = nums[i];
               count = 1;
           }
       }
       return cand_num;
   }


}
