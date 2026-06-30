package com.sachett.samosa.samosac.staticchecker.analyzers.blocks;

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
import static com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class StrayBlock_init_12870154790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859;
     Object term923;
     Object term925;

    public StrayBlock_init_12870154790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term873 = new ArrayList();
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        Class<? extends Object> term1066 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term1065 = ((Class) term1066).getDeclaredField((String) "INT");
        ((Field) term1065).setAccessible(true);
        Object enum2 = ((Field) term1065).get((Object) null);
        Class<? extends Object> term1302 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term1301 = ((Class) term1302).getDeclaredField((String) "STRING");
        ((Field) term1301).setAccessible(true);
        Object enum3 = ((Field) term1301).get((Object) null);
        term859 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term896 = newInstance(Class.forName("kotlin.Pair"));
        setField(term859, term859.getClass(), "name", "sjlJAEtRrb");
        setIntField(term859, term859.getClass(), "firstAppearedLine", 568599855);
        setField(term859, term859.getClass(), "paramList", term873);
        setField(term859, term859.getClass(), "returnType", enum2);
        setBooleanField(term859, term859.getClass(), "isInferredType", false);
        setBooleanField(term859, term859.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term859, term859.getClass(), "initializeExpressionPresent", false);
        setField(term896, term896.getClass(), "first", null);
        setField(term896, term896.getClass(), "second", null);
        setField(term859, term859.getClass(), "symbolCoordinates", term896);
        setField(term859, term859.getClass(), "symbolType", enum3);
        term923 = new Boolean(false);
        term925 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.ArrayList");
        argTypes[3] = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.IFunctionInnerBlock");
        Object[] args = new Object[4];
        args[0] = term859;
        args[1] = term923;
        args[2] = term925;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


