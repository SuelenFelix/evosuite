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

public class PowerMenu_setMenuId_19278675184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39499;
     Object term39504;

    public PowerMenu_setMenuId_19278675184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39500 = new Integer(1113480119);
        Integer term39502 = new Integer(-159235116);
        term39499 = newInstance(Class.forName("com.org.model.PowerMenu"));
        setField(term39499, term39499.getClass(), "powerId", term39500);
        setField(term39499, term39499.getClass(), "menuId", term39502);
        term39504 = new Integer(1280384723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.PowerMenu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39504;
        callMethod(klass, "setMenuId", argTypes, term39499, args);
    }

};


