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

public class StringSymbol_getInitializeExpressionPresent_9239079168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14650;

    public StringSymbol_getInitializeExpressionPresent_9239079168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14725 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term14724 = ((Class) term14725).getDeclaredField((String) "FUNCTION");
        ((Field) term14724).setAccessible(true);
        Object enum36 = ((Field) term14724).get((Object) null);
        term14650 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term14679 = newInstance(Class.forName("kotlin.Pair"));
        setField(term14650, term14650.getClass(), "name", "BwtdjiefJn");
        setIntField(term14650, term14650.getClass(), "firstAppearedLine", -1840305774);
        setBooleanField(term14650, term14650.getClass(), "isInferredType", true);
        setField(term14650, term14650.getClass(), "value", "jDmhBrIoDa");
        setBooleanField(term14650, term14650.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term14650, term14650.getClass(), "initializeExpressionPresent", true);
        setField(term14679, term14679.getClass(), "first", null);
        setField(term14679, term14679.getClass(), "second", null);
        setField(term14650, term14650.getClass(), "symbolCoordinates", term14679);
        setField(term14650, term14650.getClass(), "symbolType", enum36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitializeExpressionPresent", argTypes, term14650, args);
    }

};


