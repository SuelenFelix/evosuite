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

public class BoolSymbol_getSymbolCoordinates_13944122725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24230;

    public BoolSymbol_getSymbolCoordinates_13944122725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24230 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        setField(term24230, term24230.getClass(), "name", null);
        setIntField(term24230, term24230.getClass(), "firstAppearedLine", 0);
        setBooleanField(term24230, term24230.getClass(), "isInferredType", false);
        setBooleanField(term24230, term24230.getClass(), "value", false);
        setBooleanField(term24230, term24230.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term24230, term24230.getClass(), "initializeExpressionPresent", false);
        setField(term24230, term24230.getClass(), "symbolCoordinates", null);
        setField(term24230, term24230.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term24230, args);
    }

};


