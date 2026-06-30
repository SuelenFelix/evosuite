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

public class ControlBlock_getParentFnSymbol_84144871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9895;

    public ControlBlock_getParentFnSymbol_84144871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9910 = new ArrayList();
        ((ArrayList) term9910).add((Object)null);
        ((ArrayList) term9910).add((Object)null);
        ((ArrayList) term9910).add((Object)null);
        ((ArrayList) term9910).add((Object)null);
        ((ArrayList) term9910).add((Object)null);
        ((ArrayList) term9910).add((Object)null);
        Class<? extends Object> term9980 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9979 = ((Class) term9980).getDeclaredField((String) "BOOL");
        ((Field) term9979).setAccessible(true);
        Object enum33 = ((Field) term9979).get((Object) null);
        Class<? extends Object> term10219 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term10218 = ((Class) term10219).getDeclaredField((String) "INT");
        ((Field) term10218).setAccessible(true);
        Object enum34 = ((Field) term10218).get((Object) null);
        Class<? extends Object> term10455 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term10454 = ((Class) term10455).getDeclaredField((String) "WHILE");
        ((Field) term10454).setAccessible(true);
        Object enum35 = ((Field) term10454).get((Object) null);
        ArrayList term9964 = new ArrayList();
        ((ArrayList) term9964).add((Object)null);
        ((ArrayList) term9964).add((Object)null);
        term9895 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term9896 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term9937 = newInstance(Class.forName("kotlin.Pair"));
        setField(term9896, term9896.getClass(), "name", "tbcdzjIfER");
        setIntField(term9896, term9896.getClass(), "firstAppearedLine", -1685132342);
        setField(term9896, term9896.getClass(), "paramList", term9910);
        setField(term9896, term9896.getClass(), "returnType", enum33);
        setBooleanField(term9896, term9896.getClass(), "isInferredType", false);
        setBooleanField(term9896, term9896.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term9896, term9896.getClass(), "initializeExpressionPresent", true);
        setField(term9937, term9937.getClass(), "first", null);
        setField(term9937, term9937.getClass(), "second", null);
        setField(term9896, term9896.getClass(), "symbolCoordinates", term9937);
        setField(term9896, term9896.getClass(), "symbolType", enum34);
        setField(term9895, term9895.getClass(), "parentFnSymbol", term9896);
        setField(term9895, term9895.getClass(), "parent", null);
        setField(term9895, term9895.getClass(), "type", enum35);
        setBooleanField(term9895, term9895.getClass(), "doesReturnComputed", true);
        setField(term9895, term9895.getClass(), "children", term9964);
        setBooleanField(term9895, term9895.getClass(), "doesReturnProperly", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentFnSymbol", argTypes, term9895, args);
    }

};


