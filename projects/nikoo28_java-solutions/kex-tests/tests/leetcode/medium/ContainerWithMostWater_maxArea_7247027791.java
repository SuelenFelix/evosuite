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

public class ContainerWithMostWater_maxArea_7247027791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2922;
     Object term2923;

    public ContainerWithMostWater_maxArea_7247027791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2922 = newInstance(Class.forName("leetcode.medium.ContainerWithMostWater"));
        term2923 = (int[]) newIntArray(7);
        setIntElement(term2923, 0, -1695750603);
        setIntElement(term2923, 1, 63677360);
        setIntElement(term2923, 2, 1478914037);
        setIntElement(term2923, 3, 1630231519);
        setIntElement(term2923, 4, 1460702778);
        setIntElement(term2923, 5, -1398142433);
        setIntElement(term2923, 6, -1112119058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.ContainerWithMostWater");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2923;
        callMethod(klass, "maxArea", argTypes, term2922, args);
    }

};


