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

public class BoolSymbol_getSymbolCoordinates_13944122710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22462;

    public BoolSymbol_getSymbolCoordinates_13944122710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22508 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term22507 = ((Class) term22508).getDeclaredField((String) "VOID");
        ((Field) term22507).setAccessible(true);
        Object enum63 = ((Field) term22507).get((Object) null);
        term22462 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term22480 = newInstance(Class.forName("kotlin.Pair"));
        setField(term22462, term22462.getClass(), "name", "DIbeDHICho");
        setIntField(term22462, term22462.getClass(), "firstAppearedLine", 1543091617);
        setBooleanField(term22462, term22462.getClass(), "isInferredType", true);
        setBooleanField(term22462, term22462.getClass(), "value", false);
        setBooleanField(term22462, term22462.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term22462, term22462.getClass(), "initializeExpressionPresent", false);
        setField(term22480, term22480.getClass(), "first", null);
        setField(term22480, term22480.getClass(), "second", null);
        setField(term22462, term22462.getClass(), "symbolCoordinates", term22480);
        setField(term22462, term22462.getClass(), "symbolType", enum63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term22462, args);
    }

};


