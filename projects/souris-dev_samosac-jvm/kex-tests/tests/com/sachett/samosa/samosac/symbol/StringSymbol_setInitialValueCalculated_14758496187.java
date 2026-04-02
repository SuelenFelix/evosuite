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

public class StringSymbol_setInitialValueCalculated_14758496187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14339;
     Object term14389;

    public StringSymbol_setInitialValueCalculated_14758496187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14412 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term14411 = ((Class) term14412).getDeclaredField((String) "BOOL");
        ((Field) term14411).setAccessible(true);
        Object enum35 = ((Field) term14411).get((Object) null);
        term14339 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term14368 = newInstance(Class.forName("kotlin.Pair"));
        setField(term14339, term14339.getClass(), "name", "SOrEHbcbmn");
        setIntField(term14339, term14339.getClass(), "firstAppearedLine", 354196060);
        setBooleanField(term14339, term14339.getClass(), "isInferredType", true);
        setField(term14339, term14339.getClass(), "value", "bnsyeQXFdu");
        setBooleanField(term14339, term14339.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term14339, term14339.getClass(), "initializeExpressionPresent", false);
        setField(term14368, term14368.getClass(), "first", null);
        setField(term14368, term14368.getClass(), "second", null);
        setField(term14339, term14339.getClass(), "symbolCoordinates", term14368);
        setField(term14339, term14339.getClass(), "symbolType", enum35);
        term14389 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term14389;
        callMethod(klass, "setInitialValueCalculated", argTypes, term14339, args);
    }

};


