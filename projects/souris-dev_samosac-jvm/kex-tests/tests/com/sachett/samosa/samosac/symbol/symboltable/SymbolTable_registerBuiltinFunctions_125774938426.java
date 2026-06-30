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

public class SymbolTable_registerBuiltinFunctions_125774938426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3567;

    public SymbolTable_registerBuiltinFunctions_125774938426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3567 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term3567, term3567.getClass(), "symbolScope", null);
        setField(term3567, term3567.getClass(), "builtinMethods", null);
        setField(term3567, term3567.getClass(), "blockScopes", null);
        setField(term3567, term3567.getClass(), "currentScopeCoordinates", null);
        setField(term3567, term3567.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term3567, term3567.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term3567, term3567.getClass(), "lastCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "registerBuiltinFunctions", argTypes, term3567, args);
    }

};


