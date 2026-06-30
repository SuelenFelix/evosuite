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

public class IntSymbol_getValue_17170237184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25186;

    public IntSymbol_getValue_17170237184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25232 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term25231 = ((Class) term25232).getDeclaredField((String) "VOID");
        ((Field) term25231).setAccessible(true);
        Object enum72 = ((Field) term25231).get((Object) null);
        term25186 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term25204 = newInstance(Class.forName("kotlin.Pair"));
        setField(term25186, term25186.getClass(), "name", "DzHVBMqWtE");
        setIntField(term25186, term25186.getClass(), "firstAppearedLine", -1736183862);
        setBooleanField(term25186, term25186.getClass(), "isInferredType", false);
        setIntField(term25186, term25186.getClass(), "value", 897010381);
        setBooleanField(term25186, term25186.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term25186, term25186.getClass(), "initializeExpressionPresent", false);
        setField(term25204, term25204.getClass(), "first", null);
        setField(term25204, term25204.getClass(), "second", null);
        setField(term25186, term25186.getClass(), "symbolCoordinates", term25204);
        setField(term25186, term25186.getClass(), "symbolType", enum72);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term25186, args);
    }

};


