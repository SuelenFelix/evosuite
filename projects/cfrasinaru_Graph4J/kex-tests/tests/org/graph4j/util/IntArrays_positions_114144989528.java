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

public class IntArrays_positions_114144989528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155783;

    public IntArrays_positions_114144989528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155783 = (int[]) newIntArray(9);
        setIntElement(term155783, 0, 783963872);
        setIntElement(term155783, 1, -1743033474);
        setIntElement(term155783, 2, -864145311);
        setIntElement(term155783, 3, 697170821);
        setIntElement(term155783, 4, -1263154908);
        setIntElement(term155783, 5, -1969120069);
        setIntElement(term155783, 6, -400886021);
        setIntElement(term155783, 7, 1851824844);
        setIntElement(term155783, 8, 16667436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term155783;
        callMethod(klass, "positions", argTypes, null, args);
    }

};


