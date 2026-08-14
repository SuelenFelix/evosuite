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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TokensStack_next_10391833954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8961;

    public TokensStack_next_10391833954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8980 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term8979 = ((Class) term8980).getDeclaredField((String) "Operator");
        ((Field) term8979).setAccessible(true);
        Object enum31 = ((Field) term8979).get((Object) null);
        Integer term8968 = new Integer(1135664017);
        Object term8964 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term8964, term8964.getClass(), "type", enum31);
        setField(term8964, term8964.getClass(), "value", "");
        setField(term8964, term8964.getClass(), "rowNumber", term8968);
        Class<? extends Object> term9206 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term9205 = ((Class) term9206).getDeclaredField((String) "Variable");
        ((Field) term9205).setAccessible(true);
        Object enum32 = ((Field) term9205).get((Object) null);
        Integer term8974 = new Integer(590364439);
        Object term8970 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term8970, term8970.getClass(), "type", enum32);
        setField(term8970, term8970.getClass(), "value", "");
        setField(term8970, term8970.getClass(), "rowNumber", term8974);
        ArrayList term8962 = new ArrayList();
        ((ArrayList) term8962).add(term8964);
        ((ArrayList) term8962).add(term8970);
        term8961 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term8961, term8961.getClass(), "tokens", term8962);
        setIntField(term8961, term8961.getClass(), "position", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term8961, args);
    }

};


