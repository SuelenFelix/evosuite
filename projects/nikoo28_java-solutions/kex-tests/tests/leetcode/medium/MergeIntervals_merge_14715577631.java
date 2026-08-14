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
import java.lang.Object;

public class MergeIntervals_merge_14715577631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term182;

    public MergeIntervals_merge_14715577631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("leetcode.medium.MergeIntervals"));
        term182 = (Object[]) newArray("[I", 2);
        int[] term183 = (int[]) newIntArray(1);
        int[] term185 = (int[]) newIntArray(9);
        setIntElement(term183, 0, -1275173084);
        setElement(term182, 0, term183);
        setIntElement(term185, 0, -244121226);
        setIntElement(term185, 1, -203030934);
        setIntElement(term185, 2, -1179120542);
        setIntElement(term185, 3, -73683645);
        setIntElement(term185, 4, -226514366);
        setIntElement(term185, 5, 1193880199);
        setIntElement(term185, 6, -1087774327);
        setIntElement(term185, 7, -1530420153);
        setIntElement(term185, 8, -469968304);
        setElement(term182, 1, term185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MergeIntervals");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term182;
        callMethod(klass, "merge", argTypes, term181, args);
    }

};


