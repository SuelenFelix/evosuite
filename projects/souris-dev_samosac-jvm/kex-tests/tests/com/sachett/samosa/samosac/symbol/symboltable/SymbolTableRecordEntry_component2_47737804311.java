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

public class SymbolTableRecordEntry_component2_47737804311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4195;

    public SymbolTableRecordEntry_component2_47737804311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4202 = new HashMap();
        HashMap term4210 = new HashMap();
        HashMap term4219 = new HashMap();
        HashMap term4230 = new HashMap();
        term4195 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4196 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4197 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4198 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4199 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4209 = newInstance(Class.forName("kotlin.Pair"));
        Object term4218 = newInstance(Class.forName("kotlin.Pair"));
        Object term4229 = newInstance(Class.forName("kotlin.Pair"));
        Object term4241 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4199, term4199.getClass(), "prevScopeTable", null);
        setField(term4199, term4199.getClass(), "table", null);
        setIntField(term4199, term4199.getClass(), "prevScopeIndex", 515182546);
        setIntField(term4199, term4199.getClass(), "scopeIndex", -936895502);
        setField(term4199, term4199.getClass(), "recordEntryCoordinates", null);
        setField(term4198, term4198.getClass(), "prevScopeTable", term4199);
        setField(term4198, term4198.getClass(), "table", term4202);
        setIntField(term4198, term4198.getClass(), "prevScopeIndex", -129547140);
        setIntField(term4198, term4198.getClass(), "scopeIndex", 199287428);
        setField(term4209, term4209.getClass(), "first", null);
        setField(term4209, term4209.getClass(), "second", null);
        setField(term4198, term4198.getClass(), "recordEntryCoordinates", term4209);
        setField(term4197, term4197.getClass(), "prevScopeTable", term4198);
        setField(term4197, term4197.getClass(), "table", term4210);
        setIntField(term4197, term4197.getClass(), "prevScopeIndex", -1195339592);
        setIntField(term4197, term4197.getClass(), "scopeIndex", -376422566);
        setField(term4218, term4218.getClass(), "first", null);
        setField(term4218, term4218.getClass(), "second", null);
        setField(term4197, term4197.getClass(), "recordEntryCoordinates", term4218);
        setField(term4196, term4196.getClass(), "prevScopeTable", term4197);
        setField(term4196, term4196.getClass(), "table", term4219);
        setIntField(term4196, term4196.getClass(), "prevScopeIndex", 306847454);
        setIntField(term4196, term4196.getClass(), "scopeIndex", 1745276158);
        setField(term4229, term4229.getClass(), "first", null);
        setField(term4229, term4229.getClass(), "second", null);
        setField(term4196, term4196.getClass(), "recordEntryCoordinates", term4229);
        setField(term4195, term4195.getClass(), "prevScopeTable", term4196);
        setField(term4195, term4195.getClass(), "table", term4230);
        setIntField(term4195, term4195.getClass(), "prevScopeIndex", 2009020256);
        setIntField(term4195, term4195.getClass(), "scopeIndex", 2049577015);
        setField(term4241, term4241.getClass(), "first", null);
        setField(term4241, term4241.getClass(), "second", null);
        setField(term4195, term4195.getClass(), "recordEntryCoordinates", term4241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term4195, args);
    }

};


