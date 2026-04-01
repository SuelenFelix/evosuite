package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class ParallelFilterKruskal_MutableDouble_add_10188132852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159325;
     Object term159327;

    public ParallelFilterKruskal_MutableDouble_add_10188132852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159325 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setDoubleField(term159325, term159325.getClass(), "value", 0.4165058690194754);
        setField(term159325, term159325.getClass(), "this$0", null);
        term159327 = new Double(0.00912890953859069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term159327;
        callMethod(klass, "add", argTypes, term159325, args);
    }

};


