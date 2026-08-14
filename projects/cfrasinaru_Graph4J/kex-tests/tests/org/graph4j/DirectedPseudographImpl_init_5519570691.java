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

public class DirectedPseudographImpl_init_5519570691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79644;
     Object term79652;
     Object term79654;
     Object term79656;
     Object term79658;
     Object term79660;
     Object term79662;
     Object term79664;

    public DirectedPseudographImpl_init_5519570691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79644 = (int[]) newIntArray(7);
        setIntElement(term79644, 0, 1513786853);
        setIntElement(term79644, 1, 1635757738);
        setIntElement(term79644, 2, 1128345792);
        setIntElement(term79644, 3, -556377581);
        setIntElement(term79644, 4, 1451482001);
        setIntElement(term79644, 5, -2078292497);
        setIntElement(term79644, 6, 1009834663);
        term79652 = new Integer(-230210054);
        term79654 = new Integer(-615000850);
        term79656 = new Boolean(true);
        term79658 = new Boolean(true);
        term79660 = new Boolean(false);
        term79662 = new Integer(-753466696);
        term79664 = new Integer(1816927743);
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
        args[0] = term79644;
        args[1] = term79652;
        args[2] = term79654;
        args[3] = term79656;
        args[4] = term79658;
        args[5] = term79660;
        args[6] = term79662;
        args[7] = term79664;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


