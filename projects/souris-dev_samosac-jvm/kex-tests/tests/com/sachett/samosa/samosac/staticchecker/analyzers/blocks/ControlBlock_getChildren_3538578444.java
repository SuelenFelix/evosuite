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

public class ControlBlock_getChildren_3538578444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12750;

    public ControlBlock_getChildren_3538578444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12765 = new ArrayList();
        ((ArrayList) term12765).add((Object)null);
        Class<? extends Object> term12843 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term12842 = ((Class) term12843).getDeclaredField((String) "BOOL");
        ((Field) term12842).setAccessible(true);
        Object enum42 = ((Field) term12842).get((Object) null);
        Class<? extends Object> term13082 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term13081 = ((Class) term13082).getDeclaredField((String) "FUNCTION");
        ((Field) term13081).setAccessible(true);
        Object enum43 = ((Field) term13081).get((Object) null);
        Class<? extends Object> term13333 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term13332 = ((Class) term13333).getDeclaredField((String) "WHILE");
        ((Field) term13332).setAccessible(true);
        Object enum44 = ((Field) term13332).get((Object) null);
        ArrayList term12827 = new ArrayList();
        term12750 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term12751 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term12792 = newInstance(Class.forName("kotlin.Pair"));
        setField(term12751, term12751.getClass(), "name", "hNxWaHcfhY");
        setIntField(term12751, term12751.getClass(), "firstAppearedLine", 1048535127);
        setField(term12751, term12751.getClass(), "paramList", term12765);
        setField(term12751, term12751.getClass(), "returnType", enum42);
        setBooleanField(term12751, term12751.getClass(), "isInferredType", true);
        setBooleanField(term12751, term12751.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12751, term12751.getClass(), "initializeExpressionPresent", false);
        setField(term12792, term12792.getClass(), "first", null);
        setField(term12792, term12792.getClass(), "second", null);
        setField(term12751, term12751.getClass(), "symbolCoordinates", term12792);
        setField(term12751, term12751.getClass(), "symbolType", enum43);
        setField(term12750, term12750.getClass(), "parentFnSymbol", term12751);
        setField(term12750, term12750.getClass(), "parent", null);
        setField(term12750, term12750.getClass(), "type", enum44);
        setBooleanField(term12750, term12750.getClass(), "doesReturnComputed", true);
        setField(term12750, term12750.getClass(), "children", term12827);
        setBooleanField(term12750, term12750.getClass(), "doesReturnProperly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term12750, args);
    }

};


