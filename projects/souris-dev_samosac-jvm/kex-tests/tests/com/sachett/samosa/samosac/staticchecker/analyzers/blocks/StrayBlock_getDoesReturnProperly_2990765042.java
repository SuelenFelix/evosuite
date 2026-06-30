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

public class StrayBlock_getDoesReturnProperly_2990765042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;

    public StrayBlock_getDoesReturnProperly_2990765042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2138 = new ArrayList();
        Class<? extends Object> term2198 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term2197 = ((Class) term2198).getDeclaredField((String) "BOOL");
        ((Field) term2197).setAccessible(true);
        Object enum6 = ((Field) term2197).get((Object) null);
        Class<? extends Object> term2437 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term2436 = ((Class) term2437).getDeclaredField((String) "INT");
        ((Field) term2436).setAccessible(true);
        Object enum7 = ((Field) term2436).get((Object) null);
        ArrayList term2183 = new ArrayList();
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        ((ArrayList) term2183).add((Object)null);
        term2123 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term2124 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term2165 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2124, term2124.getClass(), "name", "xxtlPwDYFs");
        setIntField(term2124, term2124.getClass(), "firstAppearedLine", 1484323161);
        setField(term2124, term2124.getClass(), "paramList", term2138);
        setField(term2124, term2124.getClass(), "returnType", enum6);
        setBooleanField(term2124, term2124.getClass(), "isInferredType", false);
        setBooleanField(term2124, term2124.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term2124, term2124.getClass(), "initializeExpressionPresent", false);
        setField(term2165, term2165.getClass(), "first", null);
        setField(term2165, term2165.getClass(), "second", null);
        setField(term2124, term2124.getClass(), "symbolCoordinates", term2165);
        setField(term2124, term2124.getClass(), "symbolType", enum7);
        setField(term2123, term2123.getClass(), "parentFnSymbol", term2124);
        setBooleanField(term2123, term2123.getClass(), "doesReturnProperly", true);
        setField(term2123, term2123.getClass(), "children", term2183);
        setField(term2123, term2123.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDoesReturnProperly", argTypes, term2123, args);
    }

};


