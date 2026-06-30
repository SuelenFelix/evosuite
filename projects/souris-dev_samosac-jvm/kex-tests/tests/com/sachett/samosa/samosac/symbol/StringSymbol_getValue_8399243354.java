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

public class StringSymbol_getValue_8399243354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13378;

    public StringSymbol_getValue_8399243354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13445 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term13444 = ((Class) term13445).getDeclaredField((String) "VOID");
        ((Field) term13444).setAccessible(true);
        Object enum32 = ((Field) term13444).get((Object) null);
        term13378 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term13407 = newInstance(Class.forName("kotlin.Pair"));
        setField(term13378, term13378.getClass(), "name", "sNQFlATEeQ");
        setIntField(term13378, term13378.getClass(), "firstAppearedLine", 76650923);
        setBooleanField(term13378, term13378.getClass(), "isInferredType", false);
        setField(term13378, term13378.getClass(), "value", "ZKMLioamsY");
        setBooleanField(term13378, term13378.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term13378, term13378.getClass(), "initializeExpressionPresent", true);
        setField(term13407, term13407.getClass(), "first", null);
        setField(term13407, term13407.getClass(), "second", null);
        setField(term13378, term13378.getClass(), "symbolCoordinates", term13407);
        setField(term13378, term13378.getClass(), "symbolType", enum32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term13378, args);
    }

};


