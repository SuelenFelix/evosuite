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

public class BoolSymbol_getFirstAppearedLine_11406419122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20117;

    public BoolSymbol_getFirstAppearedLine_11406419122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20171 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term20170 = ((Class) term20171).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term20170).setAccessible(true);
        Object enum55 = ((Field) term20170).get((Object) null);
        term20117 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term20135 = newInstance(Class.forName("kotlin.Pair"));
        setField(term20117, term20117.getClass(), "name", "TtGbVmKcnX");
        setIntField(term20117, term20117.getClass(), "firstAppearedLine", 1916544127);
        setBooleanField(term20117, term20117.getClass(), "isInferredType", false);
        setBooleanField(term20117, term20117.getClass(), "value", false);
        setBooleanField(term20117, term20117.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term20117, term20117.getClass(), "initializeExpressionPresent", false);
        setField(term20135, term20135.getClass(), "first", null);
        setField(term20135, term20135.getClass(), "second", null);
        setField(term20117, term20117.getClass(), "symbolCoordinates", term20135);
        setField(term20117, term20117.getClass(), "symbolType", enum55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstAppearedLine", argTypes, term20117, args);
    }

};


