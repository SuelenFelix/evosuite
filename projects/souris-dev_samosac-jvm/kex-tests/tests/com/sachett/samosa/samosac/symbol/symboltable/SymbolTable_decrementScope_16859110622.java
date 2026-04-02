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

public class SymbolTable_decrementScope_16859110622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3463;

    public SymbolTable_decrementScope_16859110622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3466 = new ArrayList();
        ((ArrayList) term3466).add((Object)null);
        ArrayList term3464 = new ArrayList();
        ((ArrayList) term3464).add(term3466);
        LinkedHashMap term3472 = new LinkedHashMap();
        LinkedHashMap term3531 = new LinkedHashMap();
        Integer term3538 = new Integer(0);
        Integer term3540 = new Integer(0);
        LinkedHashMap term3543 = new LinkedHashMap();
        Integer term3552 = new Integer(0);
        Integer term3554 = new Integer(0);
        ArrayDeque term3557 = new ArrayDeque();
        term3463 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term3537 = newInstance(Class.forName("kotlin.Pair"));
        Object term3542 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3551 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3463, term3463.getClass(), "symbolScope", term3464);
        setField(term3463, term3463.getClass(), "builtinMethods", term3472);
        setField(term3463, term3463.getClass(), "blockScopes", term3531);
        setField(term3537, term3537.getClass(), "first", term3538);
        setField(term3537, term3537.getClass(), "second", term3540);
        setField(term3463, term3463.getClass(), "currentScopeCoordinates", term3537);
        setField(term3542, term3542.getClass(), "prevScopeTable", null);
        setField(term3542, term3542.getClass(), "table", term3543);
        setIntField(term3542, term3542.getClass(), "prevScopeIndex", -1);
        setIntField(term3542, term3542.getClass(), "scopeIndex", 0);
        setField(term3551, term3551.getClass(), "first", term3552);
        setField(term3551, term3551.getClass(), "second", term3554);
        setField(term3542, term3542.getClass(), "recordEntryCoordinates", term3551);
        setField(term3463, term3463.getClass(), "currentSymbolTableRecord", term3542);
        setBooleanField(term3463, term3463.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term3463, term3463.getClass(), "lastCoordinates", term3557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decrementScope", argTypes, term3463, args);
    }

};


