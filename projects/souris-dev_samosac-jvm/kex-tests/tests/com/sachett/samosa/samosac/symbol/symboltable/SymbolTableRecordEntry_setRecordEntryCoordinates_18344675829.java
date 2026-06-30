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

public class SymbolTableRecordEntry_setRecordEntryCoordinates_18344675829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;
     Object term4143;

    public SymbolTableRecordEntry_setRecordEntryCoordinates_18344675829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4103 = new HashMap();
        HashMap term4111 = new HashMap();
        HashMap term4120 = new HashMap();
        HashMap term4131 = new HashMap();
        term4096 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4097 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4098 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4099 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4100 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4110 = newInstance(Class.forName("kotlin.Pair"));
        Object term4119 = newInstance(Class.forName("kotlin.Pair"));
        Object term4130 = newInstance(Class.forName("kotlin.Pair"));
        Object term4142 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4100, term4100.getClass(), "prevScopeTable", null);
        setField(term4100, term4100.getClass(), "table", null);
        setIntField(term4100, term4100.getClass(), "prevScopeIndex", 1684998508);
        setIntField(term4100, term4100.getClass(), "scopeIndex", -1476644457);
        setField(term4100, term4100.getClass(), "recordEntryCoordinates", null);
        setField(term4099, term4099.getClass(), "prevScopeTable", term4100);
        setField(term4099, term4099.getClass(), "table", term4103);
        setIntField(term4099, term4099.getClass(), "prevScopeIndex", 1270666529);
        setIntField(term4099, term4099.getClass(), "scopeIndex", -1146679443);
        setField(term4110, term4110.getClass(), "first", null);
        setField(term4110, term4110.getClass(), "second", null);
        setField(term4099, term4099.getClass(), "recordEntryCoordinates", term4110);
        setField(term4098, term4098.getClass(), "prevScopeTable", term4099);
        setField(term4098, term4098.getClass(), "table", term4111);
        setIntField(term4098, term4098.getClass(), "prevScopeIndex", -860131894);
        setIntField(term4098, term4098.getClass(), "scopeIndex", -1022990421);
        setField(term4119, term4119.getClass(), "first", null);
        setField(term4119, term4119.getClass(), "second", null);
        setField(term4098, term4098.getClass(), "recordEntryCoordinates", term4119);
        setField(term4097, term4097.getClass(), "prevScopeTable", term4098);
        setField(term4097, term4097.getClass(), "table", term4120);
        setIntField(term4097, term4097.getClass(), "prevScopeIndex", 1045547089);
        setIntField(term4097, term4097.getClass(), "scopeIndex", -1122880881);
        setField(term4130, term4130.getClass(), "first", null);
        setField(term4130, term4130.getClass(), "second", null);
        setField(term4097, term4097.getClass(), "recordEntryCoordinates", term4130);
        setField(term4096, term4096.getClass(), "prevScopeTable", term4097);
        setField(term4096, term4096.getClass(), "table", term4131);
        setIntField(term4096, term4096.getClass(), "prevScopeIndex", -542712742);
        setIntField(term4096, term4096.getClass(), "scopeIndex", -1254072822);
        setField(term4142, term4142.getClass(), "first", null);
        setField(term4142, term4142.getClass(), "second", null);
        setField(term4096, term4096.getClass(), "recordEntryCoordinates", term4142);
        Integer term4144 = new Integer(1725571209);
        Integer term4146 = new Integer(-522618178);
        term4143 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4143, term4143.getClass(), "first", term4144);
        setField(term4143, term4143.getClass(), "second", term4146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term4143;
        callMethod(klass, "setRecordEntryCoordinates", argTypes, term4096, args);
    }

};


