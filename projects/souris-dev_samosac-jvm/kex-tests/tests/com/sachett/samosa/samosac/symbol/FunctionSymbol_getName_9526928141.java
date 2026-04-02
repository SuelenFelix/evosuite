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

public class FunctionSymbol_getName_9526928141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5023;

    public FunctionSymbol_getName_9526928141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5037 = new ArrayList();
        ((ArrayList) term5037).add((Object)null);
        ((ArrayList) term5037).add((Object)null);
        ((ArrayList) term5037).add((Object)null);
        ((ArrayList) term5037).add((Object)null);
        ((ArrayList) term5037).add((Object)null);
        Class<? extends Object> term5100 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5099 = ((Class) term5100).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term5099).setAccessible(true);
        Object enum3 = ((Field) term5099).get((Object) null);
        Class<? extends Object> term5360 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5359 = ((Class) term5360).getDeclaredField((String) "BOOL");
        ((Field) term5359).setAccessible(true);
        Object enum4 = ((Field) term5359).get((Object) null);
        term5023 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term5068 = newInstance(Class.forName("kotlin.Pair"));
        setField(term5023, term5023.getClass(), "name", "ShIELyuULw");
        setIntField(term5023, term5023.getClass(), "firstAppearedLine", -97742366);
        setField(term5023, term5023.getClass(), "paramList", term5037);
        setField(term5023, term5023.getClass(), "returnType", enum3);
        setBooleanField(term5023, term5023.getClass(), "isInferredType", true);
        setBooleanField(term5023, term5023.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term5023, term5023.getClass(), "initializeExpressionPresent", true);
        setField(term5068, term5068.getClass(), "first", null);
        setField(term5068, term5068.getClass(), "second", null);
        setField(term5023, term5023.getClass(), "symbolCoordinates", term5068);
        setField(term5023, term5023.getClass(), "symbolType", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5023, args);
    }

};


