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

public class StrayBlock_getParent_9860616115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3552;

    public StrayBlock_getParent_9860616115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3567 = new ArrayList();
        ((ArrayList) term3567).add((Object)null);
        ((ArrayList) term3567).add((Object)null);
        ((ArrayList) term3567).add((Object)null);
        ((ArrayList) term3567).add((Object)null);
        ((ArrayList) term3567).add((Object)null);
        ((ArrayList) term3567).add((Object)null);
        ((ArrayList) term3567).add((Object)null);
        Class<? extends Object> term3627 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term3626 = ((Class) term3627).getDeclaredField((String) "VOID");
        ((Field) term3626).setAccessible(true);
        Object enum11 = ((Field) term3626).get((Object) null);
        Class<? extends Object> term3866 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term3865 = ((Class) term3866).getDeclaredField((String) "BOOL");
        ((Field) term3865).setAccessible(true);
        Object enum12 = ((Field) term3865).get((Object) null);
        ArrayList term3612 = new ArrayList();
        term3552 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term3553 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term3590 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3553, term3553.getClass(), "name", "SzjVpOQTyS");
        setIntField(term3553, term3553.getClass(), "firstAppearedLine", -616727354);
        setField(term3553, term3553.getClass(), "paramList", term3567);
        setField(term3553, term3553.getClass(), "returnType", enum11);
        setBooleanField(term3553, term3553.getClass(), "isInferredType", true);
        setBooleanField(term3553, term3553.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term3553, term3553.getClass(), "initializeExpressionPresent", true);
        setField(term3590, term3590.getClass(), "first", null);
        setField(term3590, term3590.getClass(), "second", null);
        setField(term3553, term3553.getClass(), "symbolCoordinates", term3590);
        setField(term3553, term3553.getClass(), "symbolType", enum12);
        setField(term3552, term3552.getClass(), "parentFnSymbol", term3553);
        setBooleanField(term3552, term3552.getClass(), "doesReturnProperly", true);
        setField(term3552, term3552.getClass(), "children", term3612);
        setField(term3552, term3552.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParent", argTypes, term3552, args);
    }

};


