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

public class SymbolTableRecordEntry_getPrevScopeTable_17463045461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3669;

    public SymbolTableRecordEntry_getPrevScopeTable_17463045461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3676 = new HashMap();
        HashMap term3684 = new HashMap();
        HashMap term3693 = new HashMap();
        HashMap term3704 = new HashMap();
        term3669 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3670 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3671 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3672 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3673 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3683 = newInstance(Class.forName("kotlin.Pair"));
        Object term3692 = newInstance(Class.forName("kotlin.Pair"));
        Object term3703 = newInstance(Class.forName("kotlin.Pair"));
        Object term3715 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3673, term3673.getClass(), "prevScopeTable", null);
        setField(term3673, term3673.getClass(), "table", null);
        setIntField(term3673, term3673.getClass(), "prevScopeIndex", -817164822);
        setIntField(term3673, term3673.getClass(), "scopeIndex", -1016503459);
        setField(term3673, term3673.getClass(), "recordEntryCoordinates", null);
        setField(term3672, term3672.getClass(), "prevScopeTable", term3673);
        setField(term3672, term3672.getClass(), "table", term3676);
        setIntField(term3672, term3672.getClass(), "prevScopeIndex", -1968847291);
        setIntField(term3672, term3672.getClass(), "scopeIndex", 579005622);
        setField(term3683, term3683.getClass(), "first", null);
        setField(term3683, term3683.getClass(), "second", null);
        setField(term3672, term3672.getClass(), "recordEntryCoordinates", term3683);
        setField(term3671, term3671.getClass(), "prevScopeTable", term3672);
        setField(term3671, term3671.getClass(), "table", term3684);
        setIntField(term3671, term3671.getClass(), "prevScopeIndex", -14890619);
        setIntField(term3671, term3671.getClass(), "scopeIndex", 1632125673);
        setField(term3692, term3692.getClass(), "first", null);
        setField(term3692, term3692.getClass(), "second", null);
        setField(term3671, term3671.getClass(), "recordEntryCoordinates", term3692);
        setField(term3670, term3670.getClass(), "prevScopeTable", term3671);
        setField(term3670, term3670.getClass(), "table", term3693);
        setIntField(term3670, term3670.getClass(), "prevScopeIndex", 454281060);
        setIntField(term3670, term3670.getClass(), "scopeIndex", -1786399638);
        setField(term3703, term3703.getClass(), "first", null);
        setField(term3703, term3703.getClass(), "second", null);
        setField(term3670, term3670.getClass(), "recordEntryCoordinates", term3703);
        setField(term3669, term3669.getClass(), "prevScopeTable", term3670);
        setField(term3669, term3669.getClass(), "table", term3704);
        setIntField(term3669, term3669.getClass(), "prevScopeIndex", 2055867847);
        setIntField(term3669, term3669.getClass(), "scopeIndex", -1048298087);
        setField(term3715, term3715.getClass(), "first", null);
        setField(term3715, term3715.getClass(), "second", null);
        setField(term3669, term3669.getClass(), "recordEntryCoordinates", term3715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrevScopeTable", argTypes, term3669, args);
    }

};


