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
     Object term79641;
     Object term79649;
     Object term79651;
     Object term79653;
     Object term79655;
     Object term79657;
     Object term79659;
     Object term79661;

    public DirectedPseudographImpl_init_5519570691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79641 = (int[]) newIntArray(7);
        setIntElement(term79641, 0, 1513786853);
        setIntElement(term79641, 1, 1635757738);
        setIntElement(term79641, 2, 1128345792);
        setIntElement(term79641, 3, -556377581);
        setIntElement(term79641, 4, 1451482001);
        setIntElement(term79641, 5, -2078292497);
        setIntElement(term79641, 6, 1009834663);
        term79649 = new Integer(-230210054);
        term79651 = new Integer(-615000850);
        term79653 = new Boolean(true);
        term79655 = new Boolean(true);
        term79657 = new Boolean(false);
        term79659 = new Integer(-753466696);
        term79661 = new Integer(1816927743);
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
        args[0] = term79641;
        args[1] = term79649;
        args[2] = term79651;
        args[3] = term79653;
        args[4] = term79655;
        args[5] = term79657;
        args[6] = term79659;
        args[7] = term79661;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


