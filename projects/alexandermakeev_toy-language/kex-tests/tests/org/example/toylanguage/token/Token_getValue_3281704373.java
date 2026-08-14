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

public class Token_getValue_3281704373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109;

    public Token_getValue_3281704373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1175 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term1174 = ((Class) term1175).getDeclaredField((String) "GroupDivider");
        ((Field) term1174).setAccessible(true);
        Object enum2 = ((Field) term1174).get((Object) null);
        Integer term1172 = new Integer(1484323161);
        term1109 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term1109, term1109.getClass(), "type", enum2);
        setField(term1109, term1109.getClass(), "value", "MuLcgQHgqz");
        setField(term1109, term1109.getClass(), "rowNumber", term1172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term1109, args);
    }

};


