package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class CycleGenerator_createDigraph_799928914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2637;
     Object term2647;

    public CycleGenerator_createDigraph_799928914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2637 = newInstance(Class.forName("org.graph4j.generators.CycleGenerator"));
        int[] term2638 = (int[]) newIntArray(8);
        setIntElement(term2638, 0, -1112119058);
        setIntElement(term2638, 1, 2073858334);
        setIntElement(term2638, 2, -1693535639);
        setIntElement(term2638, 3, 1344744036);
        setIntElement(term2638, 4, -98060427);
        setIntElement(term2638, 5, -1272268399);
        setIntElement(term2638, 6, 1120271104);
        setIntElement(term2638, 7, -128435804);
        setField(term2637, term2637.getClass(), "vertices", term2638);
        term2647 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CycleGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2647;
        callMethod(klass, "createDigraph", argTypes, term2637, args);
    }

};


