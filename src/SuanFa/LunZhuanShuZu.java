package SuanFa;

/**189.
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 */
public class LunZhuanShuZu {
    public void rotate(int[] nums, int k) {
        for (int j=0;j<k;j++) {
            int last = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0]=last;
        }
        for (int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}
