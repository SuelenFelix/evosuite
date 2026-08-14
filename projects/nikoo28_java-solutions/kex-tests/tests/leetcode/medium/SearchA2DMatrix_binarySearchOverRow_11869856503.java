package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class SearchA2DMatrix_binarySearchOverRow_11869856503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2388;
     Object term2389;
     Object term2391;
     Object term2413;

    public SearchA2DMatrix_binarySearchOverRow_11869856503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2388 = newInstance(Class.forName("leetcode.medium.SearchA2DMatrix"));
        term2389 = new Integer(-1511130237);
        term2391 = (Object[]) newArray("[I", 4);
        int[] term2392 = (int[]) newIntArray(8);
        int[] term2401 = (int[]) newIntArray(0);
        int[] term2402 = (int[]) newIntArray(5);
        int[] term2408 = (int[]) newIntArray(4);
        setIntElement(term2392, 0, 452088587);
        setIntElement(term2392, 1, -1630069454);
        setIntElement(term2392, 2, 1499735894);
        setIntElement(term2392, 3, 716486048);
        setIntElement(term2392, 4, -466708718);
        setIntElement(term2392, 5, 1038029515);
        setIntElement(term2392, 6, 1137154606);
        setIntElement(term2392, 7, -100681578);
        setElement(term2391, 0, term2392);
        setElement(term2391, 1, term2401);
        setIntElement(term2402, 0, 296568835);
        setIntElement(term2402, 1, 1431951992);
        setIntElement(term2402, 2, -1608123016);
        setIntElement(term2402, 3, -896473214);
        setIntElement(term2402, 4, 401203924);
        setElement(term2391, 2, term2402);
        setIntElement(term2408, 0, -1212399479);
        setIntElement(term2408, 1, 2107679041);
        setIntElement(term2408, 2, 2040965507);
        setIntElement(term2408, 3, -1281083262);
        setElement(term2391, 3, term2408);
        term2413 = new Integer(1059930704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchA2DMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2389;
        args[1] = term2391;
        args[2] = term2413;
        callMethod(klass, "binarySearchOverRow", argTypes, term2388, args);
    }

};


