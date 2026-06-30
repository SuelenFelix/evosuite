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

public class SymbolTableRecordEntry_setPrevScopeIndex_207474898924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4679;
     Object term4682;

    public SymbolTableRecordEntry_setPrevScopeIndex_207474898924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4679 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        setField(term4679, term4679.getClass(), "prevScopeTable", null);
        setField(term4679, term4679.getClass(), "table", null);
        setIntField(term4679, term4679.getClass(), "prevScopeIndex", 0);
        setIntField(term4679, term4679.getClass(), "scopeIndex", 0);
        setField(term4679, term4679.getClass(), "recordEntryCoordinates", null);
        term4682 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4682;
        callMethod(klass, "setPrevScopeIndex", argTypes, term4679, args);
    }

};


