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

public class IntSymbol_setInitializeExpressionPresent_20639775949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26647;
     Object term26690;

    public IntSymbol_setInitializeExpressionPresent_20639775949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26703 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term26702 = ((Class) term26703).getDeclaredField((String) "FUNCTION");
        ((Field) term26702).setAccessible(true);
        Object enum77 = ((Field) term26702).get((Object) null);
        term26647 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term26665 = newInstance(Class.forName("kotlin.Pair"));
        setField(term26647, term26647.getClass(), "name", "NTWMiBEaDF");
        setIntField(term26647, term26647.getClass(), "firstAppearedLine", 1572907769);
        setBooleanField(term26647, term26647.getClass(), "isInferredType", true);
        setIntField(term26647, term26647.getClass(), "value", 1608016787);
        setBooleanField(term26647, term26647.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term26647, term26647.getClass(), "initializeExpressionPresent", true);
        setField(term26665, term26665.getClass(), "first", null);
        setField(term26665, term26665.getClass(), "second", null);
        setField(term26647, term26647.getClass(), "symbolCoordinates", term26665);
        setField(term26647, term26647.getClass(), "symbolType", enum77);
        term26690 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term26690;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term26647, args);
    }

};


