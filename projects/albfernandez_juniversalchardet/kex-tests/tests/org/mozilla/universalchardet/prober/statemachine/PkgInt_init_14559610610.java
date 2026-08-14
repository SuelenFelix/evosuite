package org.mozilla.universalchardet.prober.statemachine;

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
import static org.mozilla.universalchardet.prober.statemachine.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PkgInt_init_14559610610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term39;
     Object term41;
     Object term43;
     Object term45;

    public PkgInt_init_14559610610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = new Integer(1134449235);
        term39 = new Integer(-883034806);
        term41 = new Integer(1585847225);
        term43 = new Integer(597278769);
        term45 = (int[]) newIntArray(5);
        setIntElement(term45, 0, -1685132342);
        setIntElement(term45, 1, -1456670397);
        setIntElement(term45, 2, 1622346318);
        setIntElement(term45, 3, 1048535127);
        setIntElement(term45, 4, -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.statemachine.PkgInt");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = term37;
        args[1] = term39;
        args[2] = term41;
        args[3] = term43;
        args[4] = term45;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


