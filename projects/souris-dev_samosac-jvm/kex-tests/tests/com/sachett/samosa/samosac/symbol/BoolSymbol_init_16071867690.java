package com.sachett.samosa.samosac.symbol;

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
import static com.sachett.samosa.samosac.symbol.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class BoolSymbol_init_16071867690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19788;
     Object term19790;
     Object term19792;
     Object term19794;
     Object term19796;
     Object term19798;

    public BoolSymbol_init_16071867690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19788 = new Integer(812570053);
        term19790 = new Boolean(false);
        term19792 = new Boolean(false);
        term19794 = new Boolean(true);
        term19796 = new Boolean(true);
        Integer term19799 = new Integer(-2068769794);
        Integer term19801 = new Integer(-117576464);
        term19798 = newInstance(Class.forName("kotlin.Pair"));
        setField(term19798, term19798.getClass(), "first", term19799);
        setField(term19798, term19798.getClass(), "second", term19801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("kotlin.Pair");
        Object[] args = new Object[7];
        args[0] = "MYWYUeLGOp";
        args[1] = term19788;
        args[2] = term19790;
        args[3] = term19792;
        args[4] = term19794;
        args[5] = term19796;
        args[6] = term19798;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


