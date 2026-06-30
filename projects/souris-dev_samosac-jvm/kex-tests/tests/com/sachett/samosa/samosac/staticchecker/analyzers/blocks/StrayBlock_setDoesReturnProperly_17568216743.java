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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Boolean;

public class StrayBlock_setDoesReturnProperly_17568216743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2672;
     Object term2744;

    public StrayBlock_setDoesReturnProperly_17568216743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2687 = new ArrayList();
        Class<? extends Object> term2757 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term2756 = ((Class) term2757).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term2756).setAccessible(true);
        Object enum8 = ((Field) term2756).get((Object) null);
        Class<? extends Object> term3017 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term3016 = ((Class) term3017).getDeclaredField((String) "BOOL");
        ((Field) term3016).setAccessible(true);
        Object enum9 = ((Field) term3016).get((Object) null);
        ArrayList term2740 = new ArrayList();
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        ((ArrayList) term2740).add((Object)null);
        term2672 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term2673 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term2718 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2673, term2673.getClass(), "name", "jJCZpVmanW");
        setIntField(term2673, term2673.getClass(), "firstAppearedLine", 391863371);
        setField(term2673, term2673.getClass(), "paramList", term2687);
        setField(term2673, term2673.getClass(), "returnType", enum8);
        setBooleanField(term2673, term2673.getClass(), "isInferredType", false);
        setBooleanField(term2673, term2673.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term2673, term2673.getClass(), "initializeExpressionPresent", false);
        setField(term2718, term2718.getClass(), "first", null);
        setField(term2718, term2718.getClass(), "second", null);
        setField(term2673, term2673.getClass(), "symbolCoordinates", term2718);
        setField(term2673, term2673.getClass(), "symbolType", enum9);
        setField(term2672, term2672.getClass(), "parentFnSymbol", term2673);
        setBooleanField(term2672, term2672.getClass(), "doesReturnProperly", false);
        setField(term2672, term2672.getClass(), "children", term2740);
        setField(term2672, term2672.getClass(), "parent", null);
        term2744 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2744;
        callMethod(klass, "setDoesReturnProperly", argTypes, term2672, args);
    }

};


