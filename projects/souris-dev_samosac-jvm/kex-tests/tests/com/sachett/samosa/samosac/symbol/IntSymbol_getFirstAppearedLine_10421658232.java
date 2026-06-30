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

public class IntSymbol_getFirstAppearedLine_10421658232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24601;

    public IntSymbol_getFirstAppearedLine_10421658232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24647 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term24646 = ((Class) term24647).getDeclaredField((String) "INT");
        ((Field) term24646).setAccessible(true);
        Object enum70 = ((Field) term24646).get((Object) null);
        term24601 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term24619 = newInstance(Class.forName("kotlin.Pair"));
        setField(term24601, term24601.getClass(), "name", "qnvxzwuGKX");
        setIntField(term24601, term24601.getClass(), "firstAppearedLine", 873659088);
        setBooleanField(term24601, term24601.getClass(), "isInferredType", false);
        setIntField(term24601, term24601.getClass(), "value", -975748721);
        setBooleanField(term24601, term24601.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term24601, term24601.getClass(), "initializeExpressionPresent", true);
        setField(term24619, term24619.getClass(), "first", null);
        setField(term24619, term24619.getClass(), "second", null);
        setField(term24601, term24601.getClass(), "symbolCoordinates", term24619);
        setField(term24601, term24601.getClass(), "symbolType", enum70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstAppearedLine", argTypes, term24601, args);
    }

};


