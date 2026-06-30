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

public class SymbolTable_decrementScope_16859017610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067;
     Object term2165;

    public SymbolTable_decrementScope_16859017610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2070 = new ArrayList();
        ((ArrayList) term2070).add((Object)null);
        ArrayList term2068 = new ArrayList();
        ((ArrayList) term2068).add(term2070);
        LinkedHashMap term2076 = new LinkedHashMap();
        LinkedHashMap term2135 = new LinkedHashMap();
        Integer term2142 = new Integer(0);
        Integer term2144 = new Integer(0);
        LinkedHashMap term2147 = new LinkedHashMap();
        Integer term2156 = new Integer(0);
        Integer term2158 = new Integer(0);
        ArrayDeque term2161 = new ArrayDeque();
        term2067 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2141 = newInstance(Class.forName("kotlin.Pair"));
        Object term2146 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2155 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2067, term2067.getClass(), "symbolScope", term2068);
        setField(term2067, term2067.getClass(), "builtinMethods", term2076);
        setField(term2067, term2067.getClass(), "blockScopes", term2135);
        setField(term2141, term2141.getClass(), "first", term2142);
        setField(term2141, term2141.getClass(), "second", term2144);
        setField(term2067, term2067.getClass(), "currentScopeCoordinates", term2141);
        setField(term2146, term2146.getClass(), "prevScopeTable", null);
        setField(term2146, term2146.getClass(), "table", term2147);
        setIntField(term2146, term2146.getClass(), "prevScopeIndex", -1);
        setIntField(term2146, term2146.getClass(), "scopeIndex", 0);
        setField(term2155, term2155.getClass(), "first", term2156);
        setField(term2155, term2155.getClass(), "second", term2158);
        setField(term2146, term2146.getClass(), "recordEntryCoordinates", term2155);
        setField(term2067, term2067.getClass(), "currentSymbolTableRecord", term2146);
        setBooleanField(term2067, term2067.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2067, term2067.getClass(), "lastCoordinates", term2161);
        term2165 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2165;
        callMethod(klass, "decrementScope", argTypes, term2067, args);
    }

};


