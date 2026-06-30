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

public class StringSymbol_setInitializeExpressionPresent_17188754029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14975;
     Object term15021;

    public StringSymbol_setInitializeExpressionPresent_17188754029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15044 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15043 = ((Class) term15044).getDeclaredField((String) "INT");
        ((Field) term15043).setAccessible(true);
        Object enum37 = ((Field) term15043).get((Object) null);
        term14975 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term15004 = newInstance(Class.forName("kotlin.Pair"));
        setField(term14975, term14975.getClass(), "name", "SPtPatHeOm");
        setIntField(term14975, term14975.getClass(), "firstAppearedLine", 1365087144);
        setBooleanField(term14975, term14975.getClass(), "isInferredType", true);
        setField(term14975, term14975.getClass(), "value", "ywmcuThdfL");
        setBooleanField(term14975, term14975.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term14975, term14975.getClass(), "initializeExpressionPresent", false);
        setField(term15004, term15004.getClass(), "first", null);
        setField(term15004, term15004.getClass(), "second", null);
        setField(term14975, term14975.getClass(), "symbolCoordinates", term15004);
        setField(term14975, term14975.getClass(), "symbolType", enum37);
        term15021 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term15021;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term14975, args);
    }

};


