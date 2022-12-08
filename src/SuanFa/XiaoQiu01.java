package SuanFa;

import java.util.HashMap;

public class XiaoQiu01 {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int i = lowLimit;i<= highLimit;i++){
            int key=0;
            int count=i; //记录盒子存放小球个数
            while(count != 0){//计算小球放在哪个盒子
                  key += count %10;
                  count=count/10;
            }
            map.put(key,map.getOrDefault(key,0)+1);//getOrDefault  Map中会存储一一对应的key和value。如果在Map中存在key，则返回key所对应的的value。如果在Map中不存在key,则返回默认值。
            //判断当前盒子是不是小球最多的盒子
            res = Math.max(res,map.get(key));
        }
        return res;
    }


}
