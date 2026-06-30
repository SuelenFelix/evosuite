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

public class SymbolTable_registerBuiltinFun_1704212115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1649;

    public SymbolTable_registerBuiltinFun_1704212115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1649 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        setField(term1649, term1649.getClass(), "symbolScope", null);
        setField(term1649, term1649.getClass(), "builtinMethods", null);
        setField(term1649, term1649.getClass(), "blockScopes", null);
        setField(term1649, term1649.getClass(), "currentScopeCoordinates", null);
        setField(term1649, term1649.getClass(), "currentSymbolTableRecord", null);
        setBooleanField(term1649, term1649.getClass(), "createNewScopeEntryOnIncrement", false);
        setField(term1649, term1649.getClass(), "lastCoordinates", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "registerBuiltinFun", argTypes, term1649, args);
    }

};


