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

public class IntSymbol_getFirstAppearedLine_104216582317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28696;

    public IntSymbol_getFirstAppearedLine_104216582317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28696 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28696, term28696.getClass(), "name", null);
        setIntField(term28696, term28696.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28696, term28696.getClass(), "isInferredType", false);
        setIntField(term28696, term28696.getClass(), "value", 0);
        setBooleanField(term28696, term28696.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28696, term28696.getClass(), "initializeExpressionPresent", false);
        setField(term28696, term28696.getClass(), "symbolCoordinates", null);
        setField(term28696, term28696.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstAppearedLine", argTypes, term28696, args);
    }

};


