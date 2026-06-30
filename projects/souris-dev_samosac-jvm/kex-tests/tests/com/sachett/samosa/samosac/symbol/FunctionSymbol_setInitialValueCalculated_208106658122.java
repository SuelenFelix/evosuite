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

public class FunctionSymbol_setInitialValueCalculated_208106658122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12357;
     Object term12362;

    public FunctionSymbol_setInitialValueCalculated_208106658122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12357 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        setField(term12357, term12357.getClass(), "name", null);
        setIntField(term12357, term12357.getClass(), "firstAppearedLine", 0);
        setField(term12357, term12357.getClass(), "paramList", null);
        setField(term12357, term12357.getClass(), "returnType", null);
        setBooleanField(term12357, term12357.getClass(), "isInferredType", false);
        setBooleanField(term12357, term12357.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12357, term12357.getClass(), "initializeExpressionPresent", false);
        setField(term12357, term12357.getClass(), "symbolCoordinates", null);
        setField(term12357, term12357.getClass(), "symbolType", null);
        term12362 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12362;
        callMethod(klass, "setInitialValueCalculated", argTypes, term12357, args);
    }

};


