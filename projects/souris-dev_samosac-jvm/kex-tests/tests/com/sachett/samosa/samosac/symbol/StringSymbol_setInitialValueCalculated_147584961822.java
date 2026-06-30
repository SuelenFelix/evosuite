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

public class StringSymbol_setInitialValueCalculated_147584961822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17154;
     Object term17159;

    public StringSymbol_setInitialValueCalculated_147584961822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17154 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        setField(term17154, term17154.getClass(), "name", null);
        setIntField(term17154, term17154.getClass(), "firstAppearedLine", 0);
        setBooleanField(term17154, term17154.getClass(), "isInferredType", false);
        setField(term17154, term17154.getClass(), "value", null);
        setBooleanField(term17154, term17154.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term17154, term17154.getClass(), "initializeExpressionPresent", false);
        setField(term17154, term17154.getClass(), "symbolCoordinates", null);
        setField(term17154, term17154.getClass(), "symbolType", null);
        term17159 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term17159;
        callMethod(klass, "setInitialValueCalculated", argTypes, term17154, args);
    }

};


