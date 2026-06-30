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

public class SymbolTableRecordEntry_component1_4607982710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4148;

    public SymbolTableRecordEntry_component1_4607982710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4155 = new HashMap();
        HashMap term4163 = new HashMap();
        HashMap term4172 = new HashMap();
        HashMap term4183 = new HashMap();
        term4148 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4149 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4150 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4151 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4152 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4162 = newInstance(Class.forName("kotlin.Pair"));
        Object term4171 = newInstance(Class.forName("kotlin.Pair"));
        Object term4182 = newInstance(Class.forName("kotlin.Pair"));
        Object term4194 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4152, term4152.getClass(), "prevScopeTable", null);
        setField(term4152, term4152.getClass(), "table", null);
        setIntField(term4152, term4152.getClass(), "prevScopeIndex", 57189932);
        setIntField(term4152, term4152.getClass(), "scopeIndex", 1460722225);
        setField(term4152, term4152.getClass(), "recordEntryCoordinates", null);
        setField(term4151, term4151.getClass(), "prevScopeTable", term4152);
        setField(term4151, term4151.getClass(), "table", term4155);
        setIntField(term4151, term4151.getClass(), "prevScopeIndex", 1743224434);
        setIntField(term4151, term4151.getClass(), "scopeIndex", 842904495);
        setField(term4162, term4162.getClass(), "first", null);
        setField(term4162, term4162.getClass(), "second", null);
        setField(term4151, term4151.getClass(), "recordEntryCoordinates", term4162);
        setField(term4150, term4150.getClass(), "prevScopeTable", term4151);
        setField(term4150, term4150.getClass(), "table", term4163);
        setIntField(term4150, term4150.getClass(), "prevScopeIndex", 1008080511);
        setIntField(term4150, term4150.getClass(), "scopeIndex", 1935707624);
        setField(term4171, term4171.getClass(), "first", null);
        setField(term4171, term4171.getClass(), "second", null);
        setField(term4150, term4150.getClass(), "recordEntryCoordinates", term4171);
        setField(term4149, term4149.getClass(), "prevScopeTable", term4150);
        setField(term4149, term4149.getClass(), "table", term4172);
        setIntField(term4149, term4149.getClass(), "prevScopeIndex", 1507074215);
        setIntField(term4149, term4149.getClass(), "scopeIndex", -282881827);
        setField(term4182, term4182.getClass(), "first", null);
        setField(term4182, term4182.getClass(), "second", null);
        setField(term4149, term4149.getClass(), "recordEntryCoordinates", term4182);
        setField(term4148, term4148.getClass(), "prevScopeTable", term4149);
        setField(term4148, term4148.getClass(), "table", term4183);
        setIntField(term4148, term4148.getClass(), "prevScopeIndex", -1183353915);
        setIntField(term4148, term4148.getClass(), "scopeIndex", -420030135);
        setField(term4194, term4194.getClass(), "first", null);
        setField(term4194, term4194.getClass(), "second", null);
        setField(term4148, term4148.getClass(), "recordEntryCoordinates", term4194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term4148, args);
    }

};


