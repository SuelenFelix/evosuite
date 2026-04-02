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

public class BoolSymbol_isInitialValueCalculated_19951794136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21301;

    public BoolSymbol_isInitialValueCalculated_19951794136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21351 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term21350 = ((Class) term21351).getDeclaredField((String) "BOOL");
        ((Field) term21350).setAccessible(true);
        Object enum59 = ((Field) term21350).get((Object) null);
        term21301 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term21319 = newInstance(Class.forName("kotlin.Pair"));
        setField(term21301, term21301.getClass(), "name", "vKitydDVnM");
        setIntField(term21301, term21301.getClass(), "firstAppearedLine", -726681073);
        setBooleanField(term21301, term21301.getClass(), "isInferredType", true);
        setBooleanField(term21301, term21301.getClass(), "value", true);
        setBooleanField(term21301, term21301.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term21301, term21301.getClass(), "initializeExpressionPresent", true);
        setField(term21319, term21319.getClass(), "first", null);
        setField(term21319, term21319.getClass(), "second", null);
        setField(term21301, term21301.getClass(), "symbolCoordinates", term21319);
        setField(term21301, term21301.getClass(), "symbolType", enum59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInitialValueCalculated", argTypes, term21301, args);
    }

};


