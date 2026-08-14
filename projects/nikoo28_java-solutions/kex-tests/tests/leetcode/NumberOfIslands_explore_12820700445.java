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
import java.lang.Integer;

public class NumberOfIslands_explore_12820700445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6485;
     Object term6486;
     Object term6488;

    public NumberOfIslands_explore_12820700445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6485 = newInstance(Class.forName("leetcode.NumberOfIslands"));
        term6486 = new Integer(0);
        term6488 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term6486;
        args[2] = term6488;
        callMethod(klass, "explore", argTypes, term6485, args);
    }

};


