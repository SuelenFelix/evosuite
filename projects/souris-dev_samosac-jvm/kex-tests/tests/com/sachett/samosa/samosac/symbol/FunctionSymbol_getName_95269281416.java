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

public class FunctionSymbol_getName_95269281416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12327;

    public FunctionSymbol_getName_95269281416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12327 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        setField(term12327, term12327.getClass(), "name", null);
        setIntField(term12327, term12327.getClass(), "firstAppearedLine", 0);
        setField(term12327, term12327.getClass(), "paramList", null);
        setField(term12327, term12327.getClass(), "returnType", null);
        setBooleanField(term12327, term12327.getClass(), "isInferredType", false);
        setBooleanField(term12327, term12327.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12327, term12327.getClass(), "initializeExpressionPresent", false);
        setField(term12327, term12327.getClass(), "symbolCoordinates", null);
        setField(term12327, term12327.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term12327, args);
    }

};


