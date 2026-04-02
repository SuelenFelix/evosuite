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
import java.util.LinkedHashMap;
import java.lang.Integer;

public class SymbolTableRecordEntry_init_8115470450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3607;
     Object term3654;
     Object term3660;
     Object term3662;
     Object term3664;

    public SymbolTableRecordEntry_init_8115470450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3614 = new HashMap();
        HashMap term3622 = new HashMap();
        HashMap term3631 = new HashMap();
        HashMap term3642 = new HashMap();
        term3607 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3608 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3609 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3610 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3611 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3621 = newInstance(Class.forName("kotlin.Pair"));
        Object term3630 = newInstance(Class.forName("kotlin.Pair"));
        Object term3641 = newInstance(Class.forName("kotlin.Pair"));
        Object term3653 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3611, term3611.getClass(), "prevScopeTable", null);
        setField(term3611, term3611.getClass(), "table", null);
        setIntField(term3611, term3611.getClass(), "prevScopeIndex", -117576464);
        setIntField(term3611, term3611.getClass(), "scopeIndex", -1007160944);
        setField(term3611, term3611.getClass(), "recordEntryCoordinates", null);
        setField(term3610, term3610.getClass(), "prevScopeTable", term3611);
        setField(term3610, term3610.getClass(), "table", term3614);
        setIntField(term3610, term3610.getClass(), "prevScopeIndex", 1135664017);
        setIntField(term3610, term3610.getClass(), "scopeIndex", 590364439);
        setField(term3621, term3621.getClass(), "first", null);
        setField(term3621, term3621.getClass(), "second", null);
        setField(term3610, term3610.getClass(), "recordEntryCoordinates", term3621);
        setField(term3609, term3609.getClass(), "prevScopeTable", term3610);
        setField(term3609, term3609.getClass(), "table", term3622);
        setIntField(term3609, term3609.getClass(), "prevScopeIndex", 865208305);
        setIntField(term3609, term3609.getClass(), "scopeIndex", -1275173084);
        setField(term3630, term3630.getClass(), "first", null);
        setField(term3630, term3630.getClass(), "second", null);
        setField(term3609, term3609.getClass(), "recordEntryCoordinates", term3630);
        setField(term3608, term3608.getClass(), "prevScopeTable", term3609);
        setField(term3608, term3608.getClass(), "table", term3631);
        setIntField(term3608, term3608.getClass(), "prevScopeIndex", -244121226);
        setIntField(term3608, term3608.getClass(), "scopeIndex", -203030934);
        setField(term3641, term3641.getClass(), "first", null);
        setField(term3641, term3641.getClass(), "second", null);
        setField(term3608, term3608.getClass(), "recordEntryCoordinates", term3641);
        setField(term3607, term3607.getClass(), "prevScopeTable", term3608);
        setField(term3607, term3607.getClass(), "table", term3642);
        setIntField(term3607, term3607.getClass(), "prevScopeIndex", -1179120542);
        setIntField(term3607, term3607.getClass(), "scopeIndex", -73683645);
        setField(term3653, term3653.getClass(), "first", null);
        setField(term3653, term3653.getClass(), "second", null);
        setField(term3607, term3607.getClass(), "recordEntryCoordinates", term3653);
        term3654 = new LinkedHashMap();
        term3660 = new Integer(-226514366);
        term3662 = new Integer(1193880199);
        Integer term3665 = new Integer(1227103734);
        Integer term3667 = new Integer(-1339778481);
        term3664 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3664, term3664.getClass(), "first", term3665);
        setField(term3664, term3664.getClass(), "second", term3667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("kotlin.Pair");
        Object[] args = new Object[5];
        args[0] = term3607;
        args[1] = term3654;
        args[2] = term3660;
        args[3] = term3662;
        args[4] = term3664;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


