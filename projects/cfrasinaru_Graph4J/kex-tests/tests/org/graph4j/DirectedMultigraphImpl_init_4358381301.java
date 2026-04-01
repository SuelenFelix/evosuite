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

public class DirectedMultigraphImpl_init_4358381301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129669;
     Object term129679;
     Object term129681;
     Object term129683;
     Object term129685;
     Object term129687;
     Object term129689;
     Object term129691;

    public DirectedMultigraphImpl_init_4358381301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129669 = (int[]) newIntArray(9);
        setIntElement(term129669, 0, 1165812609);
        setIntElement(term129669, 1, 768847705);
        setIntElement(term129669, 2, -1318830181);
        setIntElement(term129669, 3, -411986062);
        setIntElement(term129669, 4, 223396801);
        setIntElement(term129669, 5, -122362734);
        setIntElement(term129669, 6, -144271238);
        setIntElement(term129669, 7, 1424972713);
        setIntElement(term129669, 8, 976032868);
        term129679 = new Integer(-310064999);
        term129681 = new Integer(-2030318903);
        term129683 = new Boolean(true);
        term129685 = new Boolean(false);
        term129687 = new Boolean(true);
        term129689 = new Integer(-51718924);
        term129691 = new Integer(-117211526);
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
        args[0] = term129669;
        args[1] = term129679;
        args[2] = term129681;
        args[3] = term129683;
        args[4] = term129685;
        args[5] = term129687;
        args[6] = term129689;
        args[7] = term129691;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


