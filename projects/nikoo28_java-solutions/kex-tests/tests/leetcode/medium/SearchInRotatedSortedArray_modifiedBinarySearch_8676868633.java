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

public class SearchInRotatedSortedArray_modifiedBinarySearch_8676868633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703;
     Object term704;
     Object term713;
     Object term715;
     Object term717;

    public SearchInRotatedSortedArray_modifiedBinarySearch_8676868633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703 = newInstance(Class.forName("leetcode.medium.SearchInRotatedSortedArray"));
        term704 = (int[]) newIntArray(8);
        setIntElement(term704, 0, -506958186);
        setIntElement(term704, 1, -507387516);
        setIntElement(term704, 2, -1970452551);
        setIntElement(term704, 3, -1896376975);
        setIntElement(term704, 4, 729658803);
        setIntElement(term704, 5, 114754804);
        setIntElement(term704, 6, 1687361082);
        setIntElement(term704, 7, 584893196);
        term713 = new Integer(497269071);
        term715 = new Integer(-1899301124);
        term717 = new Integer(-1882480155);
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
        args[0] = term704;
        args[1] = term713;
        args[2] = term715;
        args[3] = term717;
        callMethod(klass, "modifiedBinarySearch", argTypes, term703, args);
    }

};


