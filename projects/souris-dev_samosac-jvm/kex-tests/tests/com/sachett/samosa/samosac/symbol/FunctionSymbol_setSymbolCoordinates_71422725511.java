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
import java.lang.Integer;

public class FunctionSymbol_setSymbolCoordinates_71422725511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10047;
     Object term10085;

    public FunctionSymbol_setSymbolCoordinates_71422725511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10061 = new ArrayList();
        ((ArrayList) term10061).add((Object)null);
        ((ArrayList) term10061).add((Object)null);
        Class<? extends Object> term10101 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term10100 = ((Class) term10101).getDeclaredField((String) "VOID");
        ((Field) term10100).setAccessible(true);
        Object enum21 = ((Field) term10100).get((Object) null);
        term10047 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term10084 = newInstance(Class.forName("kotlin.Pair"));
        setField(term10047, term10047.getClass(), "name", "NTlKJDDWlk");
        setIntField(term10047, term10047.getClass(), "firstAppearedLine", 1607082164);
        setField(term10047, term10047.getClass(), "paramList", term10061);
        setField(term10047, term10047.getClass(), "returnType", enum21);
        setBooleanField(term10047, term10047.getClass(), "isInferredType", false);
        setBooleanField(term10047, term10047.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term10047, term10047.getClass(), "initializeExpressionPresent", false);
        setField(term10084, term10084.getClass(), "first", null);
        setField(term10084, term10084.getClass(), "second", null);
        setField(term10047, term10047.getClass(), "symbolCoordinates", term10084);
        setField(term10047, term10047.getClass(), "symbolType", enum21);
        Integer term10086 = new Integer(-1685132342);
        Integer term10088 = new Integer(-1456670397);
        term10085 = newInstance(Class.forName("kotlin.Pair"));
        setField(term10085, term10085.getClass(), "first", term10086);
        setField(term10085, term10085.getClass(), "second", term10088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("kotlin.Pair");
        Object[] args = new Object[1];
        args[0] = term10085;
        callMethod(klass, "setSymbolCoordinates", argTypes, term10047, args);
    }

};


