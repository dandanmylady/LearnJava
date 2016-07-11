package me.hellospark;

/**
 * Created by lyndonzhang on 16/7/11.
 * Play with Array
 */
public class MyArray {
    public static  void testArray()
    {
        int[] a  = {1,2,3,4};
        int[] b = a;
        int[] c = new int[10];
        for(int i : a){
            System.out.println(i);
        }
        for(int i : b){
            System.out.println(i);
        }
        for(int i : c){
            System.out.println(i);
        }
    }
}

class TestFriend {
    int iFirend = 88;
    public int iPublic = 99;
}
