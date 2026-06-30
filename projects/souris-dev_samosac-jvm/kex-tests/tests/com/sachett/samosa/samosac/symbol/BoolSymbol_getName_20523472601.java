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

public class BoolSymbol_getName_20523472601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19813;

    public BoolSymbol_getName_20523472601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19867 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term19866 = ((Class) term19867).getDeclaredField((String) "FUNCTION");
        ((Field) term19866).setAccessible(true);
        Object enum54 = ((Field) term19866).get((Object) null);
        term19813 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term19831 = newInstance(Class.forName("kotlin.Pair"));
        setField(term19813, term19813.getClass(), "name", "tsTGdgQYUL");
        setIntField(term19813, term19813.getClass(), "firstAppearedLine", -1488938905);
        setBooleanField(term19813, term19813.getClass(), "isInferredType", false);
        setBooleanField(term19813, term19813.getClass(), "value", false);
        setBooleanField(term19813, term19813.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term19813, term19813.getClass(), "initializeExpressionPresent", false);
        setField(term19831, term19831.getClass(), "first", null);
        setField(term19831, term19831.getClass(), "second", null);
        setField(term19813, term19813.getClass(), "symbolCoordinates", term19831);
        setField(term19813, term19813.getClass(), "symbolType", enum54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term19813, args);
    }

};


