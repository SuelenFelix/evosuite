package org.graph4j.converters;

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
import static org.graph4j.converters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PruferTreeDecoder_findMinLeaf_12693285362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term37;

    public PruferTreeDecoder_findMinLeaf_12693285362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.graph4j.converters.PruferTreeDecoder"));
        int[] term30 = (int[]) newIntArray(4);
        int[] term35 = (int[]) newIntArray(1);
        setIntElement(term30, 0, 1134449235);
        setIntElement(term30, 1, -883034806);
        setIntElement(term30, 2, 1585847225);
        setIntElement(term30, 3, 597278769);
        setField(term29, term29.getClass(), "pruferCode", term30);
        setIntElement(term35, 0, -1685132342);
        setField(term29, term29.getClass(), "degrees", term35);
        term37 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.converters.PruferTreeDecoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37;
        callMethod(klass, "findMinLeaf", argTypes, term29, args);
    }

};


