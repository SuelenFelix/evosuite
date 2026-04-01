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

public class TokensStack_peek_2947154997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11291;
     Object enum41;
     Object term11309;

    public TokensStack_peek_2947154997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11549 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term11548 = ((Class) term11549).getDeclaredField((String) "Operator");
        ((Field) term11548).setAccessible(true);
        Object enum40 = ((Field) term11548).get((Object) null);
        Integer term11298 = new Integer(-226514366);
        Object term11294 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term11294, term11294.getClass(), "type", enum40);
        setField(term11294, term11294.getClass(), "value", "");
        setField(term11294, term11294.getClass(), "rowNumber", term11298);
        Class<? extends Object> term11775 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term11774 = ((Class) term11775).getDeclaredField((String) "Keyword");
        ((Field) term11774).setAccessible(true);
        enum41 = ((Field) term11774).get((Object) null);
        Integer term11304 = new Integer(1193880199);
        Object term11300 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term11300, term11300.getClass(), "type", enum41);
        setField(term11300, term11300.getClass(), "value", "");
        setField(term11300, term11300.getClass(), "rowNumber", term11304);
        ArrayList term11292 = new ArrayList();
        ((ArrayList) term11292).add(term11294);
        ((ArrayList) term11292).add(term11300);
        term11291 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term11291, term11291.getClass(), "tokens", term11292);
        setIntField(term11291, term11291.getClass(), "position", -2038273078);
        Class<? extends Object> term11998 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term11997 = ((Class) term11998).getDeclaredField((String) "Logical");
        ((Field) term11997).setAccessible(true);
        Object enum42 = ((Field) term11997).get((Object) null);
        Class<? extends Object> term12221 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term12220 = ((Class) term12221).getDeclaredField((String) "Keyword");
        ((Field) term12220).setAccessible(true);
        Object enum43 = ((Field) term12220).get((Object) null);
        Class<? extends Object> term12444 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term12443 = ((Class) term12444).getDeclaredField((String) "Whitespace");
        ((Field) term12443).setAccessible(true);
        Object enum44 = ((Field) term12443).get((Object) null);
        Class<? extends Object> term12676 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term12675 = ((Class) term12676).getDeclaredField((String) "GroupDivider");
        ((Field) term12675).setAccessible(true);
        Object enum45 = ((Field) term12675).get((Object) null);
        term11309 = (Object[]) newArray("org.example.toylanguage.token.TokenType", 6);
        setElement(term11309, 0, enum42);
        setElement(term11309, 1, enum40);
        setElement(term11309, 2, enum40);
        setElement(term11309, 3, enum43);
        setElement(term11309, 4, enum44);
        setElement(term11309, 5, enum45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Array.newInstance(Class.forName("org.example.toylanguage.token.TokenType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = enum41;
        args[1] = term11309;
        callMethod(klass, "peek", argTypes, term11291, args);
    }

};


