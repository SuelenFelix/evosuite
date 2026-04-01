package org.example.toylanguage.token;

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
import static org.example.toylanguage.token.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Token_TokenBuilder_type_3852834491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1971;
     Object enum6;

    public Token_TokenBuilder_type_3852834491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2056 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term2055 = ((Class) term2056).getDeclaredField((String) "Null");
        ((Field) term2055).setAccessible(true);
        Object enum5 = ((Field) term2055).get((Object) null);
        Integer term2015 = new Integer(-616727354);
        term1971 = newInstance(Class.forName("org.example.toylanguage.token.Token$TokenBuilder"));
        setField(term1971, term1971.getClass(), "type", enum5);
        setField(term1971, term1971.getClass(), "value", "EGtDIRbSSb");
        setField(term1971, term1971.getClass(), "rowNumber", term2015);
        Class<? extends Object> term2280 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term2279 = ((Class) term2280).getDeclaredField((String) "Logical");
        ((Field) term2279).setAccessible(true);
        enum6 = ((Field) term2279).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token$TokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "type", argTypes, term1971, args);
    }

};


