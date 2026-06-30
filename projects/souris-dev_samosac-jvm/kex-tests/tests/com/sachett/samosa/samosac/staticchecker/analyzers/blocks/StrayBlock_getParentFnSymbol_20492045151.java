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

public class StrayBlock_getParentFnSymbol_20492045151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1546;

    public StrayBlock_getParentFnSymbol_20492045151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1561 = new ArrayList();
        ((ArrayList) term1561).add((Object)null);
        ((ArrayList) term1561).add((Object)null);
        ((ArrayList) term1561).add((Object)null);
        ((ArrayList) term1561).add((Object)null);
        Class<? extends Object> term1625 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term1624 = ((Class) term1625).getDeclaredField((String) "VOID");
        ((Field) term1624).setAccessible(true);
        Object enum4 = ((Field) term1624).get((Object) null);
        Class<? extends Object> term1864 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term1863 = ((Class) term1864).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term1863).setAccessible(true);
        Object enum5 = ((Field) term1863).get((Object) null);
        ArrayList term1610 = new ArrayList();
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        term1546 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term1547 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term1584 = newInstance(Class.forName("kotlin.Pair"));
        setField(term1547, term1547.getClass(), "name", "MuLcgQHgqz");
        setIntField(term1547, term1547.getClass(), "firstAppearedLine", 1162663216);
        setField(term1547, term1547.getClass(), "paramList", term1561);
        setField(term1547, term1547.getClass(), "returnType", enum4);
        setBooleanField(term1547, term1547.getClass(), "isInferredType", true);
        setBooleanField(term1547, term1547.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term1547, term1547.getClass(), "initializeExpressionPresent", true);
        setField(term1584, term1584.getClass(), "first", null);
        setField(term1584, term1584.getClass(), "second", null);
        setField(term1547, term1547.getClass(), "symbolCoordinates", term1584);
        setField(term1547, term1547.getClass(), "symbolType", enum5);
        setField(term1546, term1546.getClass(), "parentFnSymbol", term1547);
        setBooleanField(term1546, term1546.getClass(), "doesReturnProperly", true);
        setField(term1546, term1546.getClass(), "children", term1610);
        setField(term1546, term1546.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentFnSymbol", argTypes, term1546, args);
    }

};


