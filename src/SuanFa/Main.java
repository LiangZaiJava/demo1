package SuanFa;

public class Main {
    public static void main(String[] args) {
//        XiaoQiu01 qiu01 = new XiaoQiu01();
//        int i = qiu01.countBalls(1, 10);
//        System.out.println(i);

        /**
         * 反转字符串
         */
//        String[] strings = new String[]{"h","e","l","l","o"};
//        FanZhuanShuZu zu = new FanZhuanShuZu();
//        String[] strings1 = zu.FanZHuan(strings);
//        for (int i = 0;i<strings1.length;i++){
//            System.out.println(strings1[i]+" ");
//        }

        /**
         * 判断字符是否重新排列
         */
//        String str1 = "abababba";
//        String str2 = "abababba";
//
//        Boolean aBoolean = ChongXinPaiLie.toArray(str1, str2);
//        System.out.println(aBoolean);
        /**
         * 情感丰富的文字
         * https://leetcode.cn/problems/expressive-words/
         */
//        String[] strs = {"hello", "hi", "helo","hello","hello"};
//        QingGanFengFuWenZi wenZi = new QingGanFengFuWenZi();
//        System.out.println( wenZi.expressiveWords("heeellooo",strs));

        /**
         *  Solution 重点！！！！
         */
//        int[] ints = new int[]{2,2,1};
//        Solution solution = new Solution();
//        int i = solution.singleNumber(ints);
//        System.out.println(i);


        /**
         * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
         *
         * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
         */
//        int[] ints = new int[]{3,2,3};
//        DuoshuYuanSu duoshuYuanSu = new DuoshuYuanSu();
//        System.out.println(duoshuYuanSu.majorityElement(ints));

        /**
         * 二分查找 704
         */
//        int[] ints1 = new int []{5};
//        ErFenChZhao erFenChZhao = new ErFenChZhao();
//        System.out.println(erFenChZhao.search(ints1,5));

        /**
         *坏掉的零件
         */
//        CuoWuBanBen banBen = new CuoWuBanBen();
//        System.out.println(banBen.firstBadVersion(3));

        /**
         * 搜索插入位置  35
         */
//        int[] ints1 = new int []{1,3,5,6};
//        SouSuoChaRuWeiZhi weiZhi = new SouSuoChaRuWeiZhi();
//        System.out.println(weiZhi.searchInsert(ints1,7));
        /**
         * 轮转数组
         */
        int[] ints1 = new int []{1,2,3,4,5,6,7};
        LunZhuanShuZu lunZhuanShuZu = new LunZhuanShuZu();
        lunZhuanShuZu.rotate(ints1,3);
    }
}
