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

public class SymbolTableRecordEntry_getPrevScopeIndex_6801177014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3857;

    public SymbolTableRecordEntry_getPrevScopeIndex_6801177014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3864 = new HashMap();
        HashMap term3872 = new HashMap();
        HashMap term3881 = new HashMap();
        HashMap term3892 = new HashMap();
        term3857 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3858 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3859 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3860 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3861 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3871 = newInstance(Class.forName("kotlin.Pair"));
        Object term3880 = newInstance(Class.forName("kotlin.Pair"));
        Object term3891 = newInstance(Class.forName("kotlin.Pair"));
        Object term3903 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3861, term3861.getClass(), "prevScopeTable", null);
        setField(term3861, term3861.getClass(), "table", null);
        setIntField(term3861, term3861.getClass(), "prevScopeIndex", 53410913);
        setIntField(term3861, term3861.getClass(), "scopeIndex", -375014958);
        setField(term3861, term3861.getClass(), "recordEntryCoordinates", null);
        setField(term3860, term3860.getClass(), "prevScopeTable", term3861);
        setField(term3860, term3860.getClass(), "table", term3864);
        setIntField(term3860, term3860.getClass(), "prevScopeIndex", 1107176718);
        setIntField(term3860, term3860.getClass(), "scopeIndex", 480137250);
        setField(term3871, term3871.getClass(), "first", null);
        setField(term3871, term3871.getClass(), "second", null);
        setField(term3860, term3860.getClass(), "recordEntryCoordinates", term3871);
        setField(term3859, term3859.getClass(), "prevScopeTable", term3860);
        setField(term3859, term3859.getClass(), "table", term3872);
        setIntField(term3859, term3859.getClass(), "prevScopeIndex", -341152642);
        setIntField(term3859, term3859.getClass(), "scopeIndex", -2015854073);
        setField(term3880, term3880.getClass(), "first", null);
        setField(term3880, term3880.getClass(), "second", null);
        setField(term3859, term3859.getClass(), "recordEntryCoordinates", term3880);
        setField(term3858, term3858.getClass(), "prevScopeTable", term3859);
        setField(term3858, term3858.getClass(), "table", term3881);
        setIntField(term3858, term3858.getClass(), "prevScopeIndex", 538259104);
        setIntField(term3858, term3858.getClass(), "scopeIndex", 96566506);
        setField(term3891, term3891.getClass(), "first", null);
        setField(term3891, term3891.getClass(), "second", null);
        setField(term3858, term3858.getClass(), "recordEntryCoordinates", term3891);
        setField(term3857, term3857.getClass(), "prevScopeTable", term3858);
        setField(term3857, term3857.getClass(), "table", term3892);
        setIntField(term3857, term3857.getClass(), "prevScopeIndex", -343325701);
        setIntField(term3857, term3857.getClass(), "scopeIndex", 107945604);
        setField(term3903, term3903.getClass(), "first", null);
        setField(term3903, term3903.getClass(), "second", null);
        setField(term3857, term3857.getClass(), "recordEntryCoordinates", term3903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrevScopeIndex", argTypes, term3857, args);
    }

};


