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

public class TopKFrequentElements_topKFrequent_14315449681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;
     Object term2193;
     Object term2198;

    public TopKFrequentElements_topKFrequent_14315449681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2192 = newInstance(Class.forName("leetcode.medium.TopKFrequentElements"));
        term2193 = (int[]) newIntArray(4);
        setIntElement(term2193, 0, -885788574);
        setIntElement(term2193, 1, -865722613);
        setIntElement(term2193, 2, -1551355284);
        setIntElement(term2193, 3, -1381970335);
        term2198 = new Integer(1213549815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TopKFrequentElements");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2193;
        args[1] = term2198;
        callMethod(klass, "topKFrequent", argTypes, term2192, args);
    }

};


