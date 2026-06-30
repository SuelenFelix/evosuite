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

public class StringSymbol_getFirstAppearedLine_6970636312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12767;

    public StringSymbol_getFirstAppearedLine_6970636312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12834 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term12833 = ((Class) term12834).getDeclaredField((String) "INT");
        ((Field) term12833).setAccessible(true);
        Object enum30 = ((Field) term12833).get((Object) null);
        term12767 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term12796 = newInstance(Class.forName("kotlin.Pair"));
        setField(term12767, term12767.getClass(), "name", "doQLHkjpNm");
        setIntField(term12767, term12767.getClass(), "firstAppearedLine", -688213483);
        setBooleanField(term12767, term12767.getClass(), "isInferredType", false);
        setField(term12767, term12767.getClass(), "value", "lCyLIcSuom");
        setBooleanField(term12767, term12767.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term12767, term12767.getClass(), "initializeExpressionPresent", false);
        setField(term12796, term12796.getClass(), "first", null);
        setField(term12796, term12796.getClass(), "second", null);
        setField(term12767, term12767.getClass(), "symbolCoordinates", term12796);
        setField(term12767, term12767.getClass(), "symbolType", enum30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstAppearedLine", argTypes, term12767, args);
    }

};


