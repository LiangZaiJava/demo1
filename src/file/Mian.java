package file;

import com.sun.javaws.IconUtil;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Mian {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("example.txt");
//        String txt = "文本";
//        byte[] bytes =  txt.getBytes(StandardCharsets.UTF_8);
//        for (int i=0;i<bytes.length;i++){
//            fileOutputStream.write(bytes[i]);
//        }
//        fileOutputStream.close();

//        BufferedReader bufferedReader= new BufferedReader(new FileReader("example.txt"));
//        String b ;
//        byte[] buff = new byte[3072];
//        while (true){
//            b = bufferedReader.readLine();
//
//            if(b ==null){
//                break;
//            }
//            System.out.println( b);
//        }
//        bufferedReader.close();、

        //冒泡排序
       Scanner input =  new Scanner(System.in);
       int sort[] = new int[10];
       int temp ;
        for (int i = 0; i < 10; i++) {
            sort[i] = input.nextInt();
        }
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length-i-1; j++) {
                if(sort[j] > sort[j+1]){
                    temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
         }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(sort[i]);
        }
    }
}
