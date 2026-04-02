package leetcode;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class RangeAddition2_maxCount_14719973371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1406;
     Object term1407;
     Object term1409;
     Object term1411;

    public RangeAddition2_maxCount_14719973371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1406 = newInstance(Class.forName("leetcode.RangeAddition2"));
        term1407 = new Integer(1953277050);
        term1409 = new Integer(1283079251);
        term1411 = (Object[]) newArray("[I", 2);
        int[] term1412 = (int[]) newIntArray(7);
        int[] term1420 = (int[]) newIntArray(2);
        setIntElement(term1412, 0, -523949691);
        setIntElement(term1412, 1, 1398204340);
        setIntElement(term1412, 2, 229204365);
        setIntElement(term1412, 3, -461771056);
        setIntElement(term1412, 4, -243422082);
        setIntElement(term1412, 5, 1384592638);
        setIntElement(term1412, 6, -1002370457);
        setElement(term1411, 0, term1412);
        setIntElement(term1420, 0, -2014576105);
        setIntElement(term1420, 1, 1296895584);
        setElement(term1411, 1, term1420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.RangeAddition2");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term1407;
        args[1] = term1409;
        args[2] = term1411;
        callMethod(klass, "maxCount", argTypes, term1406, args);
    }

};


