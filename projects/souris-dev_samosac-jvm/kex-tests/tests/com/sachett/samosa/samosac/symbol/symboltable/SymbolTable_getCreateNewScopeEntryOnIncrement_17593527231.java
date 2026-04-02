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

public class SymbolTable_getCreateNewScopeEntryOnIncrement_17593527231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SymbolTable_getCreateNewScopeEntryOnIncrement_17593527231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4 = new ArrayList();
        ((ArrayList) term4).add((Object)null);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        LinkedHashMap term10 = new LinkedHashMap();
        LinkedHashMap term69 = new LinkedHashMap();
        Integer term76 = new Integer(0);
        Integer term78 = new Integer(0);
        LinkedHashMap term81 = new LinkedHashMap();
        Integer term90 = new Integer(0);
        Integer term92 = new Integer(0);
        ArrayDeque term95 = new ArrayDeque();
        term1 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term75 = newInstance(Class.forName("kotlin.Pair"));
        Object term80 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term89 = newInstance(Class.forName("kotlin.Pair"));
        setField(term1, term1.getClass(), "symbolScope", term2);
        setField(term1, term1.getClass(), "builtinMethods", term10);
        setField(term1, term1.getClass(), "blockScopes", term69);
        setField(term75, term75.getClass(), "first", term76);
        setField(term75, term75.getClass(), "second", term78);
        setField(term1, term1.getClass(), "currentScopeCoordinates", term75);
        setField(term80, term80.getClass(), "prevScopeTable", null);
        setField(term80, term80.getClass(), "table", term81);
        setIntField(term80, term80.getClass(), "prevScopeIndex", -1);
        setIntField(term80, term80.getClass(), "scopeIndex", 0);
        setField(term89, term89.getClass(), "first", term90);
        setField(term89, term89.getClass(), "second", term92);
        setField(term80, term80.getClass(), "recordEntryCoordinates", term89);
        setField(term1, term1.getClass(), "currentSymbolTableRecord", term80);
        setBooleanField(term1, term1.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term1, term1.getClass(), "lastCoordinates", term95);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateNewScopeEntryOnIncrement", argTypes, term1, args);
    }

};


