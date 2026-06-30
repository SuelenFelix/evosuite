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

public class BoolSymbol_setInitialValueCalculated_9814121357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21589;
     Object term21632;

    public BoolSymbol_setInitialValueCalculated_9814121357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21645 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term21644 = ((Class) term21645).getDeclaredField((String) "FUNCTION");
        ((Field) term21644).setAccessible(true);
        Object enum60 = ((Field) term21644).get((Object) null);
        term21589 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term21607 = newInstance(Class.forName("kotlin.Pair"));
        setField(term21589, term21589.getClass(), "name", "urCiQnUFBM");
        setIntField(term21589, term21589.getClass(), "firstAppearedLine", -1724487863);
        setBooleanField(term21589, term21589.getClass(), "isInferredType", false);
        setBooleanField(term21589, term21589.getClass(), "value", false);
        setBooleanField(term21589, term21589.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term21589, term21589.getClass(), "initializeExpressionPresent", false);
        setField(term21607, term21607.getClass(), "first", null);
        setField(term21607, term21607.getClass(), "second", null);
        setField(term21589, term21589.getClass(), "symbolCoordinates", term21607);
        setField(term21589, term21589.getClass(), "symbolType", enum60);
        term21632 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term21632;
        callMethod(klass, "setInitialValueCalculated", argTypes, term21589, args);
    }

};


