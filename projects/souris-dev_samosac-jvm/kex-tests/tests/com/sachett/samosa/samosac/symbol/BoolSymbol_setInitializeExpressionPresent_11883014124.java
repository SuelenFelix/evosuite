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

public class BoolSymbol_setInitializeExpressionPresent_11883014124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24222;
     Object term24228;

    public BoolSymbol_setInitializeExpressionPresent_11883014124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24222 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        setField(term24222, term24222.getClass(), "name", null);
        setIntField(term24222, term24222.getClass(), "firstAppearedLine", 0);
        setBooleanField(term24222, term24222.getClass(), "isInferredType", false);
        setBooleanField(term24222, term24222.getClass(), "value", false);
        setBooleanField(term24222, term24222.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term24222, term24222.getClass(), "initializeExpressionPresent", false);
        setField(term24222, term24222.getClass(), "symbolCoordinates", null);
        setField(term24222, term24222.getClass(), "symbolType", null);
        term24228 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term24228;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term24222, args);
    }

};


