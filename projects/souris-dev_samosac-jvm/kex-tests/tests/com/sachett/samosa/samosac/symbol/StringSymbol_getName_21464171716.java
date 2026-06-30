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

public class StringSymbol_getName_21464171716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17124;

    public StringSymbol_getName_21464171716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17124 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        setField(term17124, term17124.getClass(), "name", null);
        setIntField(term17124, term17124.getClass(), "firstAppearedLine", 0);
        setBooleanField(term17124, term17124.getClass(), "isInferredType", false);
        setField(term17124, term17124.getClass(), "value", null);
        setBooleanField(term17124, term17124.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term17124, term17124.getClass(), "initializeExpressionPresent", false);
        setField(term17124, term17124.getClass(), "symbolCoordinates", null);
        setField(term17124, term17124.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term17124, args);
    }

};


