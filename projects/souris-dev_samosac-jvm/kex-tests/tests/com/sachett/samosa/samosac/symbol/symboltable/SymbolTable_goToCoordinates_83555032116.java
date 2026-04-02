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

public class SymbolTable_goToCoordinates_83555032116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2755;
     Object term2853;

    public SymbolTable_goToCoordinates_83555032116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2758 = new ArrayList();
        ((ArrayList) term2758).add((Object)null);
        ArrayList term2756 = new ArrayList();
        ((ArrayList) term2756).add(term2758);
        LinkedHashMap term2764 = new LinkedHashMap();
        LinkedHashMap term2823 = new LinkedHashMap();
        Integer term2830 = new Integer(0);
        Integer term2832 = new Integer(0);
        LinkedHashMap term2835 = new LinkedHashMap();
        Integer term2844 = new Integer(0);
        Integer term2846 = new Integer(0);
        ArrayDeque term2849 = new ArrayDeque();
        term2755 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2829 = newInstance(Class.forName("kotlin.Pair"));
        Object term2834 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2843 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2755, term2755.getClass(), "symbolScope", term2756);
        setField(term2755, term2755.getClass(), "builtinMethods", term2764);
        setField(term2755, term2755.getClass(), "blockScopes", term2823);
        setField(term2829, term2829.getClass(), "first", term2830);
        setField(term2829, term2829.getClass(), "second", term2832);
        setField(term2755, term2755.getClass(), "currentScopeCoordinates", term2829);
        setField(term2834, term2834.getClass(), "prevScopeTable", null);
        setField(term2834, term2834.getClass(), "table", term2835);
        setIntField(term2834, term2834.getClass(), "prevScopeIndex", -1);
        setIntField(term2834, term2834.getClass(), "scopeIndex", 0);
        setField(term2843, term2843.getClass(), "first", term2844);
        setField(term2843, term2843.getClass(), "second", term2846);
        setField(term2834, term2834.getClass(), "recordEntryCoordinates", term2843);
        setField(term2755, term2755.getClass(), "currentSymbolTableRecord", term2834);
        setBooleanField(term2755, term2755.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2755, term2755.getClass(), "lastCoordinates", term2849);
        Integer term2854 = new Integer(-1922583790);
        Integer term2856 = new Integer(-616727354);
        term2853 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2853, term2853.getClass(), "first", term2854);
        setField(term2853, term2853.getClass(), "second", term2856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term2853;
        callMethod(klass, "goToCoordinates", argTypes, term2755, args);
    }

};


