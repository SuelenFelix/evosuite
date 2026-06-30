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

public class IntSymbol_setSymbolCoordinates_36892603426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28756;

    public IntSymbol_setSymbolCoordinates_36892603426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28756 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28756, term28756.getClass(), "name", null);
        setIntField(term28756, term28756.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28756, term28756.getClass(), "isInferredType", false);
        setIntField(term28756, term28756.getClass(), "value", 0);
        setBooleanField(term28756, term28756.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28756, term28756.getClass(), "initializeExpressionPresent", false);
        setField(term28756, term28756.getClass(), "symbolCoordinates", null);
        setField(term28756, term28756.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSymbolCoordinates", argTypes, term28756, args);
    }

};


