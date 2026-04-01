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

public class PseudographImpl_init_4357987091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114474;
     Object term114476;
     Object term114478;
     Object term114480;
     Object term114482;
     Object term114484;
     Object term114486;
     Object term114488;

    public PseudographImpl_init_4357987091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114474 = (int[]) newIntArray(1);
        setIntElement(term114474, 0, -1341150554);
        term114476 = new Integer(-911676869);
        term114478 = new Integer(-315255755);
        term114480 = new Boolean(true);
        term114482 = new Boolean(true);
        term114484 = new Boolean(false);
        term114486 = new Integer(-2070324513);
        term114488 = new Integer(1920625938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.PseudographImpl");
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
        args[0] = term114474;
        args[1] = term114476;
        args[2] = term114478;
        args[3] = term114480;
        args[4] = term114482;
        args[5] = term114484;
        args[6] = term114486;
        args[7] = term114488;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


