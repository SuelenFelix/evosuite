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

public class SymbolTable_incrementScope_20381975987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;

    public SymbolTable_incrementScope_20381975987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1774 = new ArrayList();
        ((ArrayList) term1774).add((Object)null);
        ArrayList term1772 = new ArrayList();
        ((ArrayList) term1772).add(term1774);
        LinkedHashMap term1780 = new LinkedHashMap();
        LinkedHashMap term1839 = new LinkedHashMap();
        Integer term1846 = new Integer(0);
        Integer term1848 = new Integer(0);
        LinkedHashMap term1851 = new LinkedHashMap();
        Integer term1860 = new Integer(0);
        Integer term1862 = new Integer(0);
        ArrayDeque term1865 = new ArrayDeque();
        term1771 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term1845 = newInstance(Class.forName("kotlin.Pair"));
        Object term1850 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term1859 = newInstance(Class.forName("kotlin.Pair"));
        setField(term1771, term1771.getClass(), "symbolScope", term1772);
        setField(term1771, term1771.getClass(), "builtinMethods", term1780);
        setField(term1771, term1771.getClass(), "blockScopes", term1839);
        setField(term1845, term1845.getClass(), "first", term1846);
        setField(term1845, term1845.getClass(), "second", term1848);
        setField(term1771, term1771.getClass(), "currentScopeCoordinates", term1845);
        setField(term1850, term1850.getClass(), "prevScopeTable", null);
        setField(term1850, term1850.getClass(), "table", term1851);
        setIntField(term1850, term1850.getClass(), "prevScopeIndex", -1);
        setIntField(term1850, term1850.getClass(), "scopeIndex", 0);
        setField(term1859, term1859.getClass(), "first", term1860);
        setField(term1859, term1859.getClass(), "second", term1862);
        setField(term1850, term1850.getClass(), "recordEntryCoordinates", term1859);
        setField(term1771, term1771.getClass(), "currentSymbolTableRecord", term1850);
        setBooleanField(term1771, term1771.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term1771, term1771.getClass(), "lastCoordinates", term1865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementScope", argTypes, term1771, args);
    }

};


