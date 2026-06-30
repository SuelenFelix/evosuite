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

public class SymbolTableRecordEntry_component4_158156936513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4289;

    public SymbolTableRecordEntry_component4_158156936513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4296 = new HashMap();
        HashMap term4304 = new HashMap();
        HashMap term4313 = new HashMap();
        HashMap term4324 = new HashMap();
        term4289 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4290 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4291 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4292 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4293 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4303 = newInstance(Class.forName("kotlin.Pair"));
        Object term4312 = newInstance(Class.forName("kotlin.Pair"));
        Object term4323 = newInstance(Class.forName("kotlin.Pair"));
        Object term4335 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4293, term4293.getClass(), "prevScopeTable", null);
        setField(term4293, term4293.getClass(), "table", null);
        setIntField(term4293, term4293.getClass(), "prevScopeIndex", 76929641);
        setIntField(term4293, term4293.getClass(), "scopeIndex", -2003192918);
        setField(term4293, term4293.getClass(), "recordEntryCoordinates", null);
        setField(term4292, term4292.getClass(), "prevScopeTable", term4293);
        setField(term4292, term4292.getClass(), "table", term4296);
        setIntField(term4292, term4292.getClass(), "prevScopeIndex", -1362856620);
        setIntField(term4292, term4292.getClass(), "scopeIndex", -1835839814);
        setField(term4303, term4303.getClass(), "first", null);
        setField(term4303, term4303.getClass(), "second", null);
        setField(term4292, term4292.getClass(), "recordEntryCoordinates", term4303);
        setField(term4291, term4291.getClass(), "prevScopeTable", term4292);
        setField(term4291, term4291.getClass(), "table", term4304);
        setIntField(term4291, term4291.getClass(), "prevScopeIndex", -1404350380);
        setIntField(term4291, term4291.getClass(), "scopeIndex", -2013924238);
        setField(term4312, term4312.getClass(), "first", null);
        setField(term4312, term4312.getClass(), "second", null);
        setField(term4291, term4291.getClass(), "recordEntryCoordinates", term4312);
        setField(term4290, term4290.getClass(), "prevScopeTable", term4291);
        setField(term4290, term4290.getClass(), "table", term4313);
        setIntField(term4290, term4290.getClass(), "prevScopeIndex", 579006268);
        setIntField(term4290, term4290.getClass(), "scopeIndex", -1694747156);
        setField(term4323, term4323.getClass(), "first", null);
        setField(term4323, term4323.getClass(), "second", null);
        setField(term4290, term4290.getClass(), "recordEntryCoordinates", term4323);
        setField(term4289, term4289.getClass(), "prevScopeTable", term4290);
        setField(term4289, term4289.getClass(), "table", term4324);
        setIntField(term4289, term4289.getClass(), "prevScopeIndex", 1466373988);
        setIntField(term4289, term4289.getClass(), "scopeIndex", -358526505);
        setField(term4335, term4335.getClass(), "first", null);
        setField(term4335, term4335.getClass(), "second", null);
        setField(term4289, term4289.getClass(), "recordEntryCoordinates", term4335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term4289, args);
    }

};


