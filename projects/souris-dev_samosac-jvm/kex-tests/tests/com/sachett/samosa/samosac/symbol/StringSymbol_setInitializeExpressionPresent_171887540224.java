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

public class StringSymbol_setInitializeExpressionPresent_171887540224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17166;
     Object term17171;

    public StringSymbol_setInitializeExpressionPresent_171887540224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17166 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        setField(term17166, term17166.getClass(), "name", null);
        setIntField(term17166, term17166.getClass(), "firstAppearedLine", 0);
        setBooleanField(term17166, term17166.getClass(), "isInferredType", false);
        setField(term17166, term17166.getClass(), "value", null);
        setBooleanField(term17166, term17166.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term17166, term17166.getClass(), "initializeExpressionPresent", false);
        setField(term17166, term17166.getClass(), "symbolCoordinates", null);
        setField(term17166, term17166.getClass(), "symbolType", null);
        term17171 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17171;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term17166, args);
    }

};


