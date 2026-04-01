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

public class Domain_size_4011702994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157549;

    public Domain_size_4011702994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157549 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157551 = (int[]) newIntArray(0);
        int[] term157552 = (int[]) newIntArray(3);
        setIntField(term157549, term157549.getClass(), "vertex", 205984581);
        setField(term157549, term157549.getClass(), "values", term157551);
        setIntElement(term157552, 0, 1380796222);
        setIntElement(term157552, 1, 438390163);
        setIntElement(term157552, 2, 1579510408);
        setField(term157549, term157549.getClass(), "positions", term157552);
        setIntField(term157549, term157549.getClass(), "size", 398198156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term157549, args);
    }

};


