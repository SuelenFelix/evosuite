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

public class StringSymbol_getSymbolCoordinates_169826431625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17173;

    public StringSymbol_getSymbolCoordinates_169826431625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17173 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        setField(term17173, term17173.getClass(), "name", null);
        setIntField(term17173, term17173.getClass(), "firstAppearedLine", 0);
        setBooleanField(term17173, term17173.getClass(), "isInferredType", false);
        setField(term17173, term17173.getClass(), "value", null);
        setBooleanField(term17173, term17173.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term17173, term17173.getClass(), "initializeExpressionPresent", false);
        setField(term17173, term17173.getClass(), "symbolCoordinates", null);
        setField(term17173, term17173.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term17173, args);
    }

};


