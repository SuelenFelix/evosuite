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

public class SymbolTableRecordEntry_component5_100733480414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4336;

    public SymbolTableRecordEntry_component5_100733480414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4343 = new HashMap();
        HashMap term4351 = new HashMap();
        HashMap term4360 = new HashMap();
        HashMap term4371 = new HashMap();
        term4336 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4337 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4338 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4339 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4340 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4350 = newInstance(Class.forName("kotlin.Pair"));
        Object term4359 = newInstance(Class.forName("kotlin.Pair"));
        Object term4370 = newInstance(Class.forName("kotlin.Pair"));
        Object term4382 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4340, term4340.getClass(), "prevScopeTable", null);
        setField(term4340, term4340.getClass(), "table", null);
        setIntField(term4340, term4340.getClass(), "prevScopeIndex", 1295839803);
        setIntField(term4340, term4340.getClass(), "scopeIndex", -1891015523);
        setField(term4340, term4340.getClass(), "recordEntryCoordinates", null);
        setField(term4339, term4339.getClass(), "prevScopeTable", term4340);
        setField(term4339, term4339.getClass(), "table", term4343);
        setIntField(term4339, term4339.getClass(), "prevScopeIndex", -1560631747);
        setIntField(term4339, term4339.getClass(), "scopeIndex", 1215150180);
        setField(term4350, term4350.getClass(), "first", null);
        setField(term4350, term4350.getClass(), "second", null);
        setField(term4339, term4339.getClass(), "recordEntryCoordinates", term4350);
        setField(term4338, term4338.getClass(), "prevScopeTable", term4339);
        setField(term4338, term4338.getClass(), "table", term4351);
        setIntField(term4338, term4338.getClass(), "prevScopeIndex", -1422859977);
        setIntField(term4338, term4338.getClass(), "scopeIndex", -1972436591);
        setField(term4359, term4359.getClass(), "first", null);
        setField(term4359, term4359.getClass(), "second", null);
        setField(term4338, term4338.getClass(), "recordEntryCoordinates", term4359);
        setField(term4337, term4337.getClass(), "prevScopeTable", term4338);
        setField(term4337, term4337.getClass(), "table", term4360);
        setIntField(term4337, term4337.getClass(), "prevScopeIndex", 68922753);
        setIntField(term4337, term4337.getClass(), "scopeIndex", -220791533);
        setField(term4370, term4370.getClass(), "first", null);
        setField(term4370, term4370.getClass(), "second", null);
        setField(term4337, term4337.getClass(), "recordEntryCoordinates", term4370);
        setField(term4336, term4336.getClass(), "prevScopeTable", term4337);
        setField(term4336, term4336.getClass(), "table", term4371);
        setIntField(term4336, term4336.getClass(), "prevScopeIndex", 1741500243);
        setIntField(term4336, term4336.getClass(), "scopeIndex", -2070466617);
        setField(term4382, term4382.getClass(), "first", null);
        setField(term4382, term4382.getClass(), "second", null);
        setField(term4336, term4336.getClass(), "recordEntryCoordinates", term4382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component5", argTypes, term4336, args);
    }

};


