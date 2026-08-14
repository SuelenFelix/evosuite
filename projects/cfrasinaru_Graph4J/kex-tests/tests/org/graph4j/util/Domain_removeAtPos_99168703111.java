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
     Object term10053;
     Object term10065;

    public Domain_removeAtPos_99168703111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10053 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term10055 = (int[]) newIntArray(5);
        int[] term10061 = (int[]) newIntArray(2);
        setIntField(term10053, term10053.getClass(), "vertex", 1664370474);
        setIntElement(term10055, 0, 56756754);
        setIntElement(term10055, 1, -1283242129);
        setIntElement(term10055, 2, -1400827537);
        setIntElement(term10055, 3, 1630959866);
        setIntElement(term10055, 4, 414147550);
        setField(term10053, term10053.getClass(), "values", term10055);
        setIntElement(term10061, 0, 1652909222);
        setIntElement(term10061, 1, 1130098561);
        setField(term10053, term10053.getClass(), "positions", term10061);
        setIntField(term10053, term10053.getClass(), "size", 954169543);
        term10065 = new Integer(-2124307939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10065;
        callMethod(klass, "removeAtPos", argTypes, term10053, args);
    }

};


