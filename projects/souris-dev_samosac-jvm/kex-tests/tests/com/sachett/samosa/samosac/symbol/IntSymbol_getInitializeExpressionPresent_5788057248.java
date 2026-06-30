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
import java.lang.Object;
import java.lang.String;

public class IntSymbol_getInitializeExpressionPresent_5788057248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26343;

    public IntSymbol_getInitializeExpressionPresent_5788057248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26397 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term26396 = ((Class) term26397).getDeclaredField((String) "FUNCTION");
        ((Field) term26396).setAccessible(true);
        Object enum76 = ((Field) term26396).get((Object) null);
        term26343 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term26361 = newInstance(Class.forName("kotlin.Pair"));
        setField(term26343, term26343.getClass(), "name", "PsqusYmejD");
        setIntField(term26343, term26343.getClass(), "firstAppearedLine", 319853052);
        setBooleanField(term26343, term26343.getClass(), "isInferredType", true);
        setIntField(term26343, term26343.getClass(), "value", -1097563716);
        setBooleanField(term26343, term26343.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term26343, term26343.getClass(), "initializeExpressionPresent", true);
        setField(term26361, term26361.getClass(), "first", null);
        setField(term26361, term26361.getClass(), "second", null);
        setField(term26343, term26343.getClass(), "symbolCoordinates", term26361);
        setField(term26343, term26343.getClass(), "symbolType", enum76);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitializeExpressionPresent", argTypes, term26343, args);
    }

};


