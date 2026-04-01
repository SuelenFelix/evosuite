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

public class DirectedMultigraphImpl_init_43583813011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133619;
     Object term133621;
     Object term133623;
     Object term133625;
     Object term133627;
     Object term133629;
     Object term133631;

    public DirectedMultigraphImpl_init_43583813011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133619 = new Integer(0);
        term133621 = new Integer(0);
        term133623 = new Boolean(false);
        term133625 = new Boolean(false);
        term133627 = new Boolean(false);
        term133629 = new Integer(0);
        term133631 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DirectedMultigraphImpl");
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
        args[1] = term133619;
        args[2] = term133621;
        args[3] = term133623;
        args[4] = term133625;
        args[5] = term133627;
        args[6] = term133629;
        args[7] = term133631;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


