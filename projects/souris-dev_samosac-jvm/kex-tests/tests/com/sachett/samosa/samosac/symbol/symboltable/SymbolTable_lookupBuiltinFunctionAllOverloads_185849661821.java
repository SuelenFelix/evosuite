package com.sachett.samosa.samosac.symbol.symboltable;

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
import static com.sachett.samosa.samosac.symbol.symboltable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.util.ArrayDeque;

public class SymbolTable_lookupBuiltinFunctionAllOverloads_185849661821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3343;

    public SymbolTable_lookupBuiltinFunctionAllOverloads_185849661821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3346 = new ArrayList();
        ((ArrayList) term3346).add((Object)null);
        ArrayList term3344 = new ArrayList();
        ((ArrayList) term3344).add(term3346);
        LinkedHashMap term3352 = new LinkedHashMap();
        LinkedHashMap term3411 = new LinkedHashMap();
        Integer term3418 = new Integer(0);
        Integer term3420 = new Integer(0);
        LinkedHashMap term3423 = new LinkedHashMap();
        Integer term3432 = new Integer(0);
        Integer term3434 = new Integer(0);
        ArrayDeque term3437 = new ArrayDeque();
        term3343 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term3417 = newInstance(Class.forName("kotlin.Pair"));
        Object term3422 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3431 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3343, term3343.getClass(), "symbolScope", term3344);
        setField(term3343, term3343.getClass(), "builtinMethods", term3352);
        setField(term3343, term3343.getClass(), "blockScopes", term3411);
        setField(term3417, term3417.getClass(), "first", term3418);
        setField(term3417, term3417.getClass(), "second", term3420);
        setField(term3343, term3343.getClass(), "currentScopeCoordinates", term3417);
        setField(term3422, term3422.getClass(), "prevScopeTable", null);
        setField(term3422, term3422.getClass(), "table", term3423);
        setIntField(term3422, term3422.getClass(), "prevScopeIndex", -1);
        setIntField(term3422, term3422.getClass(), "scopeIndex", 0);
        setField(term3431, term3431.getClass(), "first", term3432);
        setField(term3431, term3431.getClass(), "second", term3434);
        setField(term3422, term3422.getClass(), "recordEntryCoordinates", term3431);
        setField(term3343, term3343.getClass(), "currentSymbolTableRecord", term3422);
        setBooleanField(term3343, term3343.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term3343, term3343.getClass(), "lastCoordinates", term3437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "lookupBuiltinFunctionAllOverloads", argTypes, term3343, args);
    }

};


