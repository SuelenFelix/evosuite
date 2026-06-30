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
import java.lang.String;
import java.lang.Object;

public class FunctionSymbol_isInitialValueCalculated_12001334376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7546;

    public FunctionSymbol_isInitialValueCalculated_12001334376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7560 = new ArrayList();
        Class<? extends Object> term7625 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7624 = ((Class) term7625).getDeclaredField((String) "BOOL");
        ((Field) term7624).setAccessible(true);
        Object enum12 = ((Field) term7624).get((Object) null);
        Class<? extends Object> term7864 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7863 = ((Class) term7864).getDeclaredField((String) "STRING");
        ((Field) term7863).setAccessible(true);
        Object enum13 = ((Field) term7863).get((Object) null);
        term7546 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term7587 = newInstance(Class.forName("kotlin.Pair"));
        setField(term7546, term7546.getClass(), "name", "WBAOTqErtm");
        setIntField(term7546, term7546.getClass(), "firstAppearedLine", -525570815);
        setField(term7546, term7546.getClass(), "paramList", term7560);
        setField(term7546, term7546.getClass(), "returnType", enum12);
        setBooleanField(term7546, term7546.getClass(), "isInferredType", true);
        setBooleanField(term7546, term7546.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term7546, term7546.getClass(), "initializeExpressionPresent", true);
        setField(term7587, term7587.getClass(), "first", null);
        setField(term7587, term7587.getClass(), "second", null);
        setField(term7546, term7546.getClass(), "symbolCoordinates", term7587);
        setField(term7546, term7546.getClass(), "symbolType", enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInitialValueCalculated", argTypes, term7546, args);
    }

};


