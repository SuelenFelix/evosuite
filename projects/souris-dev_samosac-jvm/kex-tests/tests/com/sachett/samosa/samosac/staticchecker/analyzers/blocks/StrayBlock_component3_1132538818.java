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

public class StrayBlock_component3_1132538818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5217;

    public StrayBlock_component3_1132538818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5232 = new ArrayList();
        ((ArrayList) term5232).add((Object)null);
        Class<? extends Object> term5292 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5291 = ((Class) term5292).getDeclaredField((String) "INT");
        ((Field) term5291).setAccessible(true);
        Object enum17 = ((Field) term5291).get((Object) null);
        Class<? extends Object> term5528 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5527 = ((Class) term5528).getDeclaredField((String) "BOOL");
        ((Field) term5527).setAccessible(true);
        Object enum18 = ((Field) term5527).get((Object) null);
        ArrayList term5277 = new ArrayList();
        ((ArrayList) term5277).add((Object)null);
        ((ArrayList) term5277).add((Object)null);
        ((ArrayList) term5277).add((Object)null);
        ((ArrayList) term5277).add((Object)null);
        ((ArrayList) term5277).add((Object)null);
        term5217 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term5218 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term5255 = newInstance(Class.forName("kotlin.Pair"));
        setField(term5218, term5218.getClass(), "name", "RMFIsYGgne");
        setIntField(term5218, term5218.getClass(), "firstAppearedLine", 1227103734);
        setField(term5218, term5218.getClass(), "paramList", term5232);
        setField(term5218, term5218.getClass(), "returnType", enum17);
        setBooleanField(term5218, term5218.getClass(), "isInferredType", true);
        setBooleanField(term5218, term5218.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term5218, term5218.getClass(), "initializeExpressionPresent", true);
        setField(term5255, term5255.getClass(), "first", null);
        setField(term5255, term5255.getClass(), "second", null);
        setField(term5218, term5218.getClass(), "symbolCoordinates", term5255);
        setField(term5218, term5218.getClass(), "symbolType", enum18);
        setField(term5217, term5217.getClass(), "parentFnSymbol", term5218);
        setBooleanField(term5217, term5217.getClass(), "doesReturnProperly", true);
        setField(term5217, term5217.getClass(), "children", term5277);
        setField(term5217, term5217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term5217, args);
    }

};


