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

public class IntSymbol_isInitialValueCalculated_1169801486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25756;

    public IntSymbol_isInitialValueCalculated_1169801486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25802 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term25801 = ((Class) term25802).getDeclaredField((String) "INT");
        ((Field) term25801).setAccessible(true);
        Object enum74 = ((Field) term25801).get((Object) null);
        term25756 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term25774 = newInstance(Class.forName("kotlin.Pair"));
        setField(term25756, term25756.getClass(), "name", "ZfBIVGBQOE");
        setIntField(term25756, term25756.getClass(), "firstAppearedLine", -330897705);
        setBooleanField(term25756, term25756.getClass(), "isInferredType", true);
        setIntField(term25756, term25756.getClass(), "value", 1065595802);
        setBooleanField(term25756, term25756.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term25756, term25756.getClass(), "initializeExpressionPresent", true);
        setField(term25774, term25774.getClass(), "first", null);
        setField(term25774, term25774.getClass(), "second", null);
        setField(term25756, term25756.getClass(), "symbolCoordinates", term25774);
        setField(term25756, term25756.getClass(), "symbolType", enum74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInitialValueCalculated", argTypes, term25756, args);
    }

};


