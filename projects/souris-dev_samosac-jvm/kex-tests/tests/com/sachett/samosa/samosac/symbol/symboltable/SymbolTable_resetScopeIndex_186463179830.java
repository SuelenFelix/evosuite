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

public class SymbolTable_resetScopeIndex_186463179830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3577;

    public SymbolTable_resetScopeIndex_186463179830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3577 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term3577, term3577.getClass(), "symbolScope", null);
        setField(term3577, term3577.getClass(), "builtinMethods", null);
        setField(term3577, term3577.getClass(), "blockScopes", null);
        setField(term3577, term3577.getClass(), "currentScopeCoordinates", null);
        setField(term3577, term3577.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term3577, term3577.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term3577, term3577.getClass(), "lastCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetScopeIndex", argTypes, term3577, args);
    }

};


