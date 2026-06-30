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

public class ControlBlock_getDoesReturnProperly_19551007645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13724;

    public ControlBlock_getDoesReturnProperly_19551007645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13739 = new ArrayList();
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        ((ArrayList) term13739).add((Object)null);
        Class<? extends Object> term13814 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term13813 = ((Class) term13814).getDeclaredField((String) "INT");
        ((Field) term13813).setAccessible(true);
        Object enum45 = ((Field) term13813).get((Object) null);
        Class<? extends Object> term14050 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term14049 = ((Class) term14050).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term14049).setAccessible(true);
        Object enum46 = ((Field) term14049).get((Object) null);
        Class<? extends Object> term14310 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term14309 = ((Class) term14310).getDeclaredField((String) "ELSEIF");
        ((Field) term14309).setAccessible(true);
        Object enum47 = ((Field) term14309).get((Object) null);
        ArrayList term13798 = new ArrayList();
        ((ArrayList) term13798).add((Object)null);
        ((ArrayList) term13798).add((Object)null);
        ((ArrayList) term13798).add((Object)null);
        ((ArrayList) term13798).add((Object)null);
        term13724 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term13725 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term13762 = newInstance(Class.forName("kotlin.Pair"));
        setField(term13725, term13725.getClass(), "name", "RkybSrpybU");
        setIntField(term13725, term13725.getClass(), "firstAppearedLine", -655067527);
        setField(term13725, term13725.getClass(), "paramList", term13739);
        setField(term13725, term13725.getClass(), "returnType", enum45);
        setBooleanField(term13725, term13725.getClass(), "isInferredType", true);
        setBooleanField(term13725, term13725.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term13725, term13725.getClass(), "initializeExpressionPresent", true);
        setField(term13762, term13762.getClass(), "first", null);
        setField(term13762, term13762.getClass(), "second", null);
        setField(term13725, term13725.getClass(), "symbolCoordinates", term13762);
        setField(term13725, term13725.getClass(), "symbolType", enum46);
        setField(term13724, term13724.getClass(), "parentFnSymbol", term13725);
        setField(term13724, term13724.getClass(), "parent", null);
        setField(term13724, term13724.getClass(), "type", enum47);
        setBooleanField(term13724, term13724.getClass(), "doesReturnComputed", false);
        setField(term13724, term13724.getClass(), "children", term13798);
        setBooleanField(term13724, term13724.getClass(), "doesReturnProperly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDoesReturnProperly", argTypes, term13724, args);
    }

};


