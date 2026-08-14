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
import java.lang.Object;

public class ShortestPathInBinaryMatrix_shortestPathBinaryMatrix_15175324201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308;
     Object term1309;

    public ShortestPathInBinaryMatrix_shortestPathBinaryMatrix_15175324201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1308 = newInstance(Class.forName("leetcode.medium.ShortestPathInBinaryMatrix"));
        term1309 = (Object[]) newArray("[I", 5);
        int[] term1310 = (int[]) newIntArray(1);
        int[] term1312 = (int[]) newIntArray(4);
        int[] term1317 = (int[]) newIntArray(1);
        int[] term1319 = (int[]) newIntArray(1);
        int[] term1321 = (int[]) newIntArray(6);
        setIntElement(term1310, 0, -765191335);
        setElement(term1309, 0, term1310);
        setIntElement(term1312, 0, -1697741155);
        setIntElement(term1312, 1, 1295839803);
        setIntElement(term1312, 2, -1891015523);
        setIntElement(term1312, 3, -1560631747);
        setElement(term1309, 1, term1312);
        setIntElement(term1317, 0, 1215150180);
        setElement(term1309, 2, term1317);
        setIntElement(term1319, 0, -1422859977);
        setElement(term1309, 3, term1319);
        setIntElement(term1321, 0, -1972436591);
        setIntElement(term1321, 1, 68922753);
        setIntElement(term1321, 2, -220791533);
        setIntElement(term1321, 3, 1741500243);
        setIntElement(term1321, 4, -2070466617);
        setIntElement(term1321, 5, -1127721881);
        setElement(term1309, 4, term1321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ShortestPathInBinaryMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1309;
        callMethod(klass, "shortestPathBinaryMatrix", argTypes, term1308, args);
    }

};


