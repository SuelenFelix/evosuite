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
     Object term123020;
     Object term123026;
     Object term123028;
     Object term123030;
     Object term123032;
     Object term123034;
     Object term123036;
     Object term123038;

    public MultigraphImpl_init_5781325061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123020 = (int[]) newIntArray(5);
        setIntElement(term123020, 0, 366626773);
        setIntElement(term123020, 1, 338417057);
        setIntElement(term123020, 2, -648138520);
        setIntElement(term123020, 3, -890741708);
        setIntElement(term123020, 4, -42340785);
        term123026 = new Integer(1597262218);
        term123028 = new Integer(-341505436);
        term123030 = new Boolean(true);
        term123032 = new Boolean(false);
        term123034 = new Boolean(true);
        term123036 = new Integer(1566670291);
        term123038 = new Integer(-1195556328);
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
        args[0] = term123020;
        args[1] = term123026;
        args[2] = term123028;
        args[3] = term123030;
        args[4] = term123032;
        args[5] = term123034;
        args[6] = term123036;
        args[7] = term123038;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


