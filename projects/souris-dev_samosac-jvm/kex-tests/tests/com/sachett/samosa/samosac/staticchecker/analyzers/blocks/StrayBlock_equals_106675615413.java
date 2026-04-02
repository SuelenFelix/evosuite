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

public class StrayBlock_equals_106675615413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8320;
     Object term8388;

    public StrayBlock_equals_106675615413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8335 = new ArrayList();
        ((ArrayList) term8335).add((Object)null);
        ((ArrayList) term8335).add((Object)null);
        ((ArrayList) term8335).add((Object)null);
        ((ArrayList) term8335).add((Object)null);
        ((ArrayList) term8335).add((Object)null);
        ((ArrayList) term8335).add((Object)null);
        ((ArrayList) term8335).add((Object)null);
        Class<? extends Object> term8400 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term8399 = ((Class) term8400).getDeclaredField((String) "VOID");
        ((Field) term8399).setAccessible(true);
        Object enum28 = ((Field) term8399).get((Object) null);
        Class<? extends Object> term8639 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term8638 = ((Class) term8639).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term8638).setAccessible(true);
        Object enum29 = ((Field) term8638).get((Object) null);
        ArrayList term8384 = new ArrayList();
        ((ArrayList) term8384).add((Object)null);
        ((ArrayList) term8384).add((Object)null);
        term8320 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term8321 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term8358 = newInstance(Class.forName("kotlin.Pair"));
        setField(term8321, term8321.getClass(), "name", "aJlieCFVtF");
        setIntField(term8321, term8321.getClass(), "firstAppearedLine", 1585847225);
        setField(term8321, term8321.getClass(), "paramList", term8335);
        setField(term8321, term8321.getClass(), "returnType", enum28);
        setBooleanField(term8321, term8321.getClass(), "isInferredType", true);
        setBooleanField(term8321, term8321.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term8321, term8321.getClass(), "initializeExpressionPresent", false);
        setField(term8358, term8358.getClass(), "first", null);
        setField(term8358, term8358.getClass(), "second", null);
        setField(term8321, term8321.getClass(), "symbolCoordinates", term8358);
        setField(term8321, term8321.getClass(), "symbolType", enum29);
        setField(term8320, term8320.getClass(), "parentFnSymbol", term8321);
        setBooleanField(term8320, term8320.getClass(), "doesReturnProperly", false);
        setField(term8320, term8320.getClass(), "children", term8384);
        setField(term8320, term8320.getClass(), "parent", null);
        term8388 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8388;
        callMethod(klass, "equals", argTypes, term8320, args);
    }

};


