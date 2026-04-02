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

public class SymbolTable_lookupInCurrentScopeOnly_106735327415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2635;

    public SymbolTable_lookupInCurrentScopeOnly_106735327415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2638 = new ArrayList();
        ((ArrayList) term2638).add((Object)null);
        ArrayList term2636 = new ArrayList();
        ((ArrayList) term2636).add(term2638);
        LinkedHashMap term2644 = new LinkedHashMap();
        LinkedHashMap term2703 = new LinkedHashMap();
        Integer term2710 = new Integer(0);
        Integer term2712 = new Integer(0);
        LinkedHashMap term2715 = new LinkedHashMap();
        Integer term2724 = new Integer(0);
        Integer term2726 = new Integer(0);
        ArrayDeque term2729 = new ArrayDeque();
        term2635 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2709 = newInstance(Class.forName("kotlin.Pair"));
        Object term2714 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2723 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2635, term2635.getClass(), "symbolScope", term2636);
        setField(term2635, term2635.getClass(), "builtinMethods", term2644);
        setField(term2635, term2635.getClass(), "blockScopes", term2703);
        setField(term2709, term2709.getClass(), "first", term2710);
        setField(term2709, term2709.getClass(), "second", term2712);
        setField(term2635, term2635.getClass(), "currentScopeCoordinates", term2709);
        setField(term2714, term2714.getClass(), "prevScopeTable", null);
        setField(term2714, term2714.getClass(), "table", term2715);
        setIntField(term2714, term2714.getClass(), "prevScopeIndex", -1);
        setIntField(term2714, term2714.getClass(), "scopeIndex", 0);
        setField(term2723, term2723.getClass(), "first", term2724);
        setField(term2723, term2723.getClass(), "second", term2726);
        setField(term2714, term2714.getClass(), "recordEntryCoordinates", term2723);
        setField(term2635, term2635.getClass(), "currentSymbolTableRecord", term2714);
        setBooleanField(term2635, term2635.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2635, term2635.getClass(), "lastCoordinates", term2729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "lookupInCurrentScopeOnly", argTypes, term2635, args);
    }

};


