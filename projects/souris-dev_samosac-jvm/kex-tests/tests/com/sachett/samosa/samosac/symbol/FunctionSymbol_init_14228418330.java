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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class FunctionSymbol_init_14228418330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4741;
     Object term4743;
     Object enum2;
     Object term4763;
     Object term4765;
     Object term4767;
     Object term4769;

    public FunctionSymbol_init_14228418330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4741 = new Integer(-201517446);
        term4743 = new ArrayList();
        ((ArrayList) term4743).add((Object)null);
        ((ArrayList) term4743).add((Object)null);
        ((ArrayList) term4743).add((Object)null);
        ((ArrayList) term4743).add((Object)null);
        ((ArrayList) term4743).add((Object)null);
        ((ArrayList) term4743).add((Object)null);
        ((ArrayList) term4743).add((Object)null);
        Class<? extends Object> term4785 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term4784 = ((Class) term4785).getDeclaredField((String) "VOID");
        ((Field) term4784).setAccessible(true);
        enum2 = ((Field) term4784).get((Object) null);
        term4763 = new Boolean(false);
        term4765 = new Boolean(false);
        term4767 = new Boolean(true);
        Integer term4770 = new Integer(1585847225);
        Integer term4772 = new Integer(597278769);
        term4769 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4769, term4769.getClass(), "first", term4770);
        setField(term4769, term4769.getClass(), "second", term4772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.ArrayList");
        argTypes[3] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("kotlin.Pair");
        Object[] args = new Object[8];
        args[0] = "MHGKyEnwKc";
        args[1] = term4741;
        args[2] = term4743;
        args[3] = enum2;
        args[4] = term4763;
        args[5] = term4765;
        args[6] = term4767;
        args[7] = term4769;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


