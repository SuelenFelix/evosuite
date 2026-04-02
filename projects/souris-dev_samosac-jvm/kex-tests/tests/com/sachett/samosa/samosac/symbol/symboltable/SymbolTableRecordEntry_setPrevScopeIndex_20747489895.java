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
import java.lang.Integer;

public class SymbolTableRecordEntry_setPrevScopeIndex_20747489895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3904;
     Object term3951;

    public SymbolTableRecordEntry_setPrevScopeIndex_20747489895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3911 = new HashMap();
        HashMap term3919 = new HashMap();
        HashMap term3928 = new HashMap();
        HashMap term3939 = new HashMap();
        term3904 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3905 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3906 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3907 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3908 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3918 = newInstance(Class.forName("kotlin.Pair"));
        Object term3927 = newInstance(Class.forName("kotlin.Pair"));
        Object term3938 = newInstance(Class.forName("kotlin.Pair"));
        Object term3950 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3908, term3908.getClass(), "prevScopeTable", null);
        setField(term3908, term3908.getClass(), "table", null);
        setIntField(term3908, term3908.getClass(), "prevScopeIndex", -25637976);
        setIntField(term3908, term3908.getClass(), "scopeIndex", 1555897383);
        setField(term3908, term3908.getClass(), "recordEntryCoordinates", null);
        setField(term3907, term3907.getClass(), "prevScopeTable", term3908);
        setField(term3907, term3907.getClass(), "table", term3911);
        setIntField(term3907, term3907.getClass(), "prevScopeIndex", 202001407);
        setIntField(term3907, term3907.getClass(), "scopeIndex", 158873461);
        setField(term3918, term3918.getClass(), "first", null);
        setField(term3918, term3918.getClass(), "second", null);
        setField(term3907, term3907.getClass(), "recordEntryCoordinates", term3918);
        setField(term3906, term3906.getClass(), "prevScopeTable", term3907);
        setField(term3906, term3906.getClass(), "table", term3919);
        setIntField(term3906, term3906.getClass(), "prevScopeIndex", -430151637);
        setIntField(term3906, term3906.getClass(), "scopeIndex", -1697741339);
        setField(term3927, term3927.getClass(), "first", null);
        setField(term3927, term3927.getClass(), "second", null);
        setField(term3906, term3906.getClass(), "recordEntryCoordinates", term3927);
        setField(term3905, term3905.getClass(), "prevScopeTable", term3906);
        setField(term3905, term3905.getClass(), "table", term3928);
        setIntField(term3905, term3905.getClass(), "prevScopeIndex", 98922530);
        setIntField(term3905, term3905.getClass(), "scopeIndex", -1388471422);
        setField(term3938, term3938.getClass(), "first", null);
        setField(term3938, term3938.getClass(), "second", null);
        setField(term3905, term3905.getClass(), "recordEntryCoordinates", term3938);
        setField(term3904, term3904.getClass(), "prevScopeTable", term3905);
        setField(term3904, term3904.getClass(), "table", term3939);
        setIntField(term3904, term3904.getClass(), "prevScopeIndex", -1498296052);
        setIntField(term3904, term3904.getClass(), "scopeIndex", 2098647989);
        setField(term3950, term3950.getClass(), "first", null);
        setField(term3950, term3950.getClass(), "second", null);
        setField(term3904, term3904.getClass(), "recordEntryCoordinates", term3950);
        term3951 = new Integer(1598895173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3951;
        callMethod(klass, "setPrevScopeIndex", argTypes, term3904, args);
    }

};


