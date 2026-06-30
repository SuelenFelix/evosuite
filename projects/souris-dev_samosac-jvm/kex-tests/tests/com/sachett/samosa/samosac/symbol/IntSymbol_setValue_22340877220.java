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
import java.lang.Integer;

public class IntSymbol_setValue_22340877220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28714;
     Object term28720;

    public IntSymbol_setValue_22340877220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28714 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28714, term28714.getClass(), "name", null);
        setIntField(term28714, term28714.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28714, term28714.getClass(), "isInferredType", false);
        setIntField(term28714, term28714.getClass(), "value", 0);
        setBooleanField(term28714, term28714.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28714, term28714.getClass(), "initializeExpressionPresent", false);
        setField(term28714, term28714.getClass(), "symbolCoordinates", null);
        setField(term28714, term28714.getClass(), "symbolType", null);
        term28720 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28720;
        callMethod(klass, "setValue", argTypes, term28714, args);
    }

};


