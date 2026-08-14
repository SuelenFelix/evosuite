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

public class ArrayNesting_findSetS_17578127041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1362;
     Object term1363;

    public ArrayNesting_findSetS_17578127041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1362 = newInstance(Class.forName("leetcode.ArrayNesting"));
        term1363 = (int[]) newIntArray(5);
        setIntElement(term1363, 0, -1388471422);
        setIntElement(term1363, 1, -1498296052);
        setIntElement(term1363, 2, 2098647989);
        setIntElement(term1363, 3, 1598895173);
        setIntElement(term1363, 4, 1830648570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ArrayNesting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1363;
        callMethod(klass, "findSetS", argTypes, term1362, args);
    }

};


