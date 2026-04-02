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

public class StringSymbol_setValue_4162559195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13683;

    public StringSymbol_setValue_4162559195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13766 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term13765 = ((Class) term13766).getDeclaredField((String) "BOOL");
        ((Field) term13765).setAccessible(true);
        Object enum33 = ((Field) term13765).get((Object) null);
        term13683 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        Object term13712 = newInstance(Class.forName("kotlin.Pair"));
        setField(term13683, term13683.getClass(), "name", "WVbxuoDBcn");
        setIntField(term13683, term13683.getClass(), "firstAppearedLine", 1003743923);
        setBooleanField(term13683, term13683.getClass(), "isInferredType", false);
        setField(term13683, term13683.getClass(), "value", "pvDEABOxLt");
        setBooleanField(term13683, term13683.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term13683, term13683.getClass(), "initializeExpressionPresent", true);
        setField(term13712, term13712.getClass(), "first", null);
        setField(term13712, term13712.getClass(), "second", null);
        setField(term13683, term13683.getClass(), "symbolCoordinates", term13712);
        setField(term13683, term13683.getClass(), "symbolType", enum33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "beAMpkroCQ";
        callMethod(klass, "setValue", argTypes, term13683, args);
    }

};


