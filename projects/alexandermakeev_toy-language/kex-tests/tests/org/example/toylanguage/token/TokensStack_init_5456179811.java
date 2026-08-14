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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TokensStack_init_5456179811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15381;

    public TokensStack_init_5456179811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15412 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term15411 = ((Class) term15412).getDeclaredField((String) "Whitespace");
        ((Field) term15411).setAccessible(true);
        Object enum56 = ((Field) term15411).get((Object) null);
        Integer term15401 = new Integer(-157887805);
        Object term15384 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15384, term15384.getClass(), "type", enum56);
        setField(term15384, term15384.getClass(), "value", "ieCtQFdkii");
        setField(term15384, term15384.getClass(), "rowNumber", term15401);
        Class<? extends Object> term15654 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term15653 = ((Class) term15654).getDeclaredField((String) "Comment");
        ((Field) term15653).setAccessible(true);
        Object enum57 = ((Field) term15653).get((Object) null);
        Integer term15408 = new Integer(1876565163);
        Object term15404 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term15404, term15404.getClass(), "type", enum57);
        setField(term15404, term15404.getClass(), "value", "");
        setField(term15404, term15404.getClass(), "rowNumber", term15408);
        term15381 = new LinkedList();
        ((LinkedList) term15381).add(term15384);
        ((LinkedList) term15381).add(term15404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term15381;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


