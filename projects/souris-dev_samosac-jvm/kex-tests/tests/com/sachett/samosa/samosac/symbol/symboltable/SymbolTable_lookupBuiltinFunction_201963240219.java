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

public class SymbolTable_lookupBuiltinFunction_201963240219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;

    public SymbolTable_lookupBuiltinFunction_201963240219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3062 = new ArrayList();
        ((ArrayList) term3062).add((Object)null);
        ArrayList term3060 = new ArrayList();
        ((ArrayList) term3060).add(term3062);
        LinkedHashMap term3068 = new LinkedHashMap();
        LinkedHashMap term3127 = new LinkedHashMap();
        Integer term3134 = new Integer(0);
        Integer term3136 = new Integer(0);
        LinkedHashMap term3139 = new LinkedHashMap();
        Integer term3148 = new Integer(0);
        Integer term3150 = new Integer(0);
        ArrayDeque term3153 = new ArrayDeque();
        term3059 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term3133 = newInstance(Class.forName("kotlin.Pair"));
        Object term3138 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3147 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3059, term3059.getClass(), "symbolScope", term3060);
        setField(term3059, term3059.getClass(), "builtinMethods", term3068);
        setField(term3059, term3059.getClass(), "blockScopes", term3127);
        setField(term3133, term3133.getClass(), "first", term3134);
        setField(term3133, term3133.getClass(), "second", term3136);
        setField(term3059, term3059.getClass(), "currentScopeCoordinates", term3133);
        setField(term3138, term3138.getClass(), "prevScopeTable", null);
        setField(term3138, term3138.getClass(), "table", term3139);
        setIntField(term3138, term3138.getClass(), "prevScopeIndex", -1);
        setIntField(term3138, term3138.getClass(), "scopeIndex", 0);
        setField(term3147, term3147.getClass(), "first", term3148);
        setField(term3147, term3147.getClass(), "second", term3150);
        setField(term3138, term3138.getClass(), "recordEntryCoordinates", term3147);
        setField(term3059, term3059.getClass(), "currentSymbolTableRecord", term3138);
        setBooleanField(term3059, term3059.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term3059, term3059.getClass(), "lastCoordinates", term3153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "pCTimMblYc";
        args[1] = "hNxWaHcfhY";
        callMethod(klass, "lookupBuiltinFunction", argTypes, term3059, args);
    }

};


