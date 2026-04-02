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

public class MinimumIncrementToMakeArrayUnique_minIncrementForUnique_3336210541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;
     Object term553;

    public MinimumIncrementToMakeArrayUnique_minIncrementForUnique_3336210541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("leetcode.medium.MinimumIncrementToMakeArrayUnique"));
        term553 = (int[]) newIntArray(5);
        setIntElement(term553, 0, -2063457669);
        setIntElement(term553, 1, -1222006000);
        setIntElement(term553, 2, 2095798786);
        setIntElement(term553, 3, -1565502840);
        setIntElement(term553, 4, 344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MinimumIncrementToMakeArrayUnique");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term553;
        callMethod(klass, "minIncrementForUnique", argTypes, term552, args);
    }

};


