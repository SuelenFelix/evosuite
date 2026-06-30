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

public class FunctionSymbol_isInferredType_8005464155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7003;

    public FunctionSymbol_isInferredType_8005464155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7017 = new ArrayList();
        ((ArrayList) term7017).add((Object)null);
        Class<? extends Object> term7072 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7071 = ((Class) term7072).getDeclaredField((String) "BOOL");
        ((Field) term7071).setAccessible(true);
        Object enum10 = ((Field) term7071).get((Object) null);
        Class<? extends Object> term7311 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7310 = ((Class) term7311).getDeclaredField((String) "INT");
        ((Field) term7310).setAccessible(true);
        Object enum11 = ((Field) term7310).get((Object) null);
        term7003 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term7044 = newInstance(Class.forName("kotlin.Pair"));
        setField(term7003, term7003.getClass(), "name", "nghfqDXyCG");
        setIntField(term7003, term7003.getClass(), "firstAppearedLine", -423900705);
        setField(term7003, term7003.getClass(), "paramList", term7017);
        setField(term7003, term7003.getClass(), "returnType", enum10);
        setBooleanField(term7003, term7003.getClass(), "isInferredType", true);
        setBooleanField(term7003, term7003.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term7003, term7003.getClass(), "initializeExpressionPresent", true);
        setField(term7044, term7044.getClass(), "first", null);
        setField(term7044, term7044.getClass(), "second", null);
        setField(term7003, term7003.getClass(), "symbolCoordinates", term7044);
        setField(term7003, term7003.getClass(), "symbolType", enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInferredType", argTypes, term7003, args);
    }

};


