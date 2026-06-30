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
import java.lang.Object;
import java.lang.String;

public class BoolSymbol_isInferredType_19002008613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20430;

    public BoolSymbol_isInferredType_19002008613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20480 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term20479 = ((Class) term20480).getDeclaredField((String) "BOOL");
        ((Field) term20479).setAccessible(true);
        Object enum56 = ((Field) term20479).get((Object) null);
        term20430 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term20448 = newInstance(Class.forName("kotlin.Pair"));
        setField(term20430, term20430.getClass(), "name", "GJVkUrCVdD");
        setIntField(term20430, term20430.getClass(), "firstAppearedLine", -1133405894);
        setBooleanField(term20430, term20430.getClass(), "isInferredType", true);
        setBooleanField(term20430, term20430.getClass(), "value", false);
        setBooleanField(term20430, term20430.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term20430, term20430.getClass(), "initializeExpressionPresent", true);
        setField(term20448, term20448.getClass(), "first", null);
        setField(term20448, term20448.getClass(), "second", null);
        setField(term20430, term20430.getClass(), "symbolCoordinates", term20448);
        setField(term20430, term20430.getClass(), "symbolType", enum56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInferredType", argTypes, term20430, args);
    }

};


