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

public class Token_getType_17946310172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;

    public Token_getType_17946310172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term886 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term885 = ((Class) term886).getDeclaredField((String) "This");
        ((Field) term885).setAccessible(true);
        Object enum1 = ((Field) term885).get((Object) null);
        Integer term883 = new Integer(1162663216);
        term839 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term839, term839.getClass(), "type", enum1);
        setField(term839, term839.getClass(), "value", "sjlJAEtRrb");
        setField(term839, term839.getClass(), "rowNumber", term883);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term839, args);
    }

};


