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

public class SearchInRotatedSortedArray_binarySearch_1914687922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term692;
     Object term695;
     Object term697;
     Object term699;

    public SearchInRotatedSortedArray_binarySearch_1914687922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691 = newInstance(Class.forName("leetcode.medium.SearchInRotatedSortedArray"));
        term692 = (int[]) newIntArray(2);
        setIntElement(term692, 0, -1239406390);
        setIntElement(term692, 1, 1557431527);
        term695 = new Integer(-1504890659);
        term697 = new Integer(1358829571);
        term699 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchInRotatedSortedArray");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term692;
        args[1] = term695;
        args[2] = term697;
        args[3] = term699;
        callMethod(klass, "binarySearch", argTypes, term691, args);
    }

};


