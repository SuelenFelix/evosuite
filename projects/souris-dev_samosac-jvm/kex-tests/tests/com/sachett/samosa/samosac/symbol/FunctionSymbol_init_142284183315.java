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

public class FunctionSymbol_init_142284183315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12319;
     Object term12321;
     Object term12323;
     Object term12325;

    public FunctionSymbol_init_142284183315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12319 = new Integer(0);
        term12321 = new Boolean(false);
        term12323 = new Boolean(false);
        term12325 = new Boolean(false);
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
        args[0] = null;
        args[1] = term12319;
        args[2] = null;
        args[3] = null;
        args[4] = term12321;
        args[5] = term12323;
        args[6] = term12325;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


