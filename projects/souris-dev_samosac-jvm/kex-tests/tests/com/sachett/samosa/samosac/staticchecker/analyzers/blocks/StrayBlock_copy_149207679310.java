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

public class StrayBlock_copy_149207679310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6315;
     Object term6383;
     Object term6425;
     Object term6427;

    public StrayBlock_copy_149207679310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6330 = new ArrayList();
        ((ArrayList) term6330).add((Object)null);
        Class<? extends Object> term6442 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6441 = ((Class) term6442).getDeclaredField((String) "VOID");
        ((Field) term6441).setAccessible(true);
        Object enum21 = ((Field) term6441).get((Object) null);
        Class<? extends Object> term6681 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6680 = ((Class) term6681).getDeclaredField((String) "FUNCTION");
        ((Field) term6680).setAccessible(true);
        Object enum22 = ((Field) term6680).get((Object) null);
        ArrayList term6379 = new ArrayList();
        ((ArrayList) term6379).add((Object)null);
        ((ArrayList) term6379).add((Object)null);
        term6315 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term6316 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term6353 = newInstance(Class.forName("kotlin.Pair"));
        setField(term6316, term6316.getClass(), "name", "uuaPigETmJ");
        setIntField(term6316, term6316.getClass(), "firstAppearedLine", 1725571209);
        setField(term6316, term6316.getClass(), "paramList", term6330);
        setField(term6316, term6316.getClass(), "returnType", enum21);
        setBooleanField(term6316, term6316.getClass(), "isInferredType", false);
        setBooleanField(term6316, term6316.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term6316, term6316.getClass(), "initializeExpressionPresent", true);
        setField(term6353, term6353.getClass(), "first", null);
        setField(term6353, term6353.getClass(), "second", null);
        setField(term6316, term6316.getClass(), "symbolCoordinates", term6353);
        setField(term6316, term6316.getClass(), "symbolType", enum22);
        setField(term6315, term6315.getClass(), "parentFnSymbol", term6316);
        setBooleanField(term6315, term6315.getClass(), "doesReturnProperly", false);
        setField(term6315, term6315.getClass(), "children", term6379);
        setField(term6315, term6315.getClass(), "parent", null);
        ArrayList term6397 = new ArrayList();
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        ((ArrayList) term6397).add((Object)null);
        Class<? extends Object> term6942 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6941 = ((Class) term6942).getDeclaredField((String) "BOOL");
        ((Field) term6941).setAccessible(true);
        Object enum23 = ((Field) term6941).get((Object) null);
        term6383 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term6424 = newInstance(Class.forName("kotlin.Pair"));
        setField(term6383, term6383.getClass(), "name", "MxlszYVzRf");
        setIntField(term6383, term6383.getClass(), "firstAppearedLine", -522618178);
        setField(term6383, term6383.getClass(), "paramList", term6397);
        setField(term6383, term6383.getClass(), "returnType", enum23);
        setBooleanField(term6383, term6383.getClass(), "isInferredType", true);
        setBooleanField(term6383, term6383.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term6383, term6383.getClass(), "initializeExpressionPresent", true);
        setField(term6424, term6424.getClass(), "first", null);
        setField(term6424, term6424.getClass(), "second", null);
        setField(term6383, term6383.getClass(), "symbolCoordinates", term6424);
        setField(term6383, term6383.getClass(), "symbolType", enum21);
        term6425 = new Boolean(false);
        term6427 = new ArrayList();
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
        args[0] = term6383;
        args[1] = term6425;
        args[2] = term6427;
        args[3] = null;
        callMethod(klass, "copy", argTypes, term6315, args);
    }

};


