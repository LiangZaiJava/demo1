package SuanFa;

import java.util.HashMap;

public class QingGanFengFuWenZi {
    public  int expressiveWords(String s, String[] words) {
        int ans = 0;
       for (int i=0;i<words.length;i++){

           if(expand(s,words[i])){
               ans++;
           }

       }
        return ans;
    }
   public boolean expand(String s,String word){
        int i=0,j=0;
        while(i<s.length()&&j<word.length()){
            if(s.charAt(i) != word.charAt(j)){
                return false;
            }
            char chi = s.charAt(i);
            int cni= 0;
            while (i<s.length()&& chi== s.charAt(i)){
                cni++;
                i++;
            }
            int cnj = 0;
            while(j<word.length()&& chi == word.charAt(j)){
                  cnj++;
                  j++;
            }
            if(cni!=cnj&&cni<3){
                return false;
            }
            if(cni<cnj){
                return false;
            }
        }
        return i==s.length()&&j==word.length();
   }
}
