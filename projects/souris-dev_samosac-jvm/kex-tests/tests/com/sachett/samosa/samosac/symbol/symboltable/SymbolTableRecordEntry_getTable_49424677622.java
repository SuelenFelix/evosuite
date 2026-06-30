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

public class SymbolTableRecordEntry_getTable_49424677622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4673;

    public SymbolTableRecordEntry_getTable_49424677622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4673 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        setField(term4673, term4673.getClass(), "prevScopeTable", null);
        setField(term4673, term4673.getClass(), "table", null);
        setIntField(term4673, term4673.getClass(), "prevScopeIndex", 0);
        setIntField(term4673, term4673.getClass(), "scopeIndex", 0);
        setField(term4673, term4673.getClass(), "recordEntryCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTable", argTypes, term4673, args);
    }

};


