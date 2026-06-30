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

public class StrayBlock_component2_836858877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4653;

    public StrayBlock_component2_836858877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4668 = new ArrayList();
        ((ArrayList) term4668).add((Object)null);
        ((ArrayList) term4668).add((Object)null);
        Class<? extends Object> term4734 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term4733 = ((Class) term4734).getDeclaredField((String) "STRING");
        ((Field) term4733).setAccessible(true);
        Object enum15 = ((Field) term4733).get((Object) null);
        Class<? extends Object> term4979 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term4978 = ((Class) term4979).getDeclaredField((String) "VOID");
        ((Field) term4978).setAccessible(true);
        Object enum16 = ((Field) term4978).get((Object) null);
        ArrayList term4719 = new ArrayList();
        ((ArrayList) term4719).add((Object)null);
        ((ArrayList) term4719).add((Object)null);
        ((ArrayList) term4719).add((Object)null);
        ((ArrayList) term4719).add((Object)null);
        ((ArrayList) term4719).add((Object)null);
        ((ArrayList) term4719).add((Object)null);
        ((ArrayList) term4719).add((Object)null);
        term4653 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term4654 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term4701 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4654, term4654.getClass(), "name", "hRNSzYYIrc");
        setIntField(term4654, term4654.getClass(), "firstAppearedLine", -2038273078);
        setField(term4654, term4654.getClass(), "paramList", term4668);
        setField(term4654, term4654.getClass(), "returnType", enum15);
        setBooleanField(term4654, term4654.getClass(), "isInferredType", true);
        setBooleanField(term4654, term4654.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term4654, term4654.getClass(), "initializeExpressionPresent", true);
        setField(term4701, term4701.getClass(), "first", null);
        setField(term4701, term4701.getClass(), "second", null);
        setField(term4654, term4654.getClass(), "symbolCoordinates", term4701);
        setField(term4654, term4654.getClass(), "symbolType", enum16);
        setField(term4653, term4653.getClass(), "parentFnSymbol", term4654);
        setBooleanField(term4653, term4653.getClass(), "doesReturnProperly", true);
        setField(term4653, term4653.getClass(), "children", term4719);
        setField(term4653, term4653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term4653, args);
    }

};


