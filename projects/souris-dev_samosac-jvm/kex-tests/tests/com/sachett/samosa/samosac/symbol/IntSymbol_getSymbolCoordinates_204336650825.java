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

public class IntSymbol_getSymbolCoordinates_204336650825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28750;

    public IntSymbol_getSymbolCoordinates_204336650825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28750 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        setField(term28750, term28750.getClass(), "name", null);
        setIntField(term28750, term28750.getClass(), "firstAppearedLine", 0);
        setBooleanField(term28750, term28750.getClass(), "isInferredType", false);
        setIntField(term28750, term28750.getClass(), "value", 0);
        setBooleanField(term28750, term28750.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term28750, term28750.getClass(), "initializeExpressionPresent", false);
        setField(term28750, term28750.getClass(), "symbolCoordinates", null);
        setField(term28750, term28750.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term28750, args);
    }

};


