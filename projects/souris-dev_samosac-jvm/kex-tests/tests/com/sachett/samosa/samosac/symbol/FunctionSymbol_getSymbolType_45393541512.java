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

public class FunctionSymbol_getSymbolType_45393541512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10339;

    public FunctionSymbol_getSymbolType_45393541512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10353 = new ArrayList();
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        ((ArrayList) term10353).add((Object)null);
        Class<? extends Object> term10416 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term10415 = ((Class) term10416).getDeclaredField((String) "FUNCTION");
        ((Field) term10415).setAccessible(true);
        Object enum22 = ((Field) term10415).get((Object) null);
        Class<? extends Object> term10667 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term10666 = ((Class) term10667).getDeclaredField((String) "BOOL");
        ((Field) term10666).setAccessible(true);
        Object enum23 = ((Field) term10666).get((Object) null);
        term10339 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term10384 = newInstance(Class.forName("kotlin.Pair"));
        setField(term10339, term10339.getClass(), "name", "vOuMEpOQAg");
        setIntField(term10339, term10339.getClass(), "firstAppearedLine", 1890399366);
        setField(term10339, term10339.getClass(), "paramList", term10353);
        setField(term10339, term10339.getClass(), "returnType", enum22);
        setBooleanField(term10339, term10339.getClass(), "isInferredType", false);
        setBooleanField(term10339, term10339.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term10339, term10339.getClass(), "initializeExpressionPresent", false);
        setField(term10384, term10384.getClass(), "first", null);
        setField(term10384, term10384.getClass(), "second", null);
        setField(term10339, term10339.getClass(), "symbolCoordinates", term10384);
        setField(term10339, term10339.getClass(), "symbolType", enum23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolType", argTypes, term10339, args);
    }

};


