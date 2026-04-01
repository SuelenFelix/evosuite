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

public class MultigraphImpl_init_5781325061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123017;
     Object term123023;
     Object term123025;
     Object term123027;
     Object term123029;
     Object term123031;
     Object term123033;
     Object term123035;

    public MultigraphImpl_init_5781325061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123017 = (int[]) newIntArray(5);
        setIntElement(term123017, 0, 366626773);
        setIntElement(term123017, 1, 338417057);
        setIntElement(term123017, 2, -648138520);
        setIntElement(term123017, 3, -890741708);
        setIntElement(term123017, 4, -42340785);
        term123023 = new Integer(1597262218);
        term123025 = new Integer(-341505436);
        term123027 = new Boolean(true);
        term123029 = new Boolean(false);
        term123031 = new Boolean(true);
        term123033 = new Integer(1566670291);
        term123035 = new Integer(-1195556328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.MultigraphImpl");
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
        args[0] = term123017;
        args[1] = term123023;
        args[2] = term123025;
        args[3] = term123027;
        args[4] = term123029;
        args[5] = term123031;
        args[6] = term123033;
        args[7] = term123035;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


