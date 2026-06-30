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

public class StringSymbol_isInitialValueCalculated_4620823406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14014;

    public StringSymbol_isInitialValueCalculated_4620823406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14089 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term14088 = ((Class) term14089).getDeclaredField((String) "FUNCTION");
        ((Field) term14088).setAccessible(true);
        Object enum34 = ((Field) term14088).get((Object) null);
        term14014 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term14043 = newInstance(Class.forName("kotlin.Pair"));
        setField(term14014, term14014.getClass(), "name", "uSUvKAyuvd");
        setIntField(term14014, term14014.getClass(), "firstAppearedLine", 1887772522);
        setBooleanField(term14014, term14014.getClass(), "isInferredType", false);
        setField(term14014, term14014.getClass(), "value", "onQLVONGuf");
        setBooleanField(term14014, term14014.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term14014, term14014.getClass(), "initializeExpressionPresent", false);
        setField(term14043, term14043.getClass(), "first", null);
        setField(term14043, term14043.getClass(), "second", null);
        setField(term14014, term14014.getClass(), "symbolCoordinates", term14043);
        setField(term14014, term14014.getClass(), "symbolType", enum34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInitialValueCalculated", argTypes, term14014, args);
    }

};


