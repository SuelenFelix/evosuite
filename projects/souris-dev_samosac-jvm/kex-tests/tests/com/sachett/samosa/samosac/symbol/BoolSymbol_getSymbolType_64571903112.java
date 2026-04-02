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

public class BoolSymbol_getSymbolType_64571903112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23039;

    public BoolSymbol_getSymbolType_64571903112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23085 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term23084 = ((Class) term23085).getDeclaredField((String) "INT");
        ((Field) term23084).setAccessible(true);
        Object enum65 = ((Field) term23084).get((Object) null);
        term23039 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term23057 = newInstance(Class.forName("kotlin.Pair"));
        setField(term23039, term23039.getClass(), "name", "DPskuFUobI");
        setIntField(term23039, term23039.getClass(), "firstAppearedLine", -222941705);
        setBooleanField(term23039, term23039.getClass(), "isInferredType", true);
        setBooleanField(term23039, term23039.getClass(), "value", false);
        setBooleanField(term23039, term23039.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term23039, term23039.getClass(), "initializeExpressionPresent", true);
        setField(term23057, term23057.getClass(), "first", null);
        setField(term23057, term23057.getClass(), "second", null);
        setField(term23039, term23039.getClass(), "symbolCoordinates", term23057);
        setField(term23039, term23039.getClass(), "symbolType", enum65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolType", argTypes, term23039, args);
    }

};


