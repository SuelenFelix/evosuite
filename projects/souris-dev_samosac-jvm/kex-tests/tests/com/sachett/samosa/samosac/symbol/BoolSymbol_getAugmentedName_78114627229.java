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

public class BoolSymbol_getAugmentedName_78114627229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24254;

    public BoolSymbol_getAugmentedName_78114627229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24254 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        setField(term24254, term24254.getClass(), "name", null);
        setIntField(term24254, term24254.getClass(), "firstAppearedLine", 0);
        setBooleanField(term24254, term24254.getClass(), "isInferredType", false);
        setBooleanField(term24254, term24254.getClass(), "value", false);
        setBooleanField(term24254, term24254.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term24254, term24254.getClass(), "initializeExpressionPresent", false);
        setField(term24254, term24254.getClass(), "symbolCoordinates", null);
        setField(term24254, term24254.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAugmentedName", argTypes, term24254, args);
    }

};


