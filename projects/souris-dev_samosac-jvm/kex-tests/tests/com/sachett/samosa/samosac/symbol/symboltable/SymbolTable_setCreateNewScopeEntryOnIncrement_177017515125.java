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
import java.lang.Boolean;

public class SymbolTable_setCreateNewScopeEntryOnIncrement_177017515125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3563;
     Object term3565;

    public SymbolTable_setCreateNewScopeEntryOnIncrement_177017515125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3563 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term3563, term3563.getClass(), "symbolScope", null);
        setField(term3563, term3563.getClass(), "builtinMethods", null);
        setField(term3563, term3563.getClass(), "blockScopes", null);
        setField(term3563, term3563.getClass(), "currentScopeCoordinates", null);
        setField(term3563, term3563.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term3563, term3563.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term3563, term3563.getClass(), "lastCoordinates", null);
        term3565 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3565;
        callMethod(klass, "setCreateNewScopeEntryOnIncrement", argTypes, term3563, args);
    }

};


