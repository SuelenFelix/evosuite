package com.sachett.samosa.samosac.symbol;

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
import static com.sachett.samosa.samosac.symbol.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class FunctionSymbol_isSymbolType_150807893113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10905;
     Object enum26;

    public FunctionSymbol_isSymbolType_150807893113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10919 = new ArrayList();
        ((ArrayList) term10919).add((Object)null);
        ((ArrayList) term10919).add((Object)null);
        ((ArrayList) term10919).add((Object)null);
        Class<? extends Object> term11002 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term11001 = ((Class) term11002).getDeclaredField((String) "FUNCTION");
        ((Field) term11001).setAccessible(true);
        Object enum24 = ((Field) term11001).get((Object) null);
        Class<? extends Object> term11253 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term11252 = ((Class) term11253).getDeclaredField((String) "VOID");
        ((Field) term11252).setAccessible(true);
        Object enum25 = ((Field) term11252).get((Object) null);
        term10905 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term10950 = newInstance(Class.forName("kotlin.Pair"));
        setField(term10905, term10905.getClass(), "name", "SIODFGaQhr");
        setIntField(term10905, term10905.getClass(), "firstAppearedLine", -1867239125);
        setField(term10905, term10905.getClass(), "paramList", term10919);
        setField(term10905, term10905.getClass(), "returnType", enum24);
        setBooleanField(term10905, term10905.getClass(), "isInferredType", false);
        setBooleanField(term10905, term10905.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term10905, term10905.getClass(), "initializeExpressionPresent", false);
        setField(term10950, term10950.getClass(), "first", null);
        setField(term10950, term10950.getClass(), "second", null);
        setField(term10905, term10905.getClass(), "symbolCoordinates", term10950);
        setField(term10905, term10905.getClass(), "symbolType", enum25);
        Class<? extends Object> term11492 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term11491 = ((Class) term11492).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term11491).setAccessible(true);
        enum26 = ((Field) term11491).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        Object[] args = new Object[1];
        args[0] = enum26;
        callMethod(klass, "isSymbolType", argTypes, term10905, args);
    }

};


