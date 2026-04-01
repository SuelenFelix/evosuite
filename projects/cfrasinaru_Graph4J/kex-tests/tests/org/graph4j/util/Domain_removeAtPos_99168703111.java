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

public class Domain_removeAtPos_99168703111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157728;
     Object term157740;

    public Domain_removeAtPos_99168703111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157728 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157730 = (int[]) newIntArray(2);
        int[] term157733 = (int[]) newIntArray(5);
        setIntField(term157728, term157728.getClass(), "vertex", 2013563704);
        setIntElement(term157730, 0, 642172513);
        setIntElement(term157730, 1, -486904397);
        setField(term157728, term157728.getClass(), "values", term157730);
        setIntElement(term157733, 0, -1472262332);
        setIntElement(term157733, 1, -1763980750);
        setIntElement(term157733, 2, 1177881571);
        setIntElement(term157733, 3, -474531960);
        setIntElement(term157733, 4, -181298858);
        setField(term157728, term157728.getClass(), "positions", term157733);
        setIntField(term157728, term157728.getClass(), "size", -1015873134);
        term157740 = new Integer(-1975728956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157740;
        callMethod(klass, "removeAtPos", argTypes, term157728, args);
    }

};


