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

public class FindMinimumInRotatedSortedArray_findMin_11130744191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4301;
     Object term4302;

    public FindMinimumInRotatedSortedArray_findMin_11130744191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4301 = newInstance(Class.forName("leetcode.medium.FindMinimumInRotatedSortedArray"));
        term4302 = (int[]) newIntArray(7);
        setIntElement(term4302, 0, -963198667);
        setIntElement(term4302, 1, -1007935918);
        setIntElement(term4302, 2, 1485731037);
        setIntElement(term4302, 3, 1304396087);
        setIntElement(term4302, 4, 1782600602);
        setIntElement(term4302, 5, -185892708);
        setIntElement(term4302, 6, -203163250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.FindMinimumInRotatedSortedArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4302;
        callMethod(klass, "findMin", argTypes, term4301, args);
    }

};


