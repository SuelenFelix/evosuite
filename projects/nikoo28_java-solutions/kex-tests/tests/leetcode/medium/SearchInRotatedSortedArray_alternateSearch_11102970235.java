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

public class SearchInRotatedSortedArray_alternateSearch_11102970235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;
     Object term738;
     Object term745;

    public SearchInRotatedSortedArray_alternateSearch_11102970235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term737 = newInstance(Class.forName("leetcode.medium.SearchInRotatedSortedArray"));
        term738 = (int[]) newIntArray(6);
        setIntElement(term738, 0, -1667990367);
        setIntElement(term738, 1, -1214628358);
        setIntElement(term738, 2, 1102721075);
        setIntElement(term738, 3, -426764678);
        setIntElement(term738, 4, -1222614956);
        setIntElement(term738, 5, -1870495012);
        term745 = new Integer(-1310015129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SearchInRotatedSortedArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term738;
        args[1] = term745;
        callMethod(klass, "alternateSearch", argTypes, term737, args);
    }

};


