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

public class Token_getRowNumber_12975512684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1422;

    public Token_getRowNumber_12975512684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1476 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1475 = ((Class) term1476).getDeclaredField((String) "Logical");
        ((Field) term1475).setAccessible(true);
        Object enum3 = ((Field) term1475).get((Object) null);
        Integer term1473 = new Integer(391863371);
        term1422 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term1422, term1422.getClass(), "type", enum3);
        setField(term1422, term1422.getClass(), "value", "xxtlPwDYFs");
        setField(term1422, term1422.getClass(), "rowNumber", term1473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowNumber", argTypes, term1422, args);
    }

};


