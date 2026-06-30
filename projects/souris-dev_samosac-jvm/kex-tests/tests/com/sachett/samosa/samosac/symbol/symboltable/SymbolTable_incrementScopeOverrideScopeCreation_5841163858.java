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
import java.lang.Boolean;

public class SymbolTable_incrementScopeOverrideScopeCreation_5841163858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869;
     Object term1967;

    public SymbolTable_incrementScopeOverrideScopeCreation_5841163858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1872 = new ArrayList();
        ((ArrayList) term1872).add((Object)null);
        ArrayList term1870 = new ArrayList();
        ((ArrayList) term1870).add(term1872);
        LinkedHashMap term1878 = new LinkedHashMap();
        LinkedHashMap term1937 = new LinkedHashMap();
        Integer term1944 = new Integer(0);
        Integer term1946 = new Integer(0);
        LinkedHashMap term1949 = new LinkedHashMap();
        Integer term1958 = new Integer(0);
        Integer term1960 = new Integer(0);
        ArrayDeque term1963 = new ArrayDeque();
        term1869 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term1943 = newInstance(Class.forName("kotlin.Pair"));
        Object term1948 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term1957 = newInstance(Class.forName("kotlin.Pair"));
        setField(term1869, term1869.getClass(), "symbolScope", term1870);
        setField(term1869, term1869.getClass(), "builtinMethods", term1878);
        setField(term1869, term1869.getClass(), "blockScopes", term1937);
        setField(term1943, term1943.getClass(), "first", term1944);
        setField(term1943, term1943.getClass(), "second", term1946);
        setField(term1869, term1869.getClass(), "currentScopeCoordinates", term1943);
        setField(term1948, term1948.getClass(), "prevScopeTable", null);
        setField(term1948, term1948.getClass(), "table", term1949);
        setIntField(term1948, term1948.getClass(), "prevScopeIndex", -1);
        setIntField(term1948, term1948.getClass(), "scopeIndex", 0);
        setField(term1957, term1957.getClass(), "first", term1958);
        setField(term1957, term1957.getClass(), "second", term1960);
        setField(term1948, term1948.getClass(), "recordEntryCoordinates", term1957);
        setField(term1869, term1869.getClass(), "currentSymbolTableRecord", term1948);
        setBooleanField(term1869, term1869.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term1869, term1869.getClass(), "lastCoordinates", term1963);
        term1967 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1967;
        callMethod(klass, "incrementScopeOverrideScopeCreation", argTypes, term1869, args);
    }

};


