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

public class StringSymbol_init_54554712115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17116;
     Object term17118;
     Object term17120;
     Object term17122;

    public StringSymbol_init_54554712115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17116 = new Integer(0);
        term17118 = new Boolean(false);
        term17120 = new Boolean(false);
        term17122 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("kotlin.Pair");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term17116;
        args[2] = term17118;
        args[3] = null;
        args[4] = term17120;
        args[5] = term17122;
        args[6] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


