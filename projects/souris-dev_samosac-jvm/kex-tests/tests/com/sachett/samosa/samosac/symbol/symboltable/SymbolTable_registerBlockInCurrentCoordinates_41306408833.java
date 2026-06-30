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

public class SymbolTable_registerBlockInCurrentCoordinates_41306408833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3585;

    public SymbolTable_registerBlockInCurrentCoordinates_41306408833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3585 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term3585, term3585.getClass(), "symbolScope", null);
        setField(term3585, term3585.getClass(), "builtinMethods", null);
        setField(term3585, term3585.getClass(), "blockScopes", null);
        setField(term3585, term3585.getClass(), "currentScopeCoordinates", null);
        setField(term3585, term3585.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term3585, term3585.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term3585, term3585.getClass(), "lastCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "registerBlockInCurrentCoordinates", argTypes, term3585, args);
    }

};


