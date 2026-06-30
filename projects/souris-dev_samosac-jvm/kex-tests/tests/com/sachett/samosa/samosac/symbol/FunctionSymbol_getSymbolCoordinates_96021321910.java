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

public class FunctionSymbol_getSymbolCoordinates_96021321910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9481;

    public FunctionSymbol_getSymbolCoordinates_96021321910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9495 = new ArrayList();
        ((ArrayList) term9495).add((Object)null);
        ((ArrayList) term9495).add((Object)null);
        ((ArrayList) term9495).add((Object)null);
        ((ArrayList) term9495).add((Object)null);
        ((ArrayList) term9495).add((Object)null);
        ((ArrayList) term9495).add((Object)null);
        Class<? extends Object> term9558 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9557 = ((Class) term9558).getDeclaredField((String) "FUNCTION");
        ((Field) term9557).setAccessible(true);
        Object enum19 = ((Field) term9557).get((Object) null);
        Class<? extends Object> term9809 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9808 = ((Class) term9809).getDeclaredField((String) "BOOL");
        ((Field) term9808).setAccessible(true);
        Object enum20 = ((Field) term9808).get((Object) null);
        term9481 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term9526 = newInstance(Class.forName("kotlin.Pair"));
        setField(term9481, term9481.getClass(), "name", "WVRMUmrljA");
        setIntField(term9481, term9481.getClass(), "firstAppearedLine", 1168633950);
        setField(term9481, term9481.getClass(), "paramList", term9495);
        setField(term9481, term9481.getClass(), "returnType", enum19);
        setBooleanField(term9481, term9481.getClass(), "isInferredType", false);
        setBooleanField(term9481, term9481.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term9481, term9481.getClass(), "initializeExpressionPresent", true);
        setField(term9526, term9526.getClass(), "first", null);
        setField(term9526, term9526.getClass(), "second", null);
        setField(term9481, term9481.getClass(), "symbolCoordinates", term9526);
        setField(term9481, term9481.getClass(), "symbolType", enum20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term9481, args);
    }

};


