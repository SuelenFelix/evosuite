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
import java.lang.Boolean;

public class IntSymbol_setInitializeExpressionPresent_206397759424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28742;
     Object term28748;

    public IntSymbol_setInitializeExpressionPresent_206397759424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28742 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28742, term28742.getClass(), "name", null);
        setIntField(term28742, term28742.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28742, term28742.getClass(), "isInferredType", false);
        setIntField(term28742, term28742.getClass(), "value", 0);
        setBooleanField(term28742, term28742.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28742, term28742.getClass(), "initializeExpressionPresent", false);
        setField(term28742, term28742.getClass(), "symbolCoordinates", null);
        setField(term28742, term28742.getClass(), "symbolType", null);
        term28748 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term28748;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term28742, args);
    }

};


