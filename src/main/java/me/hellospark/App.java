/**
 *
 */
package me.hellospark;

/**
 * Hello world!
 * @author lyndonzhang
 * @version 1.0
 */

class Rock
{
    int iFriend = 5233;
    private int iPrivate = 8888;
    Rock(int i){
        System.out.println("Creating Rock " + i);
    }
}
public class App 
{
    /**
     * main method of the java application
     * @see System
     * @param args
     */
    public static void main( String[] args )
    {
        try{
            System.out.println( "The first argument is "
                + args[0]
                + "the send argument is"
                + args[1]
                + "the third argument is "
                + args[2]);

        }catch (Exception e){}


        for(int i = 1; i < 10; i++)
        {
            Rock r = new Rock(i);
            System.out.println(r.iFriend);
        }


        MyArray.testArray();


        TestFriend tf = new TestFriend();
        System.out.println(tf.iFirend);
        System.out.println(tf.iPublic);
    }
}

