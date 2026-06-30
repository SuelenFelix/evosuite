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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class FunctionSymbol_setInitialValueCalculated_20810665817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8108;
     Object term8162;

    public FunctionSymbol_setInitialValueCalculated_20810665817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8122 = new ArrayList();
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        ((ArrayList) term8122).add((Object)null);
        Class<? extends Object> term8175 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term8174 = ((Class) term8175).getDeclaredField((String) "VOID");
        ((Field) term8174).setAccessible(true);
        Object enum14 = ((Field) term8174).get((Object) null);
        Class<? extends Object> term8414 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term8413 = ((Class) term8414).getDeclaredField((String) "INT");
        ((Field) term8413).setAccessible(true);
        Object enum15 = ((Field) term8413).get((Object) null);
        term8108 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term8145 = newInstance(Class.forName("kotlin.Pair"));
        setField(term8108, term8108.getClass(), "name", "PqtVXXZMqK");
        setIntField(term8108, term8108.getClass(), "firstAppearedLine", 754055848);
        setField(term8108, term8108.getClass(), "paramList", term8122);
        setField(term8108, term8108.getClass(), "returnType", enum14);
        setBooleanField(term8108, term8108.getClass(), "isInferredType", false);
        setBooleanField(term8108, term8108.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term8108, term8108.getClass(), "initializeExpressionPresent", false);
        setField(term8145, term8145.getClass(), "first", null);
        setField(term8145, term8145.getClass(), "second", null);
        setField(term8108, term8108.getClass(), "symbolCoordinates", term8145);
        setField(term8108, term8108.getClass(), "symbolType", enum15);
        term8162 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8162;
        callMethod(klass, "setInitialValueCalculated", argTypes, term8108, args);
    }

};


