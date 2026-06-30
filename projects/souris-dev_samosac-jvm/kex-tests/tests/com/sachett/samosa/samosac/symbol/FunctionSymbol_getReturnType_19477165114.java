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

public class FunctionSymbol_getReturnType_19477165114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6457;

    public FunctionSymbol_getReturnType_19477165114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6471 = new ArrayList();
        ((ArrayList) term6471).add((Object)null);
        ((ArrayList) term6471).add((Object)null);
        ((ArrayList) term6471).add((Object)null);
        ((ArrayList) term6471).add((Object)null);
        ((ArrayList) term6471).add((Object)null);
        Class<? extends Object> term6526 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6525 = ((Class) term6526).getDeclaredField((String) "BOOL");
        ((Field) term6525).setAccessible(true);
        Object enum8 = ((Field) term6525).get((Object) null);
        Class<? extends Object> term6765 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6764 = ((Class) term6765).getDeclaredField((String) "VOID");
        ((Field) term6764).setAccessible(true);
        Object enum9 = ((Field) term6764).get((Object) null);
        term6457 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term6498 = newInstance(Class.forName("kotlin.Pair"));
        setField(term6457, term6457.getClass(), "name", "iIRsCSYqXH");
        setIntField(term6457, term6457.getClass(), "firstAppearedLine", 1160010161);
        setField(term6457, term6457.getClass(), "paramList", term6471);
        setField(term6457, term6457.getClass(), "returnType", enum8);
        setBooleanField(term6457, term6457.getClass(), "isInferredType", true);
        setBooleanField(term6457, term6457.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term6457, term6457.getClass(), "initializeExpressionPresent", true);
        setField(term6498, term6498.getClass(), "first", null);
        setField(term6498, term6498.getClass(), "second", null);
        setField(term6457, term6457.getClass(), "symbolCoordinates", term6498);
        setField(term6457, term6457.getClass(), "symbolType", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReturnType", argTypes, term6457, args);
    }

};


