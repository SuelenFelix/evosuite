package com.voodoodyne.hattery.util;

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
import static com.voodoodyne.hattery.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TeeOutputStream_write_7198638093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;
     Object term148;
     Object term154;
     Object term156;

    public TeeOutputStream_write_7198638093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("com.voodoodyne.hattery.util.TeeOutputStream"));
        setField(term147, term147.getClass(), "one", null);
        setField(term147, term147.getClass(), "two", null);
        term148 = (byte[]) newByteArray(5);
        setByteElement(term148, 0, (byte) 18);
        setByteElement(term148, 1, (byte) -58);
        setByteElement(term148, 2, (byte) -29);
        setByteElement(term148, 3, (byte) -54);
        setByteElement(term148, 4, (byte) -10);
        term154 = new Integer(391863371);
        term156 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.util.TeeOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term148;
        args[1] = term154;
        args[2] = term156;
        callMethod(klass, "write", argTypes, term147, args);
    }

};


