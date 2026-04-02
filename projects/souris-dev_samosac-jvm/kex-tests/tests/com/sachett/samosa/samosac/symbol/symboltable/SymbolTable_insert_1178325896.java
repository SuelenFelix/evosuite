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

public class SymbolTable_insert_1178325896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1651;

    public SymbolTable_insert_1178325896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1654 = new ArrayList();
        ((ArrayList) term1654).add((Object)null);
        ArrayList term1652 = new ArrayList();
        ((ArrayList) term1652).add(term1654);
        LinkedHashMap term1660 = new LinkedHashMap();
        LinkedHashMap term1719 = new LinkedHashMap();
        Integer term1726 = new Integer(0);
        Integer term1728 = new Integer(0);
        LinkedHashMap term1731 = new LinkedHashMap();
        Integer term1740 = new Integer(0);
        Integer term1742 = new Integer(0);
        ArrayDeque term1745 = new ArrayDeque();
        term1651 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term1725 = newInstance(Class.forName("kotlin.Pair"));
        Object term1730 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term1739 = newInstance(Class.forName("kotlin.Pair"));
        setField(term1651, term1651.getClass(), "symbolScope", term1652);
        setField(term1651, term1651.getClass(), "builtinMethods", term1660);
        setField(term1651, term1651.getClass(), "blockScopes", term1719);
        setField(term1725, term1725.getClass(), "first", term1726);
        setField(term1725, term1725.getClass(), "second", term1728);
        setField(term1651, term1651.getClass(), "currentScopeCoordinates", term1725);
        setField(term1730, term1730.getClass(), "prevScopeTable", null);
        setField(term1730, term1730.getClass(), "table", term1731);
        setIntField(term1730, term1730.getClass(), "prevScopeIndex", -1);
        setIntField(term1730, term1730.getClass(), "scopeIndex", 0);
        setField(term1739, term1739.getClass(), "first", term1740);
        setField(term1739, term1739.getClass(), "second", term1742);
        setField(term1730, term1730.getClass(), "recordEntryCoordinates", term1739);
        setField(term1651, term1651.getClass(), "currentSymbolTableRecord", term1730);
        setBooleanField(term1651, term1651.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term1651, term1651.getClass(), "lastCoordinates", term1745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.sachett.samosa.samosac.symbol.ISymbol");
        Object[] args = new Object[2];
        args[0] = "oVcInYnLWB";
        args[1] = null;
        callMethod(klass, "insert", argTypes, term1651, args);
    }

};


