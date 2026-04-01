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

public class DirectedPseudographImpl_init_55195706914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84764;
     Object term84766;
     Object term84768;
     Object term84770;
     Object term84772;
     Object term84774;
     Object term84776;

    public DirectedPseudographImpl_init_55195706914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84764 = new Integer(0);
        term84766 = new Integer(0);
        term84768 = new Boolean(false);
        term84770 = new Boolean(false);
        term84772 = new Boolean(false);
        term84774 = new Integer(0);
        term84776 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedPseudographImpl");
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
        args[0] = null;
        args[1] = term84764;
        args[2] = term84766;
        args[3] = term84768;
        args[4] = term84770;
        args[5] = term84772;
        args[6] = term84774;
        args[7] = term84776;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


