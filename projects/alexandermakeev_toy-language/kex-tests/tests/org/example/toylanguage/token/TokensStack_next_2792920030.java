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
import java.lang.String;
import java.lang.Object;

public class TokensStack_next_2792920030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4923;
     Object enum15;
     Object term4950;

    public TokensStack_next_2792920030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4924 = new ArrayList();
        term4923 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term4923, term4923.getClass(), "tokens", term4924);
        setIntField(term4923, term4923.getClass(), "position", 568599855);
        Class<? extends Object> term5052 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term5051 = ((Class) term5052).getDeclaredField((String) "LineBreak");
        ((Field) term5051).setAccessible(true);
        enum15 = ((Field) term5051).get((Object) null);
        Class<? extends Object> term5281 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term5280 = ((Class) term5281).getDeclaredField((String) "Text");
        ((Field) term5280).setAccessible(true);
        Object enum16 = ((Field) term5280).get((Object) null);
        Class<? extends Object> term5495 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term5494 = ((Class) term5495).getDeclaredField((String) "This");
        ((Field) term5494).setAccessible(true);
        Object enum17 = ((Field) term5494).get((Object) null);
        Class<? extends Object> term5709 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term5708 = ((Class) term5709).getDeclaredField((String) "GroupDivider");
        ((Field) term5708).setAccessible(true);
        Object enum18 = ((Field) term5708).get((Object) null);
        term4950 = (Object[]) newArray("org.example.toylanguage.token.TokenType", 4);
        setElement(term4950, 0, enum16);
        setElement(term4950, 1, enum17);
        setElement(term4950, 2, enum18);
        setElement(term4950, 3, enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Array.newInstance(Class.forName("org.example.toylanguage.token.TokenType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = enum15;
        args[1] = term4950;
        callMethod(klass, "next", argTypes, term4923, args);
    }

};


