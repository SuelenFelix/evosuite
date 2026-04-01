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

public class BoundedSubsetIterator_advance_9415471993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56577;

    public BoundedSubsetIterator_advance_9415471993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56577 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        int[] term56578 = (int[]) newIntArray(8);
        int[] term56590 = (int[]) newIntArray(3);
        setIntElement(term56578, 0, 1737604630);
        setIntElement(term56578, 1, 1363336854);
        setIntElement(term56578, 2, 649098774);
        setIntElement(term56578, 3, 394089806);
        setIntElement(term56578, 4, 1726963667);
        setIntElement(term56578, 5, 1456425179);
        setIntElement(term56578, 6, -709895123);
        setIntElement(term56578, 7, -1519932258);
        setField(term56577, term56577.getClass(), "elements", term56578);
        setIntField(term56577, term56577.getClass(), "numElements", 1214021948);
        setIntField(term56577, term56577.getClass(), "maxSubsetSize", -795117444);
        setIntField(term56577, term56577.getClass(), "currentSubsetSize", -1609134843);
        setIntElement(term56590, 0, -637905866);
        setIntElement(term56590, 1, 377538185);
        setIntElement(term56590, 2, -2110389833);
        setField(term56577, term56577.getClass(), "indices", term56590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.BoundedSubsetIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term56577, args);
    }

};


