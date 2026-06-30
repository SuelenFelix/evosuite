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

public class BoolSymbol_getValue_4657839854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20718;

    public BoolSymbol_getValue_4657839854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20774 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term20773 = ((Class) term20774).getDeclaredField((String) "STRING");
        ((Field) term20773).setAccessible(true);
        Object enum57 = ((Field) term20773).get((Object) null);
        term20718 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol"));
        Object term20736 = newInstance(Class.forName("kotlin.Pair"));
        setField(term20718, term20718.getClass(), "name", "zNdorvdUgu");
        setIntField(term20718, term20718.getClass(), "firstAppearedLine", 1289741214);
        setBooleanField(term20718, term20718.getClass(), "isInferredType", true);
        setBooleanField(term20718, term20718.getClass(), "value", false);
        setBooleanField(term20718, term20718.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term20718, term20718.getClass(), "initializeExpressionPresent", true);
        setField(term20736, term20736.getClass(), "first", null);
        setField(term20736, term20736.getClass(), "second", null);
        setField(term20718, term20718.getClass(), "symbolCoordinates", term20736);
        setField(term20718, term20718.getClass(), "symbolType", enum57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.BoolSymbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term20718, args);
    }

};


