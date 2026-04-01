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

public class IntArrays_findDuplicate_7515860699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155435;

    public IntArrays_findDuplicate_7515860699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155435 = (int[]) newIntArray(7);
        setIntElement(term155435, 0, -1325906231);
        setIntElement(term155435, 1, 301824033);
        setIntElement(term155435, 2, 566151633);
        setIntElement(term155435, 3, 435355275);
        setIntElement(term155435, 4, 995077842);
        setIntElement(term155435, 5, -428590323);
        setIntElement(term155435, 6, -23570886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term155435;
        callMethod(klass, "findDuplicate", argTypes, null, args);
    }

};


