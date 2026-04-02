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

public class BoolSymbol_getAugmentedName_78114627214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23860;

    public BoolSymbol_getAugmentedName_78114627214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23916 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term23915 = ((Class) term23916).getDeclaredField((String) "STRING");
        ((Field) term23915).setAccessible(true);
        Object enum68 = ((Field) term23915).get((Object) null);
        term23860 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term23878 = newInstance(Class.forName("kotlin.Pair"));
        setField(term23860, term23860.getClass(), "name", "yUGCjlqgJE");
        setIntField(term23860, term23860.getClass(), "firstAppearedLine", -1549607466);
        setBooleanField(term23860, term23860.getClass(), "isInferredType", true);
        setBooleanField(term23860, term23860.getClass(), "value", false);
        setBooleanField(term23860, term23860.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term23860, term23860.getClass(), "initializeExpressionPresent", true);
        setField(term23878, term23878.getClass(), "first", null);
        setField(term23878, term23878.getClass(), "second", null);
        setField(term23860, term23860.getClass(), "symbolCoordinates", term23878);
        setField(term23860, term23860.getClass(), "symbolType", enum68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAugmentedName", argTypes, term23860, args);
    }

};


