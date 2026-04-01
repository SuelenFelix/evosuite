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
import java.lang.Object;

public class Edge_init_19134382085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108158;
     Object term108160;
     Object term108162;
     Object term108163;

    public Edge_init_19134382085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108158 = new Integer(-1553793374);
        term108160 = new Integer(-1182075907);
        term108162 = newInstance(Class.forName("java.lang.Object"));
        term108163 = (Object[]) newArray("java.lang.Double", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term108158;
        args[1] = term108160;
        args[2] = term108162;
        args[3] = term108163;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


