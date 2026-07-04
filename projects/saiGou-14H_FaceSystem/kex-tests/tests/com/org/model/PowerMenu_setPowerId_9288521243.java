package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PowerMenu_setPowerId_9288521243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39492;
     Object term39497;

    public PowerMenu_setPowerId_9288521243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39493 = new Integer(-1568320050);
        Integer term39495 = new Integer(398869857);
        term39492 = newInstance(Class.forName("com.org.model.PowerMenu"));
        setField(term39492, term39492.getClass(), "powerId", term39493);
        setField(term39492, term39492.getClass(), "menuId", term39495);
        term39497 = new Integer(-2011847985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.PowerMenu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39497;
        callMethod(klass, "setPowerId", argTypes, term39492, args);
    }

};


