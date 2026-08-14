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

public class Domain_swapPos_78109543112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10074;
     Object term10086;
     Object term10088;

    public Domain_swapPos_78109543112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10074 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term10076 = (int[]) newIntArray(7);
        int[] term10084 = (int[]) newIntArray(0);
        setIntField(term10074, term10074.getClass(), "vertex", 332880714);
        setIntElement(term10076, 0, 904733719);
        setIntElement(term10076, 1, -240576356);
        setIntElement(term10076, 2, 148921829);
        setIntElement(term10076, 3, 2076458515);
        setIntElement(term10076, 4, 622248745);
        setIntElement(term10076, 5, -33243170);
        setIntElement(term10076, 6, -906823990);
        setField(term10074, term10074.getClass(), "values", term10076);
        setField(term10074, term10074.getClass(), "positions", term10084);
        setIntField(term10074, term10074.getClass(), "size", -1670324779);
        term10086 = new Integer(-1696838199);
        term10088 = new Integer(-1286086755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10086;
        args[1] = term10088;
        callMethod(klass, "swapPos", argTypes, term10074, args);
    }

};


