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

public class SymbolTableRecordEntry_equals_43112927818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4615;
     Object term4662;

    public SymbolTableRecordEntry_equals_43112927818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4622 = new HashMap();
        HashMap term4630 = new HashMap();
        HashMap term4639 = new HashMap();
        HashMap term4650 = new HashMap();
        term4615 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4616 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4617 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4618 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4619 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4629 = newInstance(Class.forName("kotlin.Pair"));
        Object term4638 = newInstance(Class.forName("kotlin.Pair"));
        Object term4649 = newInstance(Class.forName("kotlin.Pair"));
        Object term4661 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4619, term4619.getClass(), "prevScopeTable", null);
        setField(term4619, term4619.getClass(), "table", null);
        setIntField(term4619, term4619.getClass(), "prevScopeIndex", 888506903);
        setIntField(term4619, term4619.getClass(), "scopeIndex", 200252898);
        setField(term4619, term4619.getClass(), "recordEntryCoordinates", null);
        setField(term4618, term4618.getClass(), "prevScopeTable", term4619);
        setField(term4618, term4618.getClass(), "table", term4622);
        setIntField(term4618, term4618.getClass(), "prevScopeIndex", -1831826725);
        setIntField(term4618, term4618.getClass(), "scopeIndex", 752152965);
        setField(term4629, term4629.getClass(), "first", null);
        setField(term4629, term4629.getClass(), "second", null);
        setField(term4618, term4618.getClass(), "recordEntryCoordinates", term4629);
        setField(term4617, term4617.getClass(), "prevScopeTable", term4618);
        setField(term4617, term4617.getClass(), "table", term4630);
        setIntField(term4617, term4617.getClass(), "prevScopeIndex", -1577069773);
        setIntField(term4617, term4617.getClass(), "scopeIndex", -266625190);
        setField(term4638, term4638.getClass(), "first", null);
        setField(term4638, term4638.getClass(), "second", null);
        setField(term4617, term4617.getClass(), "recordEntryCoordinates", term4638);
        setField(term4616, term4616.getClass(), "prevScopeTable", term4617);
        setField(term4616, term4616.getClass(), "table", term4639);
        setIntField(term4616, term4616.getClass(), "prevScopeIndex", 489201218);
        setIntField(term4616, term4616.getClass(), "scopeIndex", 464181937);
        setField(term4649, term4649.getClass(), "first", null);
        setField(term4649, term4649.getClass(), "second", null);
        setField(term4616, term4616.getClass(), "recordEntryCoordinates", term4649);
        setField(term4615, term4615.getClass(), "prevScopeTable", term4616);
        setField(term4615, term4615.getClass(), "table", term4650);
        setIntField(term4615, term4615.getClass(), "prevScopeIndex", -1455526612);
        setIntField(term4615, term4615.getClass(), "scopeIndex", -941356098);
        setField(term4661, term4661.getClass(), "first", null);
        setField(term4661, term4661.getClass(), "second", null);
        setField(term4615, term4615.getClass(), "recordEntryCoordinates", term4661);
        term4662 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4662;
        callMethod(klass, "equals", argTypes, term4615, args);
    }

};


