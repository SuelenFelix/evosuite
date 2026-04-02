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

public class StringSymbol_getSymbolCoordinates_169826431610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15279;

    public StringSymbol_getSymbolCoordinates_169826431610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15354 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15353 = ((Class) term15354).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term15353).setAccessible(true);
        Object enum38 = ((Field) term15353).get((Object) null);
        term15279 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term15308 = newInstance(Class.forName("kotlin.Pair"));
        setField(term15279, term15279.getClass(), "name", "GBOEuByOfr");
        setIntField(term15279, term15279.getClass(), "firstAppearedLine", -1537255112);
        setBooleanField(term15279, term15279.getClass(), "isInferredType", true);
        setField(term15279, term15279.getClass(), "value", "NHbOFFjyVK");
        setBooleanField(term15279, term15279.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term15279, term15279.getClass(), "initializeExpressionPresent", false);
        setField(term15308, term15308.getClass(), "first", null);
        setField(term15308, term15308.getClass(), "second", null);
        setField(term15279, term15279.getClass(), "symbolCoordinates", term15308);
        setField(term15279, term15279.getClass(), "symbolType", enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolCoordinates", argTypes, term15279, args);
    }

};


