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

public class ControlBlock_calculateReturn_14755810987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15657;

    public ControlBlock_calculateReturn_14755810987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15672 = new ArrayList();
        ((ArrayList) term15672).add((Object)null);
        ((ArrayList) term15672).add((Object)null);
        Class<? extends Object> term15753 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15752 = ((Class) term15753).getDeclaredField((String) "INT");
        ((Field) term15752).setAccessible(true);
        Object enum51 = ((Field) term15752).get((Object) null);
        Class<? extends Object> term15989 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15988 = ((Class) term15989).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term15988).setAccessible(true);
        Object enum52 = ((Field) term15988).get((Object) null);
        Class<? extends Object> term16249 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term16248 = ((Class) term16249).getDeclaredField((String) "FUNCTIONROOT");
        ((Field) term16248).setAccessible(true);
        Object enum53 = ((Field) term16248).get((Object) null);
        ArrayList term15737 = new ArrayList();
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        ((ArrayList) term15737).add((Object)null);
        term15657 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term15658 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term15695 = newInstance(Class.forName("kotlin.Pair"));
        setField(term15658, term15658.getClass(), "name", "eZFUvlxvGV");
        setIntField(term15658, term15658.getClass(), "firstAppearedLine", -2068769794);
        setField(term15658, term15658.getClass(), "paramList", term15672);
        setField(term15658, term15658.getClass(), "returnType", enum51);
        setBooleanField(term15658, term15658.getClass(), "isInferredType", false);
        setBooleanField(term15658, term15658.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term15658, term15658.getClass(), "initializeExpressionPresent", true);
        setField(term15695, term15695.getClass(), "first", null);
        setField(term15695, term15695.getClass(), "second", null);
        setField(term15658, term15658.getClass(), "symbolCoordinates", term15695);
        setField(term15658, term15658.getClass(), "symbolType", enum52);
        setField(term15657, term15657.getClass(), "parentFnSymbol", term15658);
        setField(term15657, term15657.getClass(), "parent", null);
        setField(term15657, term15657.getClass(), "type", enum53);
        setBooleanField(term15657, term15657.getClass(), "doesReturnComputed", true);
        setField(term15657, term15657.getClass(), "children", term15737);
        setBooleanField(term15657, term15657.getClass(), "doesReturnProperly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateReturn", argTypes, term15657, args);
    }

};


