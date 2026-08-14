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
     Object term8124;
     Object term8125;

    public IslandPerimeter_islandPerimeter_2523033971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8124 = newInstance(Class.forName("leetcode.IslandPerimeter"));
        term8125 = (Object[]) newArray("[I", 3);
        int[] term8126 = (int[]) newIntArray(0);
        int[] term8127 = (int[]) newIntArray(9);
        int[] term8137 = (int[]) newIntArray(9);
        setElement(term8125, 0, term8126);
        setIntElement(term8127, 0, 1422430512);
        setIntElement(term8127, 1, 1796581482);
        setIntElement(term8127, 2, 1286440081);
        setIntElement(term8127, 3, -928538452);
        setIntElement(term8127, 4, -1313207353);
        setIntElement(term8127, 5, 402612318);
        setIntElement(term8127, 6, -1628481565);
        setIntElement(term8127, 7, -217226756);
        setIntElement(term8127, 8, 1608000247);
        setElement(term8125, 1, term8127);
        setIntElement(term8137, 0, 1354560887);
        setIntElement(term8137, 1, -749474542);
        setIntElement(term8137, 2, -47907780);
        setIntElement(term8137, 3, 1131462369);
        setIntElement(term8137, 4, -1161206731);
        setIntElement(term8137, 5, -992847709);
        setIntElement(term8137, 6, 1125156671);
        setIntElement(term8137, 7, 1203107925);
        setIntElement(term8137, 8, 1825448944);
        setElement(term8125, 2, term8137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.IslandPerimeter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8125;
        callMethod(klass, "islandPerimeter", argTypes, term8124, args);
    }

};


