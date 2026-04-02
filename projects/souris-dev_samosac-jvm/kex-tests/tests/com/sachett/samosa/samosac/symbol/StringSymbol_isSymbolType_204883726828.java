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

public class StringSymbol_isSymbolType_204883726828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17188;

    public StringSymbol_isSymbolType_204883726828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17188 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol"));
        setField(term17188, term17188.getClass(), "name", null);
        setIntField(term17188, term17188.getClass(), "firstAppearedLine", 0);
        setBooleanField(term17188, term17188.getClass(), "isInferredType", false);
        setField(term17188, term17188.getClass(), "value", null);
        setBooleanField(term17188, term17188.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term17188, term17188.getClass(), "initializeExpressionPresent", false);
        setField(term17188, term17188.getClass(), "symbolCoordinates", null);
        setField(term17188, term17188.getClass(), "symbolType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.StringSymbol");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.SymbolType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isSymbolType", argTypes, term17188, args);
    }

};


