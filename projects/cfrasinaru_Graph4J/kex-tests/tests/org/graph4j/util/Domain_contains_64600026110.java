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

public class Domain_contains_64600026110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157695;
     Object term157713;

    public Domain_contains_64600026110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157695 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157697 = (int[]) newIntArray(4);
        int[] term157702 = (int[]) newIntArray(9);
        setIntField(term157695, term157695.getClass(), "vertex", 917150151);
        setIntElement(term157697, 0, 1782840889);
        setIntElement(term157697, 1, 193878494);
        setIntElement(term157697, 2, -1435688324);
        setIntElement(term157697, 3, -1038908422);
        setField(term157695, term157695.getClass(), "values", term157697);
        setIntElement(term157702, 0, 1590060368);
        setIntElement(term157702, 1, 964607085);
        setIntElement(term157702, 2, -575479790);
        setIntElement(term157702, 3, -1971532577);
        setIntElement(term157702, 4, -769913313);
        setIntElement(term157702, 5, -747986191);
        setIntElement(term157702, 6, 1994068960);
        setIntElement(term157702, 7, 1782265145);
        setIntElement(term157702, 8, -5671411);
        setField(term157695, term157695.getClass(), "positions", term157702);
        setIntField(term157695, term157695.getClass(), "size", 184562456);
        term157713 = new Integer(2137046787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157713;
        callMethod(klass, "contains", argTypes, term157695, args);
    }

};


