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

public class SymbolTable_restoreLastCoordinates_97607806018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2961;

    public SymbolTable_restoreLastCoordinates_97607806018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2964 = new ArrayList();
        ((ArrayList) term2964).add((Object)null);
        ArrayList term2962 = new ArrayList();
        ((ArrayList) term2962).add(term2964);
        LinkedHashMap term2970 = new LinkedHashMap();
        LinkedHashMap term3029 = new LinkedHashMap();
        Integer term3036 = new Integer(0);
        Integer term3038 = new Integer(0);
        LinkedHashMap term3041 = new LinkedHashMap();
        Integer term3050 = new Integer(0);
        Integer term3052 = new Integer(0);
        ArrayDeque term3055 = new ArrayDeque();
        term2961 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term3035 = newInstance(Class.forName("kotlin.Pair"));
        Object term3040 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3049 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2961, term2961.getClass(), "symbolScope", term2962);
        setField(term2961, term2961.getClass(), "builtinMethods", term2970);
        setField(term2961, term2961.getClass(), "blockScopes", term3029);
        setField(term3035, term3035.getClass(), "first", term3036);
        setField(term3035, term3035.getClass(), "second", term3038);
        setField(term2961, term2961.getClass(), "currentScopeCoordinates", term3035);
        setField(term3040, term3040.getClass(), "prevScopeTable", null);
        setField(term3040, term3040.getClass(), "table", term3041);
        setIntField(term3040, term3040.getClass(), "prevScopeIndex", -1);
        setIntField(term3040, term3040.getClass(), "scopeIndex", 0);
        setField(term3049, term3049.getClass(), "first", term3050);
        setField(term3049, term3049.getClass(), "second", term3052);
        setField(term3040, term3040.getClass(), "recordEntryCoordinates", term3049);
        setField(term2961, term2961.getClass(), "currentSymbolTableRecord", term3040);
        setBooleanField(term2961, term2961.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2961, term2961.getClass(), "lastCoordinates", term3055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "restoreLastCoordinates", argTypes, term2961, args);
    }

};


