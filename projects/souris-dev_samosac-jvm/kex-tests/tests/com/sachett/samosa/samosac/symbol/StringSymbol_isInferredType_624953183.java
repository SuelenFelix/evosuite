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

public class StringSymbol_isInferredType_624953183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13069;

    public StringSymbol_isInferredType_624953183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13140 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term13139 = ((Class) term13140).getDeclaredField((String) "BOOL");
        ((Field) term13139).setAccessible(true);
        Object enum31 = ((Field) term13139).get((Object) null);
        term13069 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term13098 = newInstance(Class.forName("kotlin.Pair"));
        setField(term13069, term13069.getClass(), "name", "CGOpQSZZwI");
        setIntField(term13069, term13069.getClass(), "firstAppearedLine", 644154104);
        setBooleanField(term13069, term13069.getClass(), "isInferredType", false);
        setField(term13069, term13069.getClass(), "value", "ypEdrstygY");
        setBooleanField(term13069, term13069.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term13069, term13069.getClass(), "initializeExpressionPresent", true);
        setField(term13098, term13098.getClass(), "first", null);
        setField(term13098, term13098.getClass(), "second", null);
        setField(term13069, term13069.getClass(), "symbolCoordinates", term13098);
        setField(term13069, term13069.getClass(), "symbolType", enum31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInferredType", argTypes, term13069, args);
    }

};


