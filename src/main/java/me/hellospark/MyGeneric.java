package me.hellospark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lyndonzhang on 16/7/13.
 */
class GenericBase{
    public GenericBase(){
        s = new String("Generic Base");
    }
    public GenericBase(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }
    private String s = new String("Generic Base");
}

class GenericSub extends GenericBase{
    public GenericSub(){
        super("Generic Sub");
    }
    public GenericSub(String s){
        super(s);
    }


}

class GenericSubSub extends GenericSub{
    public GenericSubSub(){
        super(new String("Generic Sub Sub"));
    }

    public GenericSubSub(String s){
        super(s);
    }
}

public class MyGeneric {
    public static void printList(List<GenericBase> list){

        for(GenericBase e : list ){
            System.out.println(e);
        }
        list.add(new GenericSubSub("add a sub sub to base list"));
    }
    public static void printListWideCase(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
        //Parameter type mismatched, can not conver Genric base to ?
        //list.add(new GenericBase("Add a Generic Base to wild cast list"));
    }

    public static void printListExtendsGenericBase(List<? extends GenericBase> list){
        for(GenericBase e : list){
            System.out.println(e);
        }
        //Parameter type mismatched, can not convert Generic Sub to ? extends Generic
        //list.add(new GenericSub("Add a Gneric Sub to ? extends Generic base list"));
    }
    public static <T> void printListGeneric(List<T> list){
        for(T o : list){
            System.out.println(o);
        }
        //unexpected type
        //list.add(new T());
    }

    public static <T> void fill(T[] array, T elem) {
        for(int i = 0; i < array.length; i++)
            array[i] = elem;
    }
    public static void main(String[] args){
        List<GenericBase> list = new ArrayList<GenericBase>();
        list.add(new GenericBase());
        list.add(new GenericSubSub());

        printList(list);
        printListWideCase(list);
        printListExtendsGenericBase(list);
        printListGeneric(list);

        List<GenericSub> subList = new ArrayList<GenericSub>();
        subList.add(new GenericSub());
        subList.add(new GenericSubSub());

        //incompatible type, cannot convert List<GenericBase> to List<GenericSub>
        //printList(subList);
        printListGeneric(subList);
        printListWideCase(subList);
        printListExtendsGenericBase(subList);

        fill(new String[5], "hi");
        //fill(new String[5], 100);
        // Won't compile:
        //Class<String> cs = "abc".getClass();
        String s = "nihao";
        System.out.println(s.getClass());

        Object obj = new LinkedList<Long>();
        // Won't compile:
        // System.out.println(obj instanceof List<Long>);
    }
}
