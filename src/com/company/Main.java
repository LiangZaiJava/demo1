package com.company;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //hanoi(4, "a", "b","c");
        int[] array={1,2,3,4,5,6,7};
        int need1 = 7;
        int need2 = 4;
        //顺序查找
       // ShunXuSearch(array,need1);
       // ShunXuSearch(array,need2);

        //折半查找
        //ZheBanSearch(array,7);

// 冒泡排序
        int[] array1={5,0,6,8,7,4,1,2,3,9};
       // MaoPaoSort(array1);

        //选择排序
      //  SelectSearch(array1);

        //插入排序
     //   SetSort(array1);
        int[] ints = QuickSort(array1, 0, array1.length - 1);
        for(int m = 0;m < ints.length; m++ ){
            System.out.print(ints[m] + " ");
        }


    }
    public static void hanoi(int n, String a, String b, String c){
        if(n>0){
           hanoi(n-1,a,c,b);
            System.out.printf("%d 从 %s，移动到 %s\n",n,a,c);
           hanoi(n-1,b,a,c);
        }
    }

    public static void ShunXuSearch(int[] list,int need ){
        for (int i=0;i<list.length;i++){
            if (list[i]==need){
                System.out.printf("找到%d了，下标为%d\n",need,i);
                break;
            }
            if(i==list.length-1 && list[list.length-1]!=need){
                System.out.printf("没找到\n");
            }
        }
    }
    public static void ZheBanSearch(int[] list,int need ) {
        Boolean is = true;

        int left = list[0];
        int right = list[list.length-1];

        while(is){
            int mid = (left+right)/2;
            if(list[mid] == need){
                System.out.printf("找到了%d,下标为%d",need,mid);
                break;
            }else if(list[mid] > need){
                right = mid-1;

            }else {
                left = mid + 1;
            }
            if (right<=left){
                System.out.println("没有找到");
                break;
            }

        }

    }
    //冒泡排序
    public static void  MaoPaoSort(int[] list){
        for (int i = 0;i< list.length-1 ;i++){
            Boolean exchange = false;
            for (int j = 0; j< list.length-i-1;j++){
                if(list[j]> list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    exchange = true;
                }
            }
            for (int m=0;m< list.length;m++){
               System.out.print(list[m] + " ");
            }
            if (exchange == false)
                break;
            System.out.print("\n");
        }
    }
    //选择排序
    public static void SelectSearch(int[] list){
        for (int i = 0;i < list.length-1; i++){
            int min = i;
            Boolean exchange = false;
            for (int j = i+1;j< list.length;j++){
                if(list[min]>list[j]){
                    min = j;
                    exchange = true;
                }

            }
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
            for (int m=0;m< list.length;m++){
                System.out.print(list[m] + " ");
            }
            System.out.println();
        }
    }
    //插入排序
    public static void SetSort(int[] list) {
       for(int i=1;i<list.length;i++){
           int j=i-1;
           int temp =list[i];
           while(j >= 0&& list[j] >temp){
             //如果list[i]小于前面的list[j]，将list[j]后移
                   list[j+1] = list[j];
                   j -= 1;
           }
           list[j+1] = temp;

       }
        for (int m=0;m< list.length;m++){
            System.out.print(list[m] + " ");
        }
        System.out.println();
    }


    //快速排序
    public static int[]  QuickSort(int[] list,int left, int right){
        if(right > left){ //list 至少两个元素
            int mid = partation(list,left,right);
            QuickSort(list,left,mid - 1);
            QuickSort(list,mid + 1,right) ;
        }
        return list;

    }
    public static int partation(int[] list,int left,int right){
        int tmp = list[left];
        while(left<right){
          while (list[right]>=tmp && left < right){ //如果右边的数不小于tmp，reght向左移一位
              right -= 1;
          }
          list[left] = list[right];//右边值写道左边空weizhi
          while (list[left]<=tmp && left < right){
              left += 1;
          }
          list[right] = list [left];
        }
        list[left] = tmp ;
        return left;

    }
}

