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

public class FunctionSymbol_isInitialValueCalculated_120013343721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12352;

    public FunctionSymbol_isInitialValueCalculated_120013343721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12352 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        setField(term12352, term12352.getClass(), "name", null);
        setIntField(term12352, term12352.getClass(), "firstAppearedLine", 0);
        setField(term12352, term12352.getClass(), "paramList", null);
        setField(term12352, term12352.getClass(), "returnType", null);
        setBooleanField(term12352, term12352.getClass(), "isInferredType", false);
        setBooleanField(term12352, term12352.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12352, term12352.getClass(), "initializeExpressionPresent", false);
        setField(term12352, term12352.getClass(), "symbolCoordinates", null);
        setField(term12352, term12352.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInitialValueCalculated", argTypes, term12352, args);
    }

};


