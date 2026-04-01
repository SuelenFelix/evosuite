package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IntArrays_max_9003587012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155341;

    public IntArrays_max_9003587012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155341 = (int[]) newIntArray(7);
        setIntElement(term155341, 0, 1284610595);
        setIntElement(term155341, 1, -2087842218);
        setIntElement(term155341, 2, 1534899030);
        setIntElement(term155341, 3, -1608395882);
        setIntElement(term155341, 4, 1178106802);
        setIntElement(term155341, 5, -1663517707);
        setIntElement(term155341, 6, -364315103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term155341;
        callMethod(klass, "max", argTypes, null, args);
    }

};


