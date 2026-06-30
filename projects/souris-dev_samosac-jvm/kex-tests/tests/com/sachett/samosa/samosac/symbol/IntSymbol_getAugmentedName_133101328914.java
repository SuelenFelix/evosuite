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

public class IntSymbol_getAugmentedName_133101328914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28399;

    public IntSymbol_getAugmentedName_133101328914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28445 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term28444 = ((Class) term28445).getDeclaredField((String) "INT");
        ((Field) term28444).setAccessible(true);
        Object enum83 = ((Field) term28444).get((Object) null);
        term28399 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term28417 = newInstance(Class.forName("kotlin.Pair"));
        setField(term28399, term28399.getClass(), "name", "GEJABPlHSI");
        setIntField(term28399, term28399.getClass(), "firstAppearedLine", -763799087);
        setBooleanField(term28399, term28399.getClass(), "isInferredType", false);
        setIntField(term28399, term28399.getClass(), "value", 1207142014);
        setBooleanField(term28399, term28399.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term28399, term28399.getClass(), "initializeExpressionPresent", true);
        setField(term28417, term28417.getClass(), "first", null);
        setField(term28417, term28417.getClass(), "second", null);
        setField(term28399, term28399.getClass(), "symbolCoordinates", term28417);
        setField(term28399, term28399.getClass(), "symbolType", enum83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAugmentedName", argTypes, term28399, args);
    }

};


