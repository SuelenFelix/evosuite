package com.sachett.samosa.builtins;

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
import static com.sachett.samosa.builtins.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Builtins_Functions_doPutin_5435842511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1;

    public Builtins_Functions_doPutin_5435842511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term428 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term427 = ((Class) term428).getDeclaredField((String) "STRING");
        ((Field) term427).setAccessible(true);
        enum1 = ((Field) term427).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.builtins.Builtins$Functions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.codegen.function.FunctionGenerationContext");
        argTypes[1] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = enum1;
        callMethod(klass, "doPutin", argTypes, null, args);
    }

};


