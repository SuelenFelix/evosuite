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

public class SymbolTableRecordEntry_getScopeIndex_9672367606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3953;

    public SymbolTableRecordEntry_getScopeIndex_9672367606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3960 = new HashMap();
        HashMap term3968 = new HashMap();
        HashMap term3977 = new HashMap();
        HashMap term3988 = new HashMap();
        term3953 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3954 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3955 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3956 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3957 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3967 = newInstance(Class.forName("kotlin.Pair"));
        Object term3976 = newInstance(Class.forName("kotlin.Pair"));
        Object term3987 = newInstance(Class.forName("kotlin.Pair"));
        Object term3999 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3957, term3957.getClass(), "prevScopeTable", null);
        setField(term3957, term3957.getClass(), "table", null);
        setIntField(term3957, term3957.getClass(), "prevScopeIndex", 1384592638);
        setIntField(term3957, term3957.getClass(), "scopeIndex", -1002370457);
        setField(term3957, term3957.getClass(), "recordEntryCoordinates", null);
        setField(term3956, term3956.getClass(), "prevScopeTable", term3957);
        setField(term3956, term3956.getClass(), "table", term3960);
        setIntField(term3956, term3956.getClass(), "prevScopeIndex", -2014576105);
        setIntField(term3956, term3956.getClass(), "scopeIndex", 1296895584);
        setField(term3967, term3967.getClass(), "first", null);
        setField(term3967, term3967.getClass(), "second", null);
        setField(term3956, term3956.getClass(), "recordEntryCoordinates", term3967);
        setField(term3955, term3955.getClass(), "prevScopeTable", term3956);
        setField(term3955, term3955.getClass(), "table", term3968);
        setIntField(term3955, term3955.getClass(), "prevScopeIndex", 628918458);
        setIntField(term3955, term3955.getClass(), "scopeIndex", -1274456137);
        setField(term3976, term3976.getClass(), "first", null);
        setField(term3976, term3976.getClass(), "second", null);
        setField(term3955, term3955.getClass(), "recordEntryCoordinates", term3976);
        setField(term3954, term3954.getClass(), "prevScopeTable", term3955);
        setField(term3954, term3954.getClass(), "table", term3977);
        setIntField(term3954, term3954.getClass(), "prevScopeIndex", 1041916673);
        setIntField(term3954, term3954.getClass(), "scopeIndex", -601863069);
        setField(term3987, term3987.getClass(), "first", null);
        setField(term3987, term3987.getClass(), "second", null);
        setField(term3954, term3954.getClass(), "recordEntryCoordinates", term3987);
        setField(term3953, term3953.getClass(), "prevScopeTable", term3954);
        setField(term3953, term3953.getClass(), "table", term3988);
        setIntField(term3953, term3953.getClass(), "prevScopeIndex", 663292551);
        setIntField(term3953, term3953.getClass(), "scopeIndex", -1885090354);
        setField(term3999, term3999.getClass(), "first", null);
        setField(term3999, term3999.getClass(), "second", null);
        setField(term3953, term3953.getClass(), "recordEntryCoordinates", term3999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScopeIndex", argTypes, term3953, args);
    }

};


