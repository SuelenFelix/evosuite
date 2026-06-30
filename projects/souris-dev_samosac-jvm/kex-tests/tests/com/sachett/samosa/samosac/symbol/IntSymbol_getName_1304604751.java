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

public class IntSymbol_getName_1304604751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24297;

    public IntSymbol_getName_1304604751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24351 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term24350 = ((Class) term24351).getDeclaredField((String) "FUNCTION");
        ((Field) term24350).setAccessible(true);
        Object enum69 = ((Field) term24350).get((Object) null);
        term24297 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term24315 = newInstance(Class.forName("kotlin.Pair"));
        setField(term24297, term24297.getClass(), "name", "vLerpqavFM");
        setIntField(term24297, term24297.getClass(), "firstAppearedLine", 723812297);
        setBooleanField(term24297, term24297.getClass(), "isInferredType", false);
        setIntField(term24297, term24297.getClass(), "value", 1639448749);
        setBooleanField(term24297, term24297.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term24297, term24297.getClass(), "initializeExpressionPresent", false);
        setField(term24315, term24315.getClass(), "first", null);
        setField(term24315, term24315.getClass(), "second", null);
        setField(term24297, term24297.getClass(), "symbolCoordinates", term24315);
        setField(term24297, term24297.getClass(), "symbolType", enum69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term24297, args);
    }

};


