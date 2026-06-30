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

public class BoolSymbol_isInferredType_190020086118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24182;

    public BoolSymbol_isInferredType_190020086118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24182 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        setField(term24182, term24182.getClass(), "name", null);
        setIntField(term24182, term24182.getClass(), "firstAppearedLine", 0);
        setBooleanField(term24182, term24182.getClass(), "isInferredType", false);
        setBooleanField(term24182, term24182.getClass(), "value", false);
        setBooleanField(term24182, term24182.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term24182, term24182.getClass(), "initializeExpressionPresent", false);
        setField(term24182, term24182.getClass(), "symbolCoordinates", null);
        setField(term24182, term24182.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInferredType", argTypes, term24182, args);
    }

};


