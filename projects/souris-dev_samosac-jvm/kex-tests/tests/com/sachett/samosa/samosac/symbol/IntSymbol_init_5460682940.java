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

public class IntSymbol_init_5460682940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24272;
     Object term24274;
     Object term24276;
     Object term24278;
     Object term24280;
     Object term24282;

    public IntSymbol_init_5460682940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24272 = new Integer(853609788);
        term24274 = new Boolean(true);
        term24276 = new Integer(-197820800);
        term24278 = new Boolean(false);
        term24280 = new Boolean(true);
        Integer term24283 = new Integer(590364439);
        Integer term24285 = new Integer(865208305);
        term24282 = newInstance(Class.forName("kotlin.Pair"));
        setField(term24282, term24282.getClass(), "first", term24283);
        setField(term24282, term24282.getClass(), "second", term24285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("kotlin.Pair");
        Object[] args = new Object[7];
        args[0] = "PXdVZyoJyC";
        args[1] = term24272;
        args[2] = term24274;
        args[3] = term24276;
        args[4] = term24278;
        args[5] = term24280;
        args[6] = term24282;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


