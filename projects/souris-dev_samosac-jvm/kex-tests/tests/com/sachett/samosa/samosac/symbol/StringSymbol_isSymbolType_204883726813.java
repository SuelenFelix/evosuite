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

public class StringSymbol_isSymbolType_204883726813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16225;
     Object enum42;

    public StringSymbol_isSymbolType_204883726813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16316 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term16315 = ((Class) term16316).getDeclaredField((String) "INT");
        ((Field) term16315).setAccessible(true);
        Object enum41 = ((Field) term16315).get((Object) null);
        term16225 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term16254 = newInstance(Class.forName("kotlin.Pair"));
        setField(term16225, term16225.getClass(), "name", "uPuCVuZYOI");
        setIntField(term16225, term16225.getClass(), "firstAppearedLine", -1252345779);
        setBooleanField(term16225, term16225.getClass(), "isInferredType", true);
        setField(term16225, term16225.getClass(), "value", "TweMFhxNdj");
        setBooleanField(term16225, term16225.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term16225, term16225.getClass(), "initializeExpressionPresent", true);
        setField(term16254, term16254.getClass(), "first", null);
        setField(term16254, term16254.getClass(), "second", null);
        setField(term16225, term16225.getClass(), "symbolCoordinates", term16254);
        setField(term16225, term16225.getClass(), "symbolType", enum41);
        Class<? extends Object> term16552 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term16551 = ((Class) term16552).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term16551).setAccessible(true);
        enum42 = ((Field) term16551).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        Object[] args = new Object[1];
        args[0] = enum42;
        callMethod(klass, "isSymbolType", argTypes, term16225, args);
    }

};


