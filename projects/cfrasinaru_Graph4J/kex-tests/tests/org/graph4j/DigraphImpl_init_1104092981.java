package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class DigraphImpl_init_1104092981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159746;
     Object term159749;
     Object term159751;
     Object term159753;
     Object term159755;
     Object term159757;
     Object term159759;
     Object term159761;

    public DigraphImpl_init_1104092981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159746 = (int[]) newIntArray(2);
        setIntElement(term159746, 0, 2005196001);
        setIntElement(term159746, 1, 1237885526);
        term159749 = new Integer(1815627372);
        term159751 = new Integer(2038078320);
        term159753 = new Boolean(false);
        term159755 = new Boolean(true);
        term159757 = new Boolean(false);
        term159759 = new Integer(-144529119);
        term159761 = new Integer(944374443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term159746;
        args[1] = term159749;
        args[2] = term159751;
        args[3] = term159753;
        args[4] = term159755;
        args[5] = term159757;
        args[6] = term159759;
        args[7] = term159761;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


