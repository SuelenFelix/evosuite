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
import java.lang.Object;
import java.util.HashMap;

public class SymbolTableRecordEntry_hashCode_87981595317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4568;

    public SymbolTableRecordEntry_hashCode_87981595317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4575 = new HashMap();
        HashMap term4583 = new HashMap();
        HashMap term4592 = new HashMap();
        HashMap term4603 = new HashMap();
        term4568 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4569 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4570 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4571 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4572 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4582 = newInstance(Class.forName("kotlin.Pair"));
        Object term4591 = newInstance(Class.forName("kotlin.Pair"));
        Object term4602 = newInstance(Class.forName("kotlin.Pair"));
        Object term4614 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4572, term4572.getClass(), "prevScopeTable", null);
        setField(term4572, term4572.getClass(), "table", null);
        setIntField(term4572, term4572.getClass(), "prevScopeIndex", 320711637);
        setIntField(term4572, term4572.getClass(), "scopeIndex", 1241164745);
        setField(term4572, term4572.getClass(), "recordEntryCoordinates", null);
        setField(term4571, term4571.getClass(), "prevScopeTable", term4572);
        setField(term4571, term4571.getClass(), "table", term4575);
        setIntField(term4571, term4571.getClass(), "prevScopeIndex", 1723148410);
        setIntField(term4571, term4571.getClass(), "scopeIndex", -920797484);
        setField(term4582, term4582.getClass(), "first", null);
        setField(term4582, term4582.getClass(), "second", null);
        setField(term4571, term4571.getClass(), "recordEntryCoordinates", term4582);
        setField(term4570, term4570.getClass(), "prevScopeTable", term4571);
        setField(term4570, term4570.getClass(), "table", term4583);
        setIntField(term4570, term4570.getClass(), "prevScopeIndex", -1631697577);
        setIntField(term4570, term4570.getClass(), "scopeIndex", 765731371);
        setField(term4591, term4591.getClass(), "first", null);
        setField(term4591, term4591.getClass(), "second", null);
        setField(term4570, term4570.getClass(), "recordEntryCoordinates", term4591);
        setField(term4569, term4569.getClass(), "prevScopeTable", term4570);
        setField(term4569, term4569.getClass(), "table", term4592);
        setIntField(term4569, term4569.getClass(), "prevScopeIndex", -1703035419);
        setIntField(term4569, term4569.getClass(), "scopeIndex", 765766290);
        setField(term4602, term4602.getClass(), "first", null);
        setField(term4602, term4602.getClass(), "second", null);
        setField(term4569, term4569.getClass(), "recordEntryCoordinates", term4602);
        setField(term4568, term4568.getClass(), "prevScopeTable", term4569);
        setField(term4568, term4568.getClass(), "table", term4603);
        setIntField(term4568, term4568.getClass(), "prevScopeIndex", -1284825282);
        setIntField(term4568, term4568.getClass(), "scopeIndex", -1941343035);
        setField(term4614, term4614.getClass(), "first", null);
        setField(term4614, term4614.getClass(), "second", null);
        setField(term4568, term4568.getClass(), "recordEntryCoordinates", term4614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4568, args);
    }

};


