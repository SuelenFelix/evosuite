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

public class IntArrays_contains_8587129807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155404;
     Object term155411;

    public IntArrays_contains_8587129807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155404 = (int[]) newIntArray(6);
        setIntElement(term155404, 0, -1029697642);
        setIntElement(term155404, 1, 1671019992);
        setIntElement(term155404, 2, -32514002);
        setIntElement(term155404, 3, 856774713);
        setIntElement(term155404, 4, -847369862);
        setIntElement(term155404, 5, -1783289909);
        term155411 = (int[]) newIntArray(6);
        setIntElement(term155411, 0, 1250218001);
        setIntElement(term155411, 1, 169528903);
        setIntElement(term155411, 2, 659252267);
        setIntElement(term155411, 3, -703918636);
        setIntElement(term155411, 4, 1629144178);
        setIntElement(term155411, 5, -1103184224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term155404;
        args[1] = term155411;
        callMethod(klass, "contains", argTypes, null, args);
    }

};


