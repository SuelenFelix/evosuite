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
import java.lang.Boolean;

public class FunctionSymbol_setInitializeExpressionPresent_9808243059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8940;
     Object term8994;

    public FunctionSymbol_setInitializeExpressionPresent_9808243059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8954 = new ArrayList();
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        ((ArrayList) term8954).add((Object)null);
        Class<? extends Object> term9007 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9006 = ((Class) term9007).getDeclaredField((String) "INT");
        ((Field) term9006).setAccessible(true);
        Object enum17 = ((Field) term9006).get((Object) null);
        Class<? extends Object> term9243 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term9242 = ((Class) term9243).getDeclaredField((String) "VOID");
        ((Field) term9242).setAccessible(true);
        Object enum18 = ((Field) term9242).get((Object) null);
        term8940 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term8977 = newInstance(Class.forName("kotlin.Pair"));
        setField(term8940, term8940.getClass(), "name", "UKAReurpHG");
        setIntField(term8940, term8940.getClass(), "firstAppearedLine", -370828664);
        setField(term8940, term8940.getClass(), "paramList", term8954);
        setField(term8940, term8940.getClass(), "returnType", enum17);
        setBooleanField(term8940, term8940.getClass(), "isInferredType", true);
        setBooleanField(term8940, term8940.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term8940, term8940.getClass(), "initializeExpressionPresent", false);
        setField(term8977, term8977.getClass(), "first", null);
        setField(term8977, term8977.getClass(), "second", null);
        setField(term8940, term8940.getClass(), "symbolCoordinates", term8977);
        setField(term8940, term8940.getClass(), "symbolType", enum18);
        term8994 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8994;
        callMethod(klass, "setInitializeExpressionPresent", argTypes, term8940, args);
    }

};


