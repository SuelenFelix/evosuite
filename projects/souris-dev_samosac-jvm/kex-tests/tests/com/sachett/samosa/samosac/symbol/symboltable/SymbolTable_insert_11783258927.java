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

public class SymbolTable_insert_11783258927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3569;

    public SymbolTable_insert_11783258927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3569 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term3569, term3569.getClass(), "symbolScope", null);
        setField(term3569, term3569.getClass(), "builtinMethods", null);
        setField(term3569, term3569.getClass(), "blockScopes", null);
        setField(term3569, term3569.getClass(), "currentScopeCoordinates", null);
        setField(term3569, term3569.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term3569, term3569.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term3569, term3569.getClass(), "lastCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.sachett.samosa.samosac.symbol.ISymbol");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "insert", argTypes, term3569, args);
    }

};


