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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class ControlBlock_init_20813758390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8930;
     Object enum32;

    public ControlBlock_init_20813758390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8944 = new ArrayList();
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        ((ArrayList) term8944).add((Object)null);
        Class<? extends Object> term9011 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9010 = ((Class) term9011).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term9010).setAccessible(true);
        Object enum30 = ((Field) term9010).get((Object) null);
        Class<? extends Object> term9271 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9270 = ((Class) term9271).getDeclaredField((String) "INT");
        ((Field) term9270).setAccessible(true);
        Object enum31 = ((Field) term9270).get((Object) null);
        term8930 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term8975 = newInstance(Class.forName("kotlin.Pair"));
        setField(term8930, term8930.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term8930, term8930.getClass(), "firstAppearedLine", 597278769);
        setField(term8930, term8930.getClass(), "paramList", term8944);
        setField(term8930, term8930.getClass(), "returnType", enum30);
        setBooleanField(term8930, term8930.getClass(), "isInferredType", false);
        setBooleanField(term8930, term8930.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term8930, term8930.getClass(), "initializeExpressionPresent", true);
        setField(term8975, term8975.getClass(), "first", null);
        setField(term8975, term8975.getClass(), "second", null);
        setField(term8930, term8930.getClass(), "symbolCoordinates", term8975);
        setField(term8930, term8930.getClass(), "symbolType", enum31);
        Class<? extends Object> term9507 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term9506 = ((Class) term9507).getDeclaredField((String) "ELSE");
        ((Field) term9506).setAccessible(true);
        enum32 = ((Field) term9506).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        argTypes[1] = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.IFunctionInnerBlock");
        argTypes[2] = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Object[] args = new Object[3];
        args[0] = term8930;
        args[1] = null;
        args[2] = enum32;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


