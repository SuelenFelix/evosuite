package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SumOfUniqueElements_sumOfUnique_14312748831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term327;

    public SumOfUniqueElements_sumOfUnique_14312748831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("leetcode.easy.SumOfUniqueElements"));
        term327 = (int[]) newIntArray(6);
        setIntElement(term327, 0, 1063420942);
        setIntElement(term327, 1, 1375330971);
        setIntElement(term327, 2, -478195677);
        setIntElement(term327, 3, 972867650);
        setIntElement(term327, 4, 1655935355);
        setIntElement(term327, 5, -481533957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.SumOfUniqueElements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term327;
        callMethod(klass, "sumOfUnique", argTypes, term326, args);
    }

};


