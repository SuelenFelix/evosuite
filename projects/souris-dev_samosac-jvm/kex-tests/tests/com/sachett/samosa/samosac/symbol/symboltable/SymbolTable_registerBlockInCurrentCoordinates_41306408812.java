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

public class SymbolTable_registerBlockInCurrentCoordinates_41306408812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2287;
     Object term2385;

    public SymbolTable_registerBlockInCurrentCoordinates_41306408812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2290 = new ArrayList();
        ((ArrayList) term2290).add((Object)null);
        ArrayList term2288 = new ArrayList();
        ((ArrayList) term2288).add(term2290);
        LinkedHashMap term2296 = new LinkedHashMap();
        LinkedHashMap term2355 = new LinkedHashMap();
        Integer term2362 = new Integer(0);
        Integer term2364 = new Integer(0);
        LinkedHashMap term2367 = new LinkedHashMap();
        Integer term2376 = new Integer(0);
        Integer term2378 = new Integer(0);
        ArrayDeque term2381 = new ArrayDeque();
        term2287 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2361 = newInstance(Class.forName("kotlin.Pair"));
        Object term2366 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2375 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2287, term2287.getClass(), "symbolScope", term2288);
        setField(term2287, term2287.getClass(), "builtinMethods", term2296);
        setField(term2287, term2287.getClass(), "blockScopes", term2355);
        setField(term2361, term2361.getClass(), "first", term2362);
        setField(term2361, term2361.getClass(), "second", term2364);
        setField(term2287, term2287.getClass(), "currentScopeCoordinates", term2361);
        setField(term2366, term2366.getClass(), "prevScopeTable", null);
        setField(term2366, term2366.getClass(), "table", term2367);
        setIntField(term2366, term2366.getClass(), "prevScopeIndex", -1);
        setIntField(term2366, term2366.getClass(), "scopeIndex", 0);
        setField(term2375, term2375.getClass(), "first", term2376);
        setField(term2375, term2375.getClass(), "second", term2378);
        setField(term2366, term2366.getClass(), "recordEntryCoordinates", term2375);
        setField(term2287, term2287.getClass(), "currentSymbolTableRecord", term2366);
        setBooleanField(term2287, term2287.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2287, term2287.getClass(), "lastCoordinates", term2381);
        Integer term2386 = new Integer(568599855);
        Integer term2388 = new Integer(1162663216);
        term2385 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2385, term2385.getClass(), "first", term2386);
        setField(term2385, term2385.getClass(), "second", term2388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term2385;
        callMethod(klass, "registerBlockInCurrentCoordinates", argTypes, term2287, args);
    }

};


