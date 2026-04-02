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

public class BoolSymbol_setValue_18887517815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21018;
     Object term21053;

    public BoolSymbol_setValue_18887517815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21066 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term21065 = ((Class) term21066).getDeclaredField((String) "INT");
        ((Field) term21065).setAccessible(true);
        Object enum58 = ((Field) term21065).get((Object) null);
        term21018 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term21036 = newInstance(Class.forName("kotlin.Pair"));
        setField(term21018, term21018.getClass(), "name", "oPxuZbkYio");
        setIntField(term21018, term21018.getClass(), "firstAppearedLine", 243280944);
        setBooleanField(term21018, term21018.getClass(), "isInferredType", false);
        setBooleanField(term21018, term21018.getClass(), "value", true);
        setBooleanField(term21018, term21018.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term21018, term21018.getClass(), "initializeExpressionPresent", false);
        setField(term21036, term21036.getClass(), "first", null);
        setField(term21036, term21036.getClass(), "second", null);
        setField(term21018, term21018.getClass(), "symbolCoordinates", term21036);
        setField(term21018, term21018.getClass(), "symbolType", enum58);
        term21053 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term21053;
        callMethod(klass, "setValue", argTypes, term21018, args);
    }

};


