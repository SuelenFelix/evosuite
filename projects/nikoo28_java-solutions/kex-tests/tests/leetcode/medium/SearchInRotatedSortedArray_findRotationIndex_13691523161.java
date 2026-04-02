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

public class SearchInRotatedSortedArray_findRotationIndex_13691523161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;
     Object term678;

    public SearchInRotatedSortedArray_findRotationIndex_13691523161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677 = newInstance(Class.forName("leetcode.medium.SearchInRotatedSortedArray"));
        term678 = (int[]) newIntArray(6);
        setIntElement(term678, 0, -601863069);
        setIntElement(term678, 1, 663292551);
        setIntElement(term678, 2, -1885090354);
        setIntElement(term678, 3, -2066804303);
        setIntElement(term678, 4, -1731761810);
        setIntElement(term678, 5, 197109649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchInRotatedSortedArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term678;
        callMethod(klass, "findRotationIndex", argTypes, term677, args);
    }

};


