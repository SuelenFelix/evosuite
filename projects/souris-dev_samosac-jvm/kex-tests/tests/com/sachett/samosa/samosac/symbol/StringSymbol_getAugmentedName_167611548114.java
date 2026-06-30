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

public class StringSymbol_getAugmentedName_167611548114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16811;

    public StringSymbol_getAugmentedName_167611548114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16878 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term16877 = ((Class) term16878).getDeclaredField((String) "VOID");
        ((Field) term16877).setAccessible(true);
        Object enum43 = ((Field) term16877).get((Object) null);
        term16811 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term16840 = newInstance(Class.forName("kotlin.Pair"));
        setField(term16811, term16811.getClass(), "name", "NBrvVzvQHe");
        setIntField(term16811, term16811.getClass(), "firstAppearedLine", -2063365430);
        setBooleanField(term16811, term16811.getClass(), "isInferredType", true);
        setField(term16811, term16811.getClass(), "value", "FjOiNAfBOc");
        setBooleanField(term16811, term16811.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term16811, term16811.getClass(), "initializeExpressionPresent", false);
        setField(term16840, term16840.getClass(), "first", null);
        setField(term16840, term16840.getClass(), "second", null);
        setField(term16811, term16811.getClass(), "symbolCoordinates", term16840);
        setField(term16811, term16811.getClass(), "symbolType", enum43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAugmentedName", argTypes, term16811, args);
    }

};


