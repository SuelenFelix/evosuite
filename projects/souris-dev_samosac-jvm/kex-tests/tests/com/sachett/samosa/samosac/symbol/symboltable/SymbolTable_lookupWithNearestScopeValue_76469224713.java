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

public class SymbolTable_lookupWithNearestScopeValue_76469224713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2390;

    public SymbolTable_lookupWithNearestScopeValue_76469224713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2393 = new ArrayList();
        ((ArrayList) term2393).add((Object)null);
        ArrayList term2391 = new ArrayList();
        ((ArrayList) term2391).add(term2393);
        LinkedHashMap term2399 = new LinkedHashMap();
        LinkedHashMap term2458 = new LinkedHashMap();
        Integer term2465 = new Integer(0);
        Integer term2467 = new Integer(0);
        LinkedHashMap term2470 = new LinkedHashMap();
        Integer term2479 = new Integer(0);
        Integer term2481 = new Integer(0);
        ArrayDeque term2484 = new ArrayDeque();
        term2390 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2464 = newInstance(Class.forName("kotlin.Pair"));
        Object term2469 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2478 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2390, term2390.getClass(), "symbolScope", term2391);
        setField(term2390, term2390.getClass(), "builtinMethods", term2399);
        setField(term2390, term2390.getClass(), "blockScopes", term2458);
        setField(term2464, term2464.getClass(), "first", term2465);
        setField(term2464, term2464.getClass(), "second", term2467);
        setField(term2390, term2390.getClass(), "currentScopeCoordinates", term2464);
        setField(term2469, term2469.getClass(), "prevScopeTable", null);
        setField(term2469, term2469.getClass(), "table", term2470);
        setIntField(term2469, term2469.getClass(), "prevScopeIndex", -1);
        setIntField(term2469, term2469.getClass(), "scopeIndex", 0);
        setField(term2478, term2478.getClass(), "first", term2479);
        setField(term2478, term2478.getClass(), "second", term2481);
        setField(term2469, term2469.getClass(), "recordEntryCoordinates", term2478);
        setField(term2390, term2390.getClass(), "currentSymbolTableRecord", term2469);
        setBooleanField(term2390, term2390.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2390, term2390.getClass(), "lastCoordinates", term2484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "lookupWithNearestScopeValue", argTypes, term2390, args);
    }

};


