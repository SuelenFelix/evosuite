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
import java.lang.Integer;

public class IntSymbol_setSymbolCoordinates_36892603411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27241;
     Object term27286;

    public IntSymbol_setSymbolCoordinates_36892603411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27302 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term27301 = ((Class) term27302).getDeclaredField((String) "STRING");
        ((Field) term27301).setAccessible(true);
        Object enum79 = ((Field) term27301).get((Object) null);
        term27241 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term27259 = newInstance(Class.forName("kotlin.Pair"));
        setField(term27241, term27241.getClass(), "name", "WxYUTuqmIq");
        setIntField(term27241, term27241.getClass(), "firstAppearedLine", -2138825831);
        setBooleanField(term27241, term27241.getClass(), "isInferredType", false);
        setIntField(term27241, term27241.getClass(), "value", 1454781562);
        setBooleanField(term27241, term27241.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term27241, term27241.getClass(), "initializeExpressionPresent", false);
        setField(term27259, term27259.getClass(), "first", null);
        setField(term27259, term27259.getClass(), "second", null);
        setField(term27241, term27241.getClass(), "symbolCoordinates", term27259);
        setField(term27241, term27241.getClass(), "symbolType", enum79);
        Integer term27287 = new Integer(-1275173084);
        Integer term27289 = new Integer(-244121226);
        term27286 = newInstance(Class.forName("kotlin.Pair"));
        setField(term27286, term27286.getClass(), "first", term27287);
        setField(term27286, term27286.getClass(), "second", term27289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term27286;
        callMethod(klass, "setSymbolCoordinates", argTypes, term27241, args);
    }

};


