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
import java.lang.Boolean;

public class BoolSymbol_setInitializeExpressionPresent_1188301419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22179;
     Object term22214;

    public BoolSymbol_setInitializeExpressionPresent_1188301419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22227 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term22226 = ((Class) term22227).getDeclaredField((String) "INT");
        ((Field) term22226).setAccessible(true);
        Object enum62 = ((Field) term22226).get((Object) null);
        term22179 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term22197 = newInstance(Class.forName("kotlin.Pair"));
        setField(term22179, term22179.getClass(), "name", "TXZAIPQJHt");
        setIntField(term22179, term22179.getClass(), "firstAppearedLine", 202214133);
        setBooleanField(term22179, term22179.getClass(), "isInferredType", true);
        setBooleanField(term22179, term22179.getClass(), "value", true);
        setBooleanField(term22179, term22179.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term22179, term22179.getClass(), "initializeExpressionPresent", false);
        setField(term22197, term22197.getClass(), "first", null);
        setField(term22197, term22197.getClass(), "second", null);
        setField(term22179, term22179.getClass(), "symbolCoordinates", term22197);
        setField(term22179, term22179.getClass(), "symbolType", enum62);
        term22214 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term22214;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term22179, args);
    }

};


