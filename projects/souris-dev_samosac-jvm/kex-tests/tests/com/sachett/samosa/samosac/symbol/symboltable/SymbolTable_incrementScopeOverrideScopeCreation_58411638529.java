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

public class SymbolTable_incrementScopeOverrideScopeCreation_58411638529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3573;
     Object term3575;

    public SymbolTable_incrementScopeOverrideScopeCreation_58411638529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3573 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term3573, term3573.getClass(), "symbolScope", null);
        setField(term3573, term3573.getClass(), "builtinMethods", null);
        setField(term3573, term3573.getClass(), "blockScopes", null);
        setField(term3573, term3573.getClass(), "currentScopeCoordinates", null);
        setField(term3573, term3573.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term3573, term3573.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term3573, term3573.getClass(), "lastCoordinates", null);
        term3575 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3575;
        callMethod(klass, "incrementScopeOverrideScopeCreation", argTypes, term3573, args);
    }

};


