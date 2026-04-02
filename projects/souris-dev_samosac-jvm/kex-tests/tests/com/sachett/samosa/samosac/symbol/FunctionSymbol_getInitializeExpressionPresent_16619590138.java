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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class FunctionSymbol_getInitializeExpressionPresent_16619590138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8649;

    public FunctionSymbol_getInitializeExpressionPresent_16619590138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8663 = new ArrayList();
        ((ArrayList) term8663).add((Object)null);
        ((ArrayList) term8663).add((Object)null);
        ((ArrayList) term8663).add((Object)null);
        ((ArrayList) term8663).add((Object)null);
        Class<? extends Object> term8702 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term8701 = ((Class) term8702).getDeclaredField((String) "BOOL");
        ((Field) term8701).setAccessible(true);
        Object enum16 = ((Field) term8701).get((Object) null);
        term8649 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term8690 = newInstance(Class.forName("kotlin.Pair"));
        setField(term8649, term8649.getClass(), "name", "rYbtIDVdnd");
        setIntField(term8649, term8649.getClass(), "firstAppearedLine", -19246901);
        setField(term8649, term8649.getClass(), "paramList", term8663);
        setField(term8649, term8649.getClass(), "returnType", enum16);
        setBooleanField(term8649, term8649.getClass(), "isInferredType", true);
        setBooleanField(term8649, term8649.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term8649, term8649.getClass(), "initializeExpressionPresent", true);
        setField(term8690, term8690.getClass(), "first", null);
        setField(term8690, term8690.getClass(), "second", null);
        setField(term8649, term8649.getClass(), "symbolCoordinates", term8690);
        setField(term8649, term8649.getClass(), "symbolType", enum16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitializeExpressionPresent", argTypes, term8649, args);
    }

};


