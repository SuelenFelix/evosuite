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

public class FunctionSymbol_getParamList_17352177723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6166;

    public FunctionSymbol_getParamList_17352177723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6180 = new ArrayList();
        ((ArrayList) term6180).add((Object)null);
        ((ArrayList) term6180).add((Object)null);
        ((ArrayList) term6180).add((Object)null);
        ((ArrayList) term6180).add((Object)null);
        ((ArrayList) term6180).add((Object)null);
        Class<? extends Object> term6219 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6218 = ((Class) term6219).getDeclaredField((String) "BOOL");
        ((Field) term6218).setAccessible(true);
        Object enum7 = ((Field) term6218).get((Object) null);
        term6166 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term6207 = newInstance(Class.forName("kotlin.Pair"));
        setField(term6166, term6166.getClass(), "name", "pJbnHTYrxn");
        setIntField(term6166, term6166.getClass(), "firstAppearedLine", 1374790203);
        setField(term6166, term6166.getClass(), "paramList", term6180);
        setField(term6166, term6166.getClass(), "returnType", enum7);
        setBooleanField(term6166, term6166.getClass(), "isInferredType", false);
        setBooleanField(term6166, term6166.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term6166, term6166.getClass(), "initializeExpressionPresent", true);
        setField(term6207, term6207.getClass(), "first", null);
        setField(term6207, term6207.getClass(), "second", null);
        setField(term6166, term6166.getClass(), "symbolCoordinates", term6207);
        setField(term6166, term6166.getClass(), "symbolType", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParamList", argTypes, term6166, args);
    }

};


