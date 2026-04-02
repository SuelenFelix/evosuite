package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CountingSort_countingSort_19474023281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2246;

    public CountingSort_countingSort_19474023281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2246 = (int[]) newIntArray(8);
        setIntElement(term2246, 0, -27944011);
        setIntElement(term2246, 1, -20614472);
        setIntElement(term2246, 2, 1126618861);
        setIntElement(term2246, 3, 947449400);
        setIntElement(term2246, 4, -763799087);
        setIntElement(term2246, 5, 1207142014);
        setIntElement(term2246, 6, -876426634);
        setIntElement(term2246, 7, 213831054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.CountingSort");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2246;
        callMethod(klass, "countingSort", argTypes, null, args);
    }

};


