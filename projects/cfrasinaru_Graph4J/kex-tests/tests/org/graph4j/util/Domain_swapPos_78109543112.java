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
     Object term157749;
     Object term157761;
     Object term157763;

    public Domain_swapPos_78109543112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157749 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term157751 = (int[]) newIntArray(1);
        int[] term157753 = (int[]) newIntArray(6);
        setIntField(term157749, term157749.getClass(), "vertex", -689661083);
        setIntElement(term157751, 0, -1857588389);
        setField(term157749, term157749.getClass(), "values", term157751);
        setIntElement(term157753, 0, -1437583600);
        setIntElement(term157753, 1, -124983110);
        setIntElement(term157753, 2, 821533048);
        setIntElement(term157753, 3, 1848570796);
        setIntElement(term157753, 4, 1562490914);
        setIntElement(term157753, 5, 398446447);
        setField(term157749, term157749.getClass(), "positions", term157753);
        setIntField(term157749, term157749.getClass(), "size", -680519714);
        term157761 = new Integer(-642246695);
        term157763 = new Integer(-1820225871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term157761;
        args[1] = term157763;
        callMethod(klass, "swapPos", argTypes, term157749, args);
    }

};


