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

public class BoolSymbol_isSymbolType_40842448513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23320;
     Object enum67;

    public BoolSymbol_isSymbolType_40842448513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23386 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term23385 = ((Class) term23386).getDeclaredField((String) "BOOL");
        ((Field) term23385).setAccessible(true);
        Object enum66 = ((Field) term23385).get((Object) null);
        term23320 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term23338 = newInstance(Class.forName("kotlin.Pair"));
        setField(term23320, term23320.getClass(), "name", "wBGfLpNNiZ");
        setIntField(term23320, term23320.getClass(), "firstAppearedLine", 291864719);
        setBooleanField(term23320, term23320.getClass(), "isInferredType", false);
        setBooleanField(term23320, term23320.getClass(), "value", false);
        setBooleanField(term23320, term23320.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term23320, term23320.getClass(), "initializeExpressionPresent", false);
        setField(term23338, term23338.getClass(), "first", null);
        setField(term23338, term23338.getClass(), "second", null);
        setField(term23320, term23320.getClass(), "symbolCoordinates", term23338);
        setField(term23320, term23320.getClass(), "symbolType", enum66);
        Class<? extends Object> term23625 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term23624 = ((Class) term23625).getDeclaredField((String) "INT");
        ((Field) term23624).setAccessible(true);
        enum67 = ((Field) term23624).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        Object[] args = new Object[1];
        args[0] = enum67;
        callMethod(klass, "isSymbolType", argTypes, term23320, args);
    }

};


