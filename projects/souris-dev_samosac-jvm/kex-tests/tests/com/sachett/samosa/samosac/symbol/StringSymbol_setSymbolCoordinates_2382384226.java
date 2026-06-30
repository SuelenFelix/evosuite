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

public class StringSymbol_setSymbolCoordinates_2382384226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17178;

    public StringSymbol_setSymbolCoordinates_2382384226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17178 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        setField(term17178, term17178.getClass(), "name", null);
        setIntField(term17178, term17178.getClass(), "firstAppearedLine", 0);
        setBooleanField(term17178, term17178.getClass(), "isInferredType", false);
        setField(term17178, term17178.getClass(), "value", null);
        setBooleanField(term17178, term17178.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term17178, term17178.getClass(), "initializeExpressionPresent", false);
        setField(term17178, term17178.getClass(), "symbolCoordinates", null);
        setField(term17178, term17178.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSymbolCoordinates", argTypes, term17178, args);
    }

};


