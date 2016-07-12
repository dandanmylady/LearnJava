package me.hellospark.testpackage;
import me.hellospark.*;
/**
 * Created by zhangl33 on 7/12/2016.
 */
public class TestPackage {
    /**
     * A un-public class from package me.hellospark can not be accessed from me.hellospark.testpackage.
     * The error meesage is: Error:(8, 9) java: me.hellospark.Rock is not public in me.hellospark;
     * cannot be accessed from outside package
     */
    public static void testPackage(){
        //Rock r = new Rock();
    }
}
