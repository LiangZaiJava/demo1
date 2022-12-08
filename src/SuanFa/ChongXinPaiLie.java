package SuanFa;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ChongXinPaiLie {
    /**
     * （统计每个字符串中各个字符出现的个数，然后进行比较；可以用计数数组实现，也可以使用hashmap的方式实现。
     * @param str1
     * @param str2
     * @return
     */
    public static Boolean PaiXu(String str1, String str2){
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for (int i=0;i<str2.length();i++){
            char c = str2.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if (map1.equals(map2)){
            return  true;
        } else{
            return false;
        }
    }

    /**
     * 对两个字符串分别排序，排序之后若相等则可以；代码书写尽可能追求模块化和简洁；
     * @param str1
     * @param str2
     * @return
     */
    public static Boolean toArray(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        System.out.println(chars1);
        System.out.println(chars2);
        String s1 = new String(chars1);
        String s2 = new String(chars2);

        return s1.equals(s2);



    }
}
