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

public class Domain_indexOf_3069306099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157662;
     Object term157680;

    public Domain_indexOf_3069306099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157662 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157664 = (int[]) newIntArray(9);
        int[] term157674 = (int[]) newIntArray(4);
        setIntField(term157662, term157662.getClass(), "vertex", 1114815640);
        setIntElement(term157664, 0, 486811494);
        setIntElement(term157664, 1, -2052409951);
        setIntElement(term157664, 2, -1791294200);
        setIntElement(term157664, 3, 650933892);
        setIntElement(term157664, 4, 1144425920);
        setIntElement(term157664, 5, -1275485796);
        setIntElement(term157664, 6, 88256795);
        setIntElement(term157664, 7, -1199344094);
        setIntElement(term157664, 8, 1470793936);
        setField(term157662, term157662.getClass(), "values", term157664);
        setIntElement(term157674, 0, 1829162315);
        setIntElement(term157674, 1, -1197160211);
        setIntElement(term157674, 2, 1882590847);
        setIntElement(term157674, 3, -122994197);
        setField(term157662, term157662.getClass(), "positions", term157674);
        setIntField(term157662, term157662.getClass(), "size", 1183075616);
        term157680 = new Integer(214968483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157680;
        callMethod(klass, "indexOf", argTypes, term157662, args);
    }

};


