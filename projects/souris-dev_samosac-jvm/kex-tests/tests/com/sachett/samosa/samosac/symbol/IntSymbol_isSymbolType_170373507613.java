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

public class IntSymbol_isSymbolType_170373507613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27859;
     Object enum82;

    public IntSymbol_isSymbolType_170373507613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27925 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term27924 = ((Class) term27925).getDeclaredField((String) "INT");
        ((Field) term27924).setAccessible(true);
        Object enum81 = ((Field) term27924).get((Object) null);
        term27859 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term27877 = newInstance(Class.forName("kotlin.Pair"));
        setField(term27859, term27859.getClass(), "name", "IlvgFINwIa");
        setIntField(term27859, term27859.getClass(), "firstAppearedLine", 1126618861);
        setBooleanField(term27859, term27859.getClass(), "isInferredType", false);
        setIntField(term27859, term27859.getClass(), "value", 947449400);
        setBooleanField(term27859, term27859.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term27859, term27859.getClass(), "initializeExpressionPresent", false);
        setField(term27877, term27877.getClass(), "first", null);
        setField(term27877, term27877.getClass(), "second", null);
        setField(term27859, term27859.getClass(), "symbolCoordinates", term27877);
        setField(term27859, term27859.getClass(), "symbolType", enum81);
        Class<? extends Object> term28161 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term28160 = ((Class) term28161).getDeclaredField((String) "BOOL");
        ((Field) term28160).setAccessible(true);
        enum82 = ((Field) term28160).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        Object[] args = new Object[1];
        args[0] = enum82;
        callMethod(klass, "isSymbolType", argTypes, term27859, args);
    }

};


