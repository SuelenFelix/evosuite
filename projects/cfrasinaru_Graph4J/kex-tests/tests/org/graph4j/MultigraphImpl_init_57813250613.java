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

public class MultigraphImpl_init_57813250613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127264;
     Object term127266;
     Object term127268;
     Object term127270;
     Object term127272;
     Object term127274;
     Object term127276;

    public MultigraphImpl_init_57813250613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127264 = new Integer(0);
        term127266 = new Integer(0);
        term127268 = new Boolean(false);
        term127270 = new Boolean(false);
        term127272 = new Boolean(false);
        term127274 = new Integer(0);
        term127276 = new Integer(0);
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
        args[0] = null;
        args[1] = term127264;
        args[2] = term127266;
        args[3] = term127268;
        args[4] = term127270;
        args[5] = term127272;
        args[6] = term127274;
        args[7] = term127276;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


