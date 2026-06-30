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

public class BoolSymbol_init_160718676915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24160;
     Object term24162;
     Object term24164;
     Object term24166;
     Object term24168;

    public BoolSymbol_init_160718676915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24160 = new Integer(0);
        term24162 = new Boolean(false);
        term24164 = new Boolean(false);
        term24166 = new Boolean(false);
        term24168 = new Boolean(false);
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
        args[0] = null;
        args[1] = term24160;
        args[2] = term24162;
        args[3] = term24164;
        args[4] = term24166;
        args[5] = term24168;
        args[6] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


