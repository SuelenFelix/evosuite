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

public class DigraphImpl_init_11040929828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172181;
     Object term172183;
     Object term172185;
     Object term172187;
     Object term172189;
     Object term172191;
     Object term172193;

    public DigraphImpl_init_11040929828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172181 = new Integer(0);
        term172183 = new Integer(0);
        term172185 = new Boolean(false);
        term172187 = new Boolean(false);
        term172189 = new Boolean(false);
        term172191 = new Integer(0);
        term172193 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.DigraphImpl");
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
        args[1] = term172181;
        args[2] = term172183;
        args[3] = term172185;
        args[4] = term172187;
        args[5] = term172189;
        args[6] = term172191;
        args[7] = term172193;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


