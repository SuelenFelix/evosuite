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

public class StringSymbol_getName_2146417171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12458;

    public StringSymbol_getName_2146417171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12529 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term12528 = ((Class) term12529).getDeclaredField((String) "BOOL");
        ((Field) term12528).setAccessible(true);
        Object enum29 = ((Field) term12528).get((Object) null);
        term12458 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term12487 = newInstance(Class.forName("kotlin.Pair"));
        setField(term12458, term12458.getClass(), "name", "UBRmXJmfrt");
        setIntField(term12458, term12458.getClass(), "firstAppearedLine", -645429025);
        setBooleanField(term12458, term12458.getClass(), "isInferredType", true);
        setField(term12458, term12458.getClass(), "value", "WZzvmIHhzZ");
        setBooleanField(term12458, term12458.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12458, term12458.getClass(), "initializeExpressionPresent", false);
        setField(term12487, term12487.getClass(), "first", null);
        setField(term12487, term12487.getClass(), "second", null);
        setField(term12458, term12458.getClass(), "symbolCoordinates", term12487);
        setField(term12458, term12458.getClass(), "symbolType", enum29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term12458, args);
    }

};


