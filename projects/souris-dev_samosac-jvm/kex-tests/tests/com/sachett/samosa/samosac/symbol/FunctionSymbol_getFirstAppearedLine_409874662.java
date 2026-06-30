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

public class FunctionSymbol_getFirstAppearedLine_409874662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5598;

    public FunctionSymbol_getFirstAppearedLine_409874662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5612 = new ArrayList();
        ((ArrayList) term5612).add((Object)null);
        ((ArrayList) term5612).add((Object)null);
        ((ArrayList) term5612).add((Object)null);
        Class<? extends Object> term5671 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5670 = ((Class) term5671).getDeclaredField((String) "INT");
        ((Field) term5670).setAccessible(true);
        Object enum5 = ((Field) term5670).get((Object) null);
        Class<? extends Object> term5907 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5906 = ((Class) term5907).getDeclaredField((String) "UNSUPPORTED");
        ((Field) term5906).setAccessible(true);
        Object enum6 = ((Field) term5906).get((Object) null);
        term5598 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term5635 = newInstance(Class.forName("kotlin.Pair"));
        setField(term5598, term5598.getClass(), "name", "IpQuOGMgmj");
        setIntField(term5598, term5598.getClass(), "firstAppearedLine", 1638851942);
        setField(term5598, term5598.getClass(), "paramList", term5612);
        setField(term5598, term5598.getClass(), "returnType", enum5);
        setBooleanField(term5598, term5598.getClass(), "isInferredType", true);
        setBooleanField(term5598, term5598.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term5598, term5598.getClass(), "initializeExpressionPresent", false);
        setField(term5635, term5635.getClass(), "first", null);
        setField(term5635, term5635.getClass(), "second", null);
        setField(term5598, term5598.getClass(), "symbolCoordinates", term5635);
        setField(term5598, term5598.getClass(), "symbolType", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstAppearedLine", argTypes, term5598, args);
    }

};


