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

public class FunctionSymbol_getAugmentedName_188080071814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11751;

    public FunctionSymbol_getAugmentedName_188080071814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11765 = new ArrayList();
        ((ArrayList) term11765).add((Object)null);
        ((ArrayList) term11765).add((Object)null);
        ((ArrayList) term11765).add((Object)null);
        ((ArrayList) term11765).add((Object)null);
        ((ArrayList) term11765).add((Object)null);
        ((ArrayList) term11765).add((Object)null);
        Class<? extends Object> term11824 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term11823 = ((Class) term11824).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term11823).setAccessible(true);
        Object enum27 = ((Field) term11823).get((Object) null);
        Class<? extends Object> term12084 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term12083 = ((Class) term12084).getDeclaredField((String) "INT");
        ((Field) term12083).setAccessible(true);
        Object enum28 = ((Field) term12083).get((Object) null);
        term11751 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term11796 = newInstance(Class.forName("kotlin.Pair"));
        setField(term11751, term11751.getClass(), "name", "qYzsiuXOgS");
        setIntField(term11751, term11751.getClass(), "firstAppearedLine", 952869601);
        setField(term11751, term11751.getClass(), "paramList", term11765);
        setField(term11751, term11751.getClass(), "returnType", enum27);
        setBooleanField(term11751, term11751.getClass(), "isInferredType", true);
        setBooleanField(term11751, term11751.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term11751, term11751.getClass(), "initializeExpressionPresent", false);
        setField(term11796, term11796.getClass(), "first", null);
        setField(term11796, term11796.getClass(), "second", null);
        setField(term11751, term11751.getClass(), "symbolCoordinates", term11796);
        setField(term11751, term11751.getClass(), "symbolType", enum28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAugmentedName", argTypes, term11751, args);
    }

};


