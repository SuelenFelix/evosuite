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

public class IntSymbol_getSymbolCoordinates_204336650810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26953;

    public IntSymbol_getSymbolCoordinates_204336650810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27003 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term27002 = ((Class) term27003).getDeclaredField((String) "BOOL");
        ((Field) term27002).setAccessible(true);
        Object enum78 = ((Field) term27002).get((Object) null);
        term26953 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term26971 = newInstance(Class.forName("kotlin.Pair"));
        setField(term26953, term26953.getClass(), "name", "SPBstwKFVr");
        setIntField(term26953, term26953.getClass(), "firstAppearedLine", -516303035);
        setBooleanField(term26953, term26953.getClass(), "isInferredType", true);
        setIntField(term26953, term26953.getClass(), "value", -2143043890);
        setBooleanField(term26953, term26953.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term26953, term26953.getClass(), "initializeExpressionPresent", false);
        setField(term26971, term26971.getClass(), "first", null);
        setField(term26971, term26971.getClass(), "second", null);
        setField(term26953, term26953.getClass(), "symbolCoordinates", term26971);
        setField(term26953, term26953.getClass(), "symbolType", enum78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term26953, args);
    }

};


