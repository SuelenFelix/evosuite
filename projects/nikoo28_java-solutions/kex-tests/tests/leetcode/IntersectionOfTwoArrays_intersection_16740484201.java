package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IntersectionOfTwoArrays_intersection_16740484201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11402;
     Object term11403;
     Object term11404;

    public IntersectionOfTwoArrays_intersection_16740484201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11402 = newInstance(Class.forName("leetcode.IntersectionOfTwoArrays"));
        term11403 = (int[]) newIntArray(0);
        term11404 = (int[]) newIntArray(3);
        setIntElement(term11404, 0, -1355715967);
        setIntElement(term11404, 1, -972516789);
        setIntElement(term11404, 2, 720077443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.IntersectionOfTwoArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term11403;
        args[1] = term11404;
        callMethod(klass, "intersection", argTypes, term11402, args);
    }

};


