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

public class ControlBlock_getParent_12681156572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10846;

    public ControlBlock_getParent_12681156572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10861 = new ArrayList();
        ((ArrayList) term10861).add((Object)null);
        ((ArrayList) term10861).add((Object)null);
        ((ArrayList) term10861).add((Object)null);
        ((ArrayList) term10861).add((Object)null);
        ((ArrayList) term10861).add((Object)null);
        Class<? extends Object> term10928 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term10927 = ((Class) term10928).getDeclaredField((String) "BOOL");
        ((Field) term10927).setAccessible(true);
        Object enum36 = ((Field) term10927).get((Object) null);
        Class<? extends Object> term11167 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term11166 = ((Class) term11167).getDeclaredField((String) "VOID");
        ((Field) term11166).setAccessible(true);
        Object enum37 = ((Field) term11166).get((Object) null);
        Class<? extends Object> term11406 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term11405 = ((Class) term11406).getDeclaredField((String) "IF");
        ((Field) term11405).setAccessible(true);
        Object enum38 = ((Field) term11405).get((Object) null);
        ArrayList term10912 = new ArrayList();
        ((ArrayList) term10912).add((Object)null);
        ((ArrayList) term10912).add((Object)null);
        ((ArrayList) term10912).add((Object)null);
        term10846 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term10847 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term10888 = newInstance(Class.forName("kotlin.Pair"));
        setField(term10847, term10847.getClass(), "name", "HyxfbSQYBe");
        setIntField(term10847, term10847.getClass(), "firstAppearedLine", -1456670397);
        setField(term10847, term10847.getClass(), "paramList", term10861);
        setField(term10847, term10847.getClass(), "returnType", enum36);
        setBooleanField(term10847, term10847.getClass(), "isInferredType", false);
        setBooleanField(term10847, term10847.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term10847, term10847.getClass(), "initializeExpressionPresent", false);
        setField(term10888, term10888.getClass(), "first", null);
        setField(term10888, term10888.getClass(), "second", null);
        setField(term10847, term10847.getClass(), "symbolCoordinates", term10888);
        setField(term10847, term10847.getClass(), "symbolType", enum37);
        setField(term10846, term10846.getClass(), "parentFnSymbol", term10847);
        setField(term10846, term10846.getClass(), "parent", null);
        setField(term10846, term10846.getClass(), "type", enum38);
        setBooleanField(term10846, term10846.getClass(), "doesReturnComputed", false);
        setField(term10846, term10846.getClass(), "children", term10912);
        setBooleanField(term10846, term10846.getClass(), "doesReturnProperly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParent", argTypes, term10846, args);
    }

};


