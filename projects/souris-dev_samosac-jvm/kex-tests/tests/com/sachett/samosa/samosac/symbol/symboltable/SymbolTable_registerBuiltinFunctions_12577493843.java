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

public class SymbolTable_registerBuiltinFunctions_12577493843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;

    public SymbolTable_registerBuiltinFunctions_12577493843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term202 = new ArrayList();
        ((ArrayList) term202).add((Object)null);
        ArrayList term200 = new ArrayList();
        ((ArrayList) term200).add(term202);
        LinkedHashMap term208 = new LinkedHashMap();
        LinkedHashMap term267 = new LinkedHashMap();
        Integer term274 = new Integer(0);
        Integer term276 = new Integer(0);
        LinkedHashMap term279 = new LinkedHashMap();
        Integer term288 = new Integer(0);
        Integer term290 = new Integer(0);
        ArrayDeque term293 = new ArrayDeque();
        term199 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term273 = newInstance(Class.forName("kotlin.Pair"));
        Object term278 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term287 = newInstance(Class.forName("kotlin.Pair"));
        setField(term199, term199.getClass(), "symbolScope", term200);
        setField(term199, term199.getClass(), "builtinMethods", term208);
        setField(term199, term199.getClass(), "blockScopes", term267);
        setField(term273, term273.getClass(), "first", term274);
        setField(term273, term273.getClass(), "second", term276);
        setField(term199, term199.getClass(), "currentScopeCoordinates", term273);
        setField(term278, term278.getClass(), "prevScopeTable", null);
        setField(term278, term278.getClass(), "table", term279);
        setIntField(term278, term278.getClass(), "prevScopeIndex", -1);
        setIntField(term278, term278.getClass(), "scopeIndex", 0);
        setField(term287, term287.getClass(), "first", term288);
        setField(term287, term287.getClass(), "second", term290);
        setField(term278, term278.getClass(), "recordEntryCoordinates", term287);
        setField(term199, term199.getClass(), "currentSymbolTableRecord", term278);
        setBooleanField(term199, term199.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term199, term199.getClass(), "lastCoordinates", term293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "registerBuiltinFunctions", argTypes, term199, args);
    }

};


