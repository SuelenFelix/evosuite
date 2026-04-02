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

public class IntSymbol_isInferredType_2826068743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24882;

    public IntSymbol_isInferredType_2826068743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24936 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term24935 = ((Class) term24936).getDeclaredField((String) "FUNCTION");
        ((Field) term24935).setAccessible(true);
        Object enum71 = ((Field) term24935).get((Object) null);
        term24882 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term24900 = newInstance(Class.forName("kotlin.Pair"));
        setField(term24882, term24882.getClass(), "name", "EdPAvpluZg");
        setIntField(term24882, term24882.getClass(), "firstAppearedLine", 433248783);
        setBooleanField(term24882, term24882.getClass(), "isInferredType", true);
        setIntField(term24882, term24882.getClass(), "value", -507944154);
        setBooleanField(term24882, term24882.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term24882, term24882.getClass(), "initializeExpressionPresent", false);
        setField(term24900, term24900.getClass(), "first", null);
        setField(term24900, term24900.getClass(), "second", null);
        setField(term24882, term24882.getClass(), "symbolCoordinates", term24900);
        setField(term24882, term24882.getClass(), "symbolType", enum71);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInferredType", argTypes, term24882, args);
    }

};


