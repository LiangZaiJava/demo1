package SuanFa;

/**
 * 反转数组
 */
public class FanZhuanShuZu {
    public String[] FanZHuan(String[] str){
        int length = str.length;
        String temp;
        for (int i=0;i<length/2;i++){
            temp = str[i];
           str[i] = str[length-1-i];
            str[length-1-i] = temp;

        }
        return str;
    }
}
