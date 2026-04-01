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
import java.lang.Integer;

public class IntArrays_contains_8587129805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155378;
     Object term155386;

    public IntArrays_contains_8587129805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155378 = (int[]) newIntArray(7);
        setIntElement(term155378, 0, -1952164319);
        setIntElement(term155378, 1, 388885106);
        setIntElement(term155378, 2, 916107527);
        setIntElement(term155378, 3, 1371563908);
        setIntElement(term155378, 4, -1522704447);
        setIntElement(term155378, 5, -1000515034);
        setIntElement(term155378, 6, -1518043566);
        term155386 = new Integer(-1875861658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term155378;
        args[1] = term155386;
        callMethod(klass, "contains", argTypes, null, args);
    }

};


