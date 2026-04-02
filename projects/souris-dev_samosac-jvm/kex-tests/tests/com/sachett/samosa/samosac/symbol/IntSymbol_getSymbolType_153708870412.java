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

public class IntSymbol_getSymbolType_153708870412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27546;

    public IntSymbol_getSymbolType_153708870412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27600 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term27599 = ((Class) term27600).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term27599).setAccessible(true);
        Object enum80 = ((Field) term27599).get((Object) null);
        term27546 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term27564 = newInstance(Class.forName("kotlin.Pair"));
        setField(term27546, term27546.getClass(), "name", "OeQLvhVERT");
        setIntField(term27546, term27546.getClass(), "firstAppearedLine", -27944011);
        setBooleanField(term27546, term27546.getClass(), "isInferredType", false);
        setIntField(term27546, term27546.getClass(), "value", -20614472);
        setBooleanField(term27546, term27546.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term27546, term27546.getClass(), "initializeExpressionPresent", true);
        setField(term27564, term27564.getClass(), "first", null);
        setField(term27564, term27564.getClass(), "second", null);
        setField(term27546, term27546.getClass(), "symbolCoordinates", term27564);
        setField(term27546, term27546.getClass(), "symbolType", enum80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolType", argTypes, term27546, args);
    }

};


