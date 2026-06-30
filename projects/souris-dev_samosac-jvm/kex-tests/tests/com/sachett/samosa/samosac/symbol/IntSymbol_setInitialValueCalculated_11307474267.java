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
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class IntSymbol_setInitialValueCalculated_11307474267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26037;
     Object term26080;

    public IntSymbol_setInitialValueCalculated_11307474267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26093 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term26092 = ((Class) term26093).getDeclaredField((String) "FUNCTION");
        ((Field) term26092).setAccessible(true);
        Object enum75 = ((Field) term26092).get((Object) null);
        term26037 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term26055 = newInstance(Class.forName("kotlin.Pair"));
        setField(term26037, term26037.getClass(), "name", "QSrDQfEsTR");
        setIntField(term26037, term26037.getClass(), "firstAppearedLine", 21031843);
        setBooleanField(term26037, term26037.getClass(), "isInferredType", false);
        setIntField(term26037, term26037.getClass(), "value", -380787857);
        setBooleanField(term26037, term26037.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term26037, term26037.getClass(), "initializeExpressionPresent", true);
        setField(term26055, term26055.getClass(), "first", null);
        setField(term26055, term26055.getClass(), "second", null);
        setField(term26037, term26037.getClass(), "symbolCoordinates", term26055);
        setField(term26037, term26037.getClass(), "symbolType", enum75);
        term26080 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26080;
        callMethod(klass, "setInitialValueCalculated", argTypes, term26037, args);
    }

};


