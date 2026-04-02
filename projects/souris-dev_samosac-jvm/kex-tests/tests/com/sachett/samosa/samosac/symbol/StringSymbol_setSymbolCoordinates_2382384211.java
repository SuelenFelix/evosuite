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
import java.lang.Integer;

public class StringSymbol_setSymbolCoordinates_2382384211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15613;
     Object term15659;

    public StringSymbol_setSymbolCoordinates_2382384211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15685 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15684 = ((Class) term15685).getDeclaredField((String) "VOID");
        ((Field) term15684).setAccessible(true);
        Object enum39 = ((Field) term15684).get((Object) null);
        term15613 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term15642 = newInstance(Class.forName("kotlin.Pair"));
        setField(term15613, term15613.getClass(), "name", "zaloBqlrSo");
        setIntField(term15613, term15613.getClass(), "firstAppearedLine", 934477462);
        setBooleanField(term15613, term15613.getClass(), "isInferredType", true);
        setField(term15613, term15613.getClass(), "value", "vvoLrMGCoN");
        setBooleanField(term15613, term15613.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term15613, term15613.getClass(), "initializeExpressionPresent", false);
        setField(term15642, term15642.getClass(), "first", null);
        setField(term15642, term15642.getClass(), "second", null);
        setField(term15613, term15613.getClass(), "symbolCoordinates", term15642);
        setField(term15613, term15613.getClass(), "symbolType", enum39);
        Integer term15660 = new Integer(-655067527);
        Integer term15662 = new Integer(-6029667);
        term15659 = newInstance(Class.forName("kotlin.Pair"));
        setField(term15659, term15659.getClass(), "first", term15660);
        setField(term15659, term15659.getClass(), "second", term15662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term15659;
        callMethod(klass, "setSymbolCoordinates", argTypes, term15613, args);
    }

};


