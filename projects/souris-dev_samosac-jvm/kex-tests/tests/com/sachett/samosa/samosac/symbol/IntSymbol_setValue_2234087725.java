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
import java.lang.Integer;

public class IntSymbol_setValue_2234087725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25470;
     Object term25505;

    public IntSymbol_setValue_2234087725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25518 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term25517 = ((Class) term25518).getDeclaredField((String) "VOID");
        ((Field) term25517).setAccessible(true);
        Object enum73 = ((Field) term25517).get((Object) null);
        term25470 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol"));
        Object term25488 = newInstance(Class.forName("kotlin.Pair"));
        setField(term25470, term25470.getClass(), "name", "THZSpzBRYP");
        setIntField(term25470, term25470.getClass(), "firstAppearedLine", -15712667);
        setBooleanField(term25470, term25470.getClass(), "isInferredType", false);
        setIntField(term25470, term25470.getClass(), "value", 1964967720);
        setBooleanField(term25470, term25470.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term25470, term25470.getClass(), "initializeExpressionPresent", true);
        setField(term25488, term25488.getClass(), "first", null);
        setField(term25488, term25488.getClass(), "second", null);
        setField(term25470, term25470.getClass(), "symbolCoordinates", term25488);
        setField(term25470, term25470.getClass(), "symbolType", enum73);
        term25505 = new Integer(1351900243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.IntSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25505;
        callMethod(klass, "setValue", argTypes, term25470, args);
    }

};


