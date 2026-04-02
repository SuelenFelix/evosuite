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
import java.lang.Object;

public class IslandPerimeter_islandPerimeter_2523033971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8181;
     Object term8182;

    public IslandPerimeter_islandPerimeter_2523033971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8181 = newInstance(Class.forName("leetcode.IslandPerimeter"));
        term8182 = (Object[]) newArray("[I", 3);
        int[] term8183 = (int[]) newIntArray(2);
        int[] term8186 = (int[]) newIntArray(3);
        int[] term8190 = (int[]) newIntArray(0);
        setIntElement(term8183, 0, -1858635791);
        setIntElement(term8183, 1, 1919079331);
        setElement(term8182, 0, term8183);
        setIntElement(term8186, 0, 144872711);
        setIntElement(term8186, 1, -720037395);
        setIntElement(term8186, 2, 1232105469);
        setElement(term8182, 1, term8186);
        setElement(term8182, 2, term8190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.IslandPerimeter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8182;
        callMethod(klass, "islandPerimeter", argTypes, term8181, args);
    }

};


