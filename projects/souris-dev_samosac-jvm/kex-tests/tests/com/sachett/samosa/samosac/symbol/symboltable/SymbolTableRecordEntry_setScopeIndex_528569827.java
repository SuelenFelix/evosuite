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

public class SymbolTableRecordEntry_setScopeIndex_528569827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4000;
     Object term4047;

    public SymbolTableRecordEntry_setScopeIndex_528569827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4007 = new HashMap();
        HashMap term4015 = new HashMap();
        HashMap term4024 = new HashMap();
        HashMap term4035 = new HashMap();
        term4000 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4001 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4002 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4003 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4004 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4014 = newInstance(Class.forName("kotlin.Pair"));
        Object term4023 = newInstance(Class.forName("kotlin.Pair"));
        Object term4034 = newInstance(Class.forName("kotlin.Pair"));
        Object term4046 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4004, term4004.getClass(), "prevScopeTable", null);
        setField(term4004, term4004.getClass(), "table", null);
        setIntField(term4004, term4004.getClass(), "prevScopeIndex", -1970452551);
        setIntField(term4004, term4004.getClass(), "scopeIndex", -1896376975);
        setField(term4004, term4004.getClass(), "recordEntryCoordinates", null);
        setField(term4003, term4003.getClass(), "prevScopeTable", term4004);
        setField(term4003, term4003.getClass(), "table", term4007);
        setIntField(term4003, term4003.getClass(), "prevScopeIndex", 729658803);
        setIntField(term4003, term4003.getClass(), "scopeIndex", 114754804);
        setField(term4014, term4014.getClass(), "first", null);
        setField(term4014, term4014.getClass(), "second", null);
        setField(term4003, term4003.getClass(), "recordEntryCoordinates", term4014);
        setField(term4002, term4002.getClass(), "prevScopeTable", term4003);
        setField(term4002, term4002.getClass(), "table", term4015);
        setIntField(term4002, term4002.getClass(), "prevScopeIndex", 1687361082);
        setIntField(term4002, term4002.getClass(), "scopeIndex", 584893196);
        setField(term4023, term4023.getClass(), "first", null);
        setField(term4023, term4023.getClass(), "second", null);
        setField(term4002, term4002.getClass(), "recordEntryCoordinates", term4023);
        setField(term4001, term4001.getClass(), "prevScopeTable", term4002);
        setField(term4001, term4001.getClass(), "table", term4024);
        setIntField(term4001, term4001.getClass(), "prevScopeIndex", 497269071);
        setIntField(term4001, term4001.getClass(), "scopeIndex", -1899301124);
        setField(term4034, term4034.getClass(), "first", null);
        setField(term4034, term4034.getClass(), "second", null);
        setField(term4001, term4001.getClass(), "recordEntryCoordinates", term4034);
        setField(term4000, term4000.getClass(), "prevScopeTable", term4001);
        setField(term4000, term4000.getClass(), "table", term4035);
        setIntField(term4000, term4000.getClass(), "prevScopeIndex", -1882480155);
        setIntField(term4000, term4000.getClass(), "scopeIndex", -1410220680);
        setField(term4046, term4046.getClass(), "first", null);
        setField(term4046, term4046.getClass(), "second", null);
        setField(term4000, term4000.getClass(), "recordEntryCoordinates", term4046);
        term4047 = new Integer(389427431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4047;
        callMethod(klass, "setScopeIndex", argTypes, term4000, args);
    }

};


