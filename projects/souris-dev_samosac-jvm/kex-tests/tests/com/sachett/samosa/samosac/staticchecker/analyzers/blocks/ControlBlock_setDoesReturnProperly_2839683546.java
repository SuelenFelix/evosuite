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

public class ControlBlock_setDoesReturnProperly_2839683546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14704;
     Object term14775;

    public ControlBlock_setDoesReturnProperly_2839683546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14719 = new ArrayList();
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        ((ArrayList) term14719).add((Object)null);
        Class<? extends Object> term14788 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term14787 = ((Class) term14788).getDeclaredField((String) "VOID");
        ((Field) term14787).setAccessible(true);
        Object enum48 = ((Field) term14787).get((Object) null);
        Class<? extends Object> term15027 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15026 = ((Class) term15027).getDeclaredField((String) "INT");
        ((Field) term15026).setAccessible(true);
        Object enum49 = ((Field) term15026).get((Object) null);
        Class<? extends Object> term15263 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term15262 = ((Class) term15263).getDeclaredField((String) "ELSEIF");
        ((Field) term15262).setAccessible(true);
        Object enum50 = ((Field) term15262).get((Object) null);
        ArrayList term14770 = new ArrayList();
        ((ArrayList) term14770).add((Object)null);
        ((ArrayList) term14770).add((Object)null);
        ((ArrayList) term14770).add((Object)null);
        ((ArrayList) term14770).add((Object)null);
        ((ArrayList) term14770).add((Object)null);
        ((ArrayList) term14770).add((Object)null);
        term14704 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term14705 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term14742 = newInstance(Class.forName("kotlin.Pair"));
        setField(term14705, term14705.getClass(), "name", "xOEqzGAmDU");
        setIntField(term14705, term14705.getClass(), "firstAppearedLine", -6029667);
        setField(term14705, term14705.getClass(), "paramList", term14719);
        setField(term14705, term14705.getClass(), "returnType", enum48);
        setBooleanField(term14705, term14705.getClass(), "isInferredType", true);
        setBooleanField(term14705, term14705.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term14705, term14705.getClass(), "initializeExpressionPresent", true);
        setField(term14742, term14742.getClass(), "first", null);
        setField(term14742, term14742.getClass(), "second", null);
        setField(term14705, term14705.getClass(), "symbolCoordinates", term14742);
        setField(term14705, term14705.getClass(), "symbolType", enum49);
        setField(term14704, term14704.getClass(), "parentFnSymbol", term14705);
        setField(term14704, term14704.getClass(), "parent", null);
        setField(term14704, term14704.getClass(), "type", enum50);
        setBooleanField(term14704, term14704.getClass(), "doesReturnComputed", true);
        setField(term14704, term14704.getClass(), "children", term14770);
        setBooleanField(term14704, term14704.getClass(), "doesReturnProperly", true);
        term14775 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term14775;
        callMethod(klass, "setDoesReturnProperly", argTypes, term14704, args);
    }

};


