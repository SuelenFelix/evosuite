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

public class SymbolTable_resetScopeIndex_18646317989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1969;

    public SymbolTable_resetScopeIndex_18646317989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1972 = new ArrayList();
        ((ArrayList) term1972).add((Object)null);
        ArrayList term1970 = new ArrayList();
        ((ArrayList) term1970).add(term1972);
        LinkedHashMap term1978 = new LinkedHashMap();
        LinkedHashMap term2037 = new LinkedHashMap();
        Integer term2044 = new Integer(0);
        Integer term2046 = new Integer(0);
        LinkedHashMap term2049 = new LinkedHashMap();
        Integer term2058 = new Integer(0);
        Integer term2060 = new Integer(0);
        ArrayDeque term2063 = new ArrayDeque();
        term1969 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2043 = newInstance(Class.forName("kotlin.Pair"));
        Object term2048 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2057 = newInstance(Class.forName("kotlin.Pair"));
        setField(term1969, term1969.getClass(), "symbolScope", term1970);
        setField(term1969, term1969.getClass(), "builtinMethods", term1978);
        setField(term1969, term1969.getClass(), "blockScopes", term2037);
        setField(term2043, term2043.getClass(), "first", term2044);
        setField(term2043, term2043.getClass(), "second", term2046);
        setField(term1969, term1969.getClass(), "currentScopeCoordinates", term2043);
        setField(term2048, term2048.getClass(), "prevScopeTable", null);
        setField(term2048, term2048.getClass(), "table", term2049);
        setIntField(term2048, term2048.getClass(), "prevScopeIndex", -1);
        setIntField(term2048, term2048.getClass(), "scopeIndex", 0);
        setField(term2057, term2057.getClass(), "first", term2058);
        setField(term2057, term2057.getClass(), "second", term2060);
        setField(term2048, term2048.getClass(), "recordEntryCoordinates", term2057);
        setField(term1969, term1969.getClass(), "currentSymbolTableRecord", term2048);
        setBooleanField(term1969, term1969.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term1969, term1969.getClass(), "lastCoordinates", term2063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetScopeIndex", argTypes, term1969, args);
    }

};


