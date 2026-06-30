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

public class StringSymbol_getSymbolType_119198651212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15923;

    public StringSymbol_getSymbolType_119198651212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15990 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term15989 = ((Class) term15990).getDeclaredField((String) "INT");
        ((Field) term15989).setAccessible(true);
        Object enum40 = ((Field) term15989).get((Object) null);
        term15923 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term15952 = newInstance(Class.forName("kotlin.Pair"));
        setField(term15923, term15923.getClass(), "name", "pXdglvyrQe");
        setIntField(term15923, term15923.getClass(), "firstAppearedLine", 4900410);
        setBooleanField(term15923, term15923.getClass(), "isInferredType", false);
        setField(term15923, term15923.getClass(), "value", "OcfNzHYdki");
        setBooleanField(term15923, term15923.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term15923, term15923.getClass(), "initializeExpressionPresent", true);
        setField(term15952, term15952.getClass(), "first", null);
        setField(term15952, term15952.getClass(), "second", null);
        setField(term15923, term15923.getClass(), "symbolCoordinates", term15952);
        setField(term15923, term15923.getClass(), "symbolType", enum40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbolType", argTypes, term15923, args);
    }

};


