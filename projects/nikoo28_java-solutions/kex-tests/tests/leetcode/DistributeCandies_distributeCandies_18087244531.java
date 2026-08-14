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

public class DistributeCandies_distributeCandies_18087244531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13657;
     Object term13658;

    public DistributeCandies_distributeCandies_18087244531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13657 = newInstance(Class.forName("leetcode.DistributeCandies"));
        term13658 = (int[]) newIntArray(7);
        setIntElement(term13658, 0, -667505209);
        setIntElement(term13658, 1, 1997285343);
        setIntElement(term13658, 2, -1814671855);
        setIntElement(term13658, 3, -614200166);
        setIntElement(term13658, 4, 1243129119);
        setIntElement(term13658, 5, 346014220);
        setIntElement(term13658, 6, 1379438950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.DistributeCandies");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13658;
        callMethod(klass, "distributeCandies", argTypes, term13657, args);
    }

};


