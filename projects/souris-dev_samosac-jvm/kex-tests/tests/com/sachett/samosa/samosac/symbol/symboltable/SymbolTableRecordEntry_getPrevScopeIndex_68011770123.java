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

public class SymbolTableRecordEntry_getPrevScopeIndex_68011770123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4676;

    public SymbolTableRecordEntry_getPrevScopeIndex_68011770123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4676 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        setField(term4676, term4676.getClass(), "prevScopeTable", null);
        setField(term4676, term4676.getClass(), "table", null);
        setIntField(term4676, term4676.getClass(), "prevScopeIndex", 0);
        setIntField(term4676, term4676.getClass(), "scopeIndex", 0);
        setField(term4676, term4676.getClass(), "recordEntryCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrevScopeIndex", argTypes, term4676, args);
    }

};


