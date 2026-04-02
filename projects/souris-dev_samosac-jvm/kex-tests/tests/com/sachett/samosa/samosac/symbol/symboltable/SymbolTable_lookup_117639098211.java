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

public class SymbolTable_lookup_117639098211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2167;

    public SymbolTable_lookup_117639098211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2170 = new ArrayList();
        ((ArrayList) term2170).add((Object)null);
        ArrayList term2168 = new ArrayList();
        ((ArrayList) term2168).add(term2170);
        LinkedHashMap term2176 = new LinkedHashMap();
        LinkedHashMap term2235 = new LinkedHashMap();
        Integer term2242 = new Integer(0);
        Integer term2244 = new Integer(0);
        LinkedHashMap term2247 = new LinkedHashMap();
        Integer term2256 = new Integer(0);
        Integer term2258 = new Integer(0);
        ArrayDeque term2261 = new ArrayDeque();
        term2167 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2241 = newInstance(Class.forName("kotlin.Pair"));
        Object term2246 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2255 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2167, term2167.getClass(), "symbolScope", term2168);
        setField(term2167, term2167.getClass(), "builtinMethods", term2176);
        setField(term2167, term2167.getClass(), "blockScopes", term2235);
        setField(term2241, term2241.getClass(), "first", term2242);
        setField(term2241, term2241.getClass(), "second", term2244);
        setField(term2167, term2167.getClass(), "currentScopeCoordinates", term2241);
        setField(term2246, term2246.getClass(), "prevScopeTable", null);
        setField(term2246, term2246.getClass(), "table", term2247);
        setIntField(term2246, term2246.getClass(), "prevScopeIndex", -1);
        setIntField(term2246, term2246.getClass(), "scopeIndex", 0);
        setField(term2255, term2255.getClass(), "first", term2256);
        setField(term2255, term2255.getClass(), "second", term2258);
        setField(term2246, term2246.getClass(), "recordEntryCoordinates", term2255);
        setField(term2167, term2167.getClass(), "currentSymbolTableRecord", term2246);
        setBooleanField(term2167, term2167.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2167, term2167.getClass(), "lastCoordinates", term2261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "lookup", argTypes, term2167, args);
    }

};


