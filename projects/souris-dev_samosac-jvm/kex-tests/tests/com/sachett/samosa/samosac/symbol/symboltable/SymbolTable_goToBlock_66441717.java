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

public class SymbolTable_goToBlock_66441717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2858;
     Object term2956;

    public SymbolTable_goToBlock_66441717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2861 = new ArrayList();
        ((ArrayList) term2861).add((Object)null);
        ArrayList term2859 = new ArrayList();
        ((ArrayList) term2859).add(term2861);
        LinkedHashMap term2867 = new LinkedHashMap();
        LinkedHashMap term2926 = new LinkedHashMap();
        Integer term2933 = new Integer(0);
        Integer term2935 = new Integer(0);
        LinkedHashMap term2938 = new LinkedHashMap();
        Integer term2947 = new Integer(0);
        Integer term2949 = new Integer(0);
        ArrayDeque term2952 = new ArrayDeque();
        term2858 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2932 = newInstance(Class.forName("kotlin.Pair"));
        Object term2937 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2946 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2858, term2858.getClass(), "symbolScope", term2859);
        setField(term2858, term2858.getClass(), "builtinMethods", term2867);
        setField(term2858, term2858.getClass(), "blockScopes", term2926);
        setField(term2932, term2932.getClass(), "first", term2933);
        setField(term2932, term2932.getClass(), "second", term2935);
        setField(term2858, term2858.getClass(), "currentScopeCoordinates", term2932);
        setField(term2937, term2937.getClass(), "prevScopeTable", null);
        setField(term2937, term2937.getClass(), "table", term2938);
        setIntField(term2937, term2937.getClass(), "prevScopeIndex", -1);
        setIntField(term2937, term2937.getClass(), "scopeIndex", 0);
        setField(term2946, term2946.getClass(), "first", term2947);
        setField(term2946, term2946.getClass(), "second", term2949);
        setField(term2937, term2937.getClass(), "recordEntryCoordinates", term2946);
        setField(term2858, term2858.getClass(), "currentSymbolTableRecord", term2937);
        setBooleanField(term2858, term2858.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2858, term2858.getClass(), "lastCoordinates", term2952);
        Integer term2957 = new Integer(-1955890973);
        Integer term2959 = new Integer(-2038273078);
        term2956 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2956, term2956.getClass(), "first", term2957);
        setField(term2956, term2956.getClass(), "second", term2959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term2956;
        callMethod(klass, "goToBlock", argTypes, term2858, args);
    }

};


