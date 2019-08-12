package basic;

import java.io.Serializable;

/**
 * @description: basic grammar
 * @author: shanejim
 * @create: 2018-11-07 16:06
 **/
public class Basic implements Serializable {
    public static void main(String args[]) {
        int i = 1, j = 1;
        int a = i++;
        int b = ++j;
        System.out.println(a);      //1
        System.out.println(b);      //2

    }
}
