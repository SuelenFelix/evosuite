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

public class IntSymbol_getInitializeExpressionPresent_57880572423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28736;

    public IntSymbol_getInitializeExpressionPresent_57880572423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28736 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28736, term28736.getClass(), "name", null);
        setIntField(term28736, term28736.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28736, term28736.getClass(), "isInferredType", false);
        setIntField(term28736, term28736.getClass(), "value", 0);
        setBooleanField(term28736, term28736.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28736, term28736.getClass(), "initializeExpressionPresent", false);
        setField(term28736, term28736.getClass(), "symbolCoordinates", null);
        setField(term28736, term28736.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitializeExpressionPresent", argTypes, term28736, args);
    }

};


