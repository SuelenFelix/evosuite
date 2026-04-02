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
import java.lang.Integer;

public class BoolSymbol_setSymbolCoordinates_181388170111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22746;
     Object term22785;

    public BoolSymbol_setSymbolCoordinates_181388170111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22801 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term22800 = ((Class) term22801).getDeclaredField((String) "BOOL");
        ((Field) term22800).setAccessible(true);
        Object enum64 = ((Field) term22800).get((Object) null);
        term22746 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term22764 = newInstance(Class.forName("kotlin.Pair"));
        setField(term22746, term22746.getClass(), "name", "dJGPlmSRnz");
        setIntField(term22746, term22746.getClass(), "firstAppearedLine", -763166094);
        setBooleanField(term22746, term22746.getClass(), "isInferredType", true);
        setBooleanField(term22746, term22746.getClass(), "value", false);
        setBooleanField(term22746, term22746.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term22746, term22746.getClass(), "initializeExpressionPresent", true);
        setField(term22764, term22764.getClass(), "first", null);
        setField(term22764, term22764.getClass(), "second", null);
        setField(term22746, term22746.getClass(), "symbolCoordinates", term22764);
        setField(term22746, term22746.getClass(), "symbolType", enum64);
        Integer term22786 = new Integer(-1007160944);
        Integer term22788 = new Integer(1135664017);
        term22785 = newInstance(Class.forName("kotlin.Pair"));
        setField(term22785, term22785.getClass(), "first", term22786);
        setField(term22785, term22785.getClass(), "second", term22788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term22785;
        callMethod(klass, "setSymbolCoordinates", argTypes, term22746, args);
    }

};


