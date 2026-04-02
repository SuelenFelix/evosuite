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

public class IntSymbol_getName_13046047516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28690;

    public IntSymbol_getName_13046047516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28690 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28690, term28690.getClass(), "name", null);
        setIntField(term28690, term28690.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28690, term28690.getClass(), "isInferredType", false);
        setIntField(term28690, term28690.getClass(), "value", 0);
        setBooleanField(term28690, term28690.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28690, term28690.getClass(), "initializeExpressionPresent", false);
        setField(term28690, term28690.getClass(), "symbolCoordinates", null);
        setField(term28690, term28690.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28690, args);
    }

};


