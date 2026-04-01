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

public class Token_toString_8346455585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;

    public Token_toString_8346455585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1743 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1742 = ((Class) term1743).getDeclaredField((String) "Text");
        ((Field) term1742).setAccessible(true);
        Object enum4 = ((Field) term1742).get((Object) null);
        Integer term1740 = new Integer(-1922583790);
        term1708 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term1708, term1708.getClass(), "type", enum4);
        setField(term1708, term1708.getClass(), "value", "jJCZpVmanW");
        setField(term1708, term1708.getClass(), "rowNumber", term1740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1708, args);
    }

};


