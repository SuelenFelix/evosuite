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

public class SymbolTableRecordEntry_getRecordEntryCoordinates_14762781968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4049;

    public SymbolTableRecordEntry_getRecordEntryCoordinates_14762781968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4056 = new HashMap();
        HashMap term4064 = new HashMap();
        HashMap term4073 = new HashMap();
        HashMap term4084 = new HashMap();
        term4049 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4050 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4051 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4052 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4053 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4063 = newInstance(Class.forName("kotlin.Pair"));
        Object term4072 = newInstance(Class.forName("kotlin.Pair"));
        Object term4083 = newInstance(Class.forName("kotlin.Pair"));
        Object term4095 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4053, term4053.getClass(), "prevScopeTable", null);
        setField(term4053, term4053.getClass(), "table", null);
        setIntField(term4053, term4053.getClass(), "prevScopeIndex", -571169753);
        setIntField(term4053, term4053.getClass(), "scopeIndex", 318591690);
        setField(term4053, term4053.getClass(), "recordEntryCoordinates", null);
        setField(term4052, term4052.getClass(), "prevScopeTable", term4053);
        setField(term4052, term4052.getClass(), "table", term4056);
        setIntField(term4052, term4052.getClass(), "prevScopeIndex", -165587447);
        setIntField(term4052, term4052.getClass(), "scopeIndex", -1347358701);
        setField(term4063, term4063.getClass(), "first", null);
        setField(term4063, term4063.getClass(), "second", null);
        setField(term4052, term4052.getClass(), "recordEntryCoordinates", term4063);
        setField(term4051, term4051.getClass(), "prevScopeTable", term4052);
        setField(term4051, term4051.getClass(), "table", term4064);
        setIntField(term4051, term4051.getClass(), "prevScopeIndex", 806595993);
        setIntField(term4051, term4051.getClass(), "scopeIndex", 548228925);
        setField(term4072, term4072.getClass(), "first", null);
        setField(term4072, term4072.getClass(), "second", null);
        setField(term4051, term4051.getClass(), "recordEntryCoordinates", term4072);
        setField(term4050, term4050.getClass(), "prevScopeTable", term4051);
        setField(term4050, term4050.getClass(), "table", term4073);
        setIntField(term4050, term4050.getClass(), "prevScopeIndex", -749861210);
        setIntField(term4050, term4050.getClass(), "scopeIndex", 1694224101);
        setField(term4083, term4083.getClass(), "first", null);
        setField(term4083, term4083.getClass(), "second", null);
        setField(term4050, term4050.getClass(), "recordEntryCoordinates", term4083);
        setField(term4049, term4049.getClass(), "prevScopeTable", term4050);
        setField(term4049, term4049.getClass(), "table", term4084);
        setIntField(term4049, term4049.getClass(), "prevScopeIndex", 937859191);
        setIntField(term4049, term4049.getClass(), "scopeIndex", -916584829);
        setField(term4095, term4095.getClass(), "first", null);
        setField(term4095, term4095.getClass(), "second", null);
        setField(term4049, term4049.getClass(), "recordEntryCoordinates", term4095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecordEntryCoordinates", argTypes, term4049, args);
    }

};


