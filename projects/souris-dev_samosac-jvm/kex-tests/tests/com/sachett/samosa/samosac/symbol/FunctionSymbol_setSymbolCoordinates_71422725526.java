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

public class FunctionSymbol_setSymbolCoordinates_71422725526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12381;

    public FunctionSymbol_setSymbolCoordinates_71422725526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12381 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        setField(term12381, term12381.getClass(), "name", null);
        setIntField(term12381, term12381.getClass(), "firstAppearedLine", 0);
        setField(term12381, term12381.getClass(), "paramList", null);
        setField(term12381, term12381.getClass(), "returnType", null);
        setBooleanField(term12381, term12381.getClass(), "isInferredType", false);
        setBooleanField(term12381, term12381.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12381, term12381.getClass(), "initializeExpressionPresent", false);
        setField(term12381, term12381.getClass(), "symbolCoordinates", null);
        setField(term12381, term12381.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSymbolCoordinates", argTypes, term12381, args);
    }

};


