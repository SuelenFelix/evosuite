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

public class FunctionSymbol_getAugmentedName_188080071829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12396;

    public FunctionSymbol_getAugmentedName_188080071829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12396 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        setField(term12396, term12396.getClass(), "name", null);
        setIntField(term12396, term12396.getClass(), "firstAppearedLine", 0);
        setField(term12396, term12396.getClass(), "paramList", null);
        setField(term12396, term12396.getClass(), "returnType", null);
        setBooleanField(term12396, term12396.getClass(), "isInferredType", false);
        setBooleanField(term12396, term12396.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12396, term12396.getClass(), "initializeExpressionPresent", false);
        setField(term12396, term12396.getClass(), "symbolCoordinates", null);
        setField(term12396, term12396.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAugmentedName", argTypes, term12396, args);
    }

};


