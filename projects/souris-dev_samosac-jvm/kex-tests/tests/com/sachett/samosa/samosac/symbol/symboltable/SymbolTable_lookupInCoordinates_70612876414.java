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

public class SymbolTable_lookupInCoordinates_70612876414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2510;
     Object term2620;

    public SymbolTable_lookupInCoordinates_70612876414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2513 = new ArrayList();
        ((ArrayList) term2513).add((Object)null);
        ArrayList term2511 = new ArrayList();
        ((ArrayList) term2511).add(term2513);
        LinkedHashMap term2519 = new LinkedHashMap();
        LinkedHashMap term2578 = new LinkedHashMap();
        Integer term2585 = new Integer(0);
        Integer term2587 = new Integer(0);
        LinkedHashMap term2590 = new LinkedHashMap();
        Integer term2599 = new Integer(0);
        Integer term2601 = new Integer(0);
        ArrayDeque term2604 = new ArrayDeque();
        term2510 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term2584 = newInstance(Class.forName("kotlin.Pair"));
        Object term2589 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term2598 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2510, term2510.getClass(), "symbolScope", term2511);
        setField(term2510, term2510.getClass(), "builtinMethods", term2519);
        setField(term2510, term2510.getClass(), "blockScopes", term2578);
        setField(term2584, term2584.getClass(), "first", term2585);
        setField(term2584, term2584.getClass(), "second", term2587);
        setField(term2510, term2510.getClass(), "currentScopeCoordinates", term2584);
        setField(term2589, term2589.getClass(), "prevScopeTable", null);
        setField(term2589, term2589.getClass(), "table", term2590);
        setIntField(term2589, term2589.getClass(), "prevScopeIndex", -1);
        setIntField(term2589, term2589.getClass(), "scopeIndex", 0);
        setField(term2598, term2598.getClass(), "first", term2599);
        setField(term2598, term2598.getClass(), "second", term2601);
        setField(term2589, term2589.getClass(), "recordEntryCoordinates", term2598);
        setField(term2510, term2510.getClass(), "currentSymbolTableRecord", term2589);
        setBooleanField(term2510, term2510.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term2510, term2510.getClass(), "lastCoordinates", term2604);
        Integer term2621 = new Integer(1484323161);
        Integer term2623 = new Integer(391863371);
        term2620 = newInstance(Class.forName("kotlin.Pair"));
        setField(term2620, term2620.getClass(), "first", term2621);
        setField(term2620, term2620.getClass(), "second", term2623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("kotlin.Pair");
        Object[] args = new Object[2];
        args[0] = "tbcdzjIfER";
        args[1] = term2620;
        callMethod(klass, "lookupInCoordinates", argTypes, term2510, args);
    }

};


