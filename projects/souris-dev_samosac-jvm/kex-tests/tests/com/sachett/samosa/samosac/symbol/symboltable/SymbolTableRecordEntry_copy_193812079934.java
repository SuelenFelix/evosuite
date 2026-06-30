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
import java.lang.Integer;

public class SymbolTableRecordEntry_copy_193812079934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713;
     Object term4716;
     Object term4718;

    public SymbolTableRecordEntry_copy_193812079934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        setField(term4713, term4713.getClass(), "prevScopeTable", null);
        setField(term4713, term4713.getClass(), "table", null);
        setIntField(term4713, term4713.getClass(), "prevScopeIndex", 0);
        setIntField(term4713, term4713.getClass(), "scopeIndex", 0);
        setField(term4713, term4713.getClass(), "recordEntryCoordinates", null);
        term4716 = new Integer(0);
        term4718 = new Integer(0);
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
        args[0] = null;
        args[1] = null;
        args[2] = term4716;
        args[3] = term4718;
        args[4] = null;
        callMethod(klass, "copy", argTypes, term4713, args);
    }

};


