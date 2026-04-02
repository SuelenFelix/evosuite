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
import java.lang.Integer;

public class SearchA2DMatrix_searchMatrix_20639951641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2341;
     Object term2342;
     Object term2354;

    public SearchA2DMatrix_searchMatrix_20639951641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2341 = newInstance(Class.forName("leetcode.medium.SearchA2DMatrix"));
        term2342 = (Object[]) newArray("[I", 4);
        int[] term2343 = (int[]) newIntArray(1);
        int[] term2345 = (int[]) newIntArray(0);
        int[] term2346 = (int[]) newIntArray(1);
        int[] term2348 = (int[]) newIntArray(5);
        setIntElement(term2343, 0, -497534255);
        setElement(term2342, 0, term2343);
        setElement(term2342, 1, term2345);
        setIntElement(term2346, 0, 1588942911);
        setElement(term2342, 2, term2346);
        setIntElement(term2348, 0, -2129828854);
        setIntElement(term2348, 1, -47438786);
        setIntElement(term2348, 2, -1955400589);
        setIntElement(term2348, 3, 626179200);
        setIntElement(term2348, 4, -511077684);
        setElement(term2342, 3, term2348);
        term2354 = new Integer(-711507760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchA2DMatrix");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2342;
        args[1] = term2354;
        callMethod(klass, "searchMatrix", argTypes, term2341, args);
    }

};


