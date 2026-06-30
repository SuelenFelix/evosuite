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

public class FunctionSymbol_setInitializeExpressionPresent_98082430524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12369;
     Object term12374;

    public FunctionSymbol_setInitializeExpressionPresent_98082430524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12369 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        setField(term12369, term12369.getClass(), "name", null);
        setIntField(term12369, term12369.getClass(), "firstAppearedLine", 0);
        setField(term12369, term12369.getClass(), "paramList", null);
        setField(term12369, term12369.getClass(), "returnType", null);
        setBooleanField(term12369, term12369.getClass(), "isInferredType", false);
        setBooleanField(term12369, term12369.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12369, term12369.getClass(), "initializeExpressionPresent", false);
        setField(term12369, term12369.getClass(), "symbolCoordinates", null);
        setField(term12369, term12369.getClass(), "symbolType", null);
        term12374 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12374;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term12369, args);
    }

};


