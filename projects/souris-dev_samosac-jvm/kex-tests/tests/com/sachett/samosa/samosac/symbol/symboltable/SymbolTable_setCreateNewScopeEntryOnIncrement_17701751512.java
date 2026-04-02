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

public class SymbolTable_setCreateNewScopeEntryOnIncrement_17701751512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term197;

    public SymbolTable_setCreateNewScopeEntryOnIncrement_17701751512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term102 = new ArrayList();
        ((ArrayList) term102).add((Object)null);
        ArrayList term100 = new ArrayList();
        ((ArrayList) term100).add(term102);
        LinkedHashMap term108 = new LinkedHashMap();
        LinkedHashMap term167 = new LinkedHashMap();
        Integer term174 = new Integer(0);
        Integer term176 = new Integer(0);
        LinkedHashMap term179 = new LinkedHashMap();
        Integer term188 = new Integer(0);
        Integer term190 = new Integer(0);
        ArrayDeque term193 = new ArrayDeque();
        term99 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term173 = newInstance(Class.forName("kotlin.Pair"));
        Object term178 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term187 = newInstance(Class.forName("kotlin.Pair"));
        setField(term99, term99.getClass(), "symbolScope", term100);
        setField(term99, term99.getClass(), "builtinMethods", term108);
        setField(term99, term99.getClass(), "blockScopes", term167);
        setField(term173, term173.getClass(), "first", term174);
        setField(term173, term173.getClass(), "second", term176);
        setField(term99, term99.getClass(), "currentScopeCoordinates", term173);
        setField(term178, term178.getClass(), "prevScopeTable", null);
        setField(term178, term178.getClass(), "table", term179);
        setIntField(term178, term178.getClass(), "prevScopeIndex", -1);
        setIntField(term178, term178.getClass(), "scopeIndex", 0);
        setField(term187, term187.getClass(), "first", term188);
        setField(term187, term187.getClass(), "second", term190);
        setField(term178, term178.getClass(), "recordEntryCoordinates", term187);
        setField(term99, term99.getClass(), "currentSymbolTableRecord", term178);
        setBooleanField(term99, term99.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term99, term99.getClass(), "lastCoordinates", term193);
        term197 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term197;
        callMethod(klass, "setCreateNewScopeEntryOnIncrement", argTypes, term99, args);
    }

};


