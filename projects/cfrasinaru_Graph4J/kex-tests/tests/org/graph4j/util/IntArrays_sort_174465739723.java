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

public class IntArrays_sort_174465739723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155732;

    public IntArrays_sort_174465739723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155732 = (int[]) newIntArray(8);
        setIntElement(term155732, 0, -1039030696);
        setIntElement(term155732, 1, 816018726);
        setIntElement(term155732, 2, -910075176);
        setIntElement(term155732, 3, 1046609887);
        setIntElement(term155732, 4, -1688646825);
        setIntElement(term155732, 5, -307509654);
        setIntElement(term155732, 6, 870251865);
        setIntElement(term155732, 7, -567067892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.util.Comparator");
        Object[] args = new Object[2];
        args[0] = term155732;
        args[1] = null;
        callMethod(klass, "sort", argTypes, null, args);
    }

};


