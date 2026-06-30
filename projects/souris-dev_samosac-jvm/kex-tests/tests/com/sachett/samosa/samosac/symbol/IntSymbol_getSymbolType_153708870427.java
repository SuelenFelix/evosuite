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

public class IntSymbol_getSymbolType_153708870427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28762;

    public IntSymbol_getSymbolType_153708870427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28762 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28762, term28762.getClass(), "name", null);
        setIntField(term28762, term28762.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28762, term28762.getClass(), "isInferredType", false);
        setIntField(term28762, term28762.getClass(), "value", 0);
        setBooleanField(term28762, term28762.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28762, term28762.getClass(), "initializeExpressionPresent", false);
        setField(term28762, term28762.getClass(), "symbolCoordinates", null);
        setField(term28762, term28762.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolType", argTypes, term28762, args);
    }

};


