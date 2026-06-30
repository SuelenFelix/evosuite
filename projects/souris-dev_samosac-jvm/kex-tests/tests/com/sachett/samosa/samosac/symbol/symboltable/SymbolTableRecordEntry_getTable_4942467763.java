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

public class SymbolTableRecordEntry_getTable_4942467763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3810;

    public SymbolTableRecordEntry_getTable_4942467763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3817 = new HashMap();
        HashMap term3825 = new HashMap();
        HashMap term3834 = new HashMap();
        HashMap term3845 = new HashMap();
        term3810 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3811 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3812 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3813 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3814 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3824 = newInstance(Class.forName("kotlin.Pair"));
        Object term3833 = newInstance(Class.forName("kotlin.Pair"));
        Object term3844 = newInstance(Class.forName("kotlin.Pair"));
        Object term3856 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3814, term3814.getClass(), "prevScopeTable", null);
        setField(term3814, term3814.getClass(), "table", null);
        setIntField(term3814, term3814.getClass(), "prevScopeIndex", -1210583429);
        setIntField(term3814, term3814.getClass(), "scopeIndex", -663691365);
        setField(term3814, term3814.getClass(), "recordEntryCoordinates", null);
        setField(term3813, term3813.getClass(), "prevScopeTable", term3814);
        setField(term3813, term3813.getClass(), "table", term3817);
        setIntField(term3813, term3813.getClass(), "prevScopeIndex", 339854490);
        setIntField(term3813, term3813.getClass(), "scopeIndex", -615654495);
        setField(term3824, term3824.getClass(), "first", null);
        setField(term3824, term3824.getClass(), "second", null);
        setField(term3813, term3813.getClass(), "recordEntryCoordinates", term3824);
        setField(term3812, term3812.getClass(), "prevScopeTable", term3813);
        setField(term3812, term3812.getClass(), "table", term3825);
        setIntField(term3812, term3812.getClass(), "prevScopeIndex", -1476117762);
        setIntField(term3812, term3812.getClass(), "scopeIndex", -341962980);
        setField(term3833, term3833.getClass(), "first", null);
        setField(term3833, term3833.getClass(), "second", null);
        setField(term3812, term3812.getClass(), "recordEntryCoordinates", term3833);
        setField(term3811, term3811.getClass(), "prevScopeTable", term3812);
        setField(term3811, term3811.getClass(), "table", term3834);
        setIntField(term3811, term3811.getClass(), "prevScopeIndex", 1532716628);
        setIntField(term3811, term3811.getClass(), "scopeIndex", -1801760683);
        setField(term3844, term3844.getClass(), "first", null);
        setField(term3844, term3844.getClass(), "second", null);
        setField(term3811, term3811.getClass(), "recordEntryCoordinates", term3844);
        setField(term3810, term3810.getClass(), "prevScopeTable", term3811);
        setField(term3810, term3810.getClass(), "table", term3845);
        setIntField(term3810, term3810.getClass(), "prevScopeIndex", 1141317871);
        setIntField(term3810, term3810.getClass(), "scopeIndex", 890669485);
        setField(term3856, term3856.getClass(), "first", null);
        setField(term3856, term3856.getClass(), "second", null);
        setField(term3810, term3810.getClass(), "recordEntryCoordinates", term3856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTable", argTypes, term3810, args);
    }

};


