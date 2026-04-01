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

public class TokensStack_peekSameLine_21344329018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12913;
     Object enum47;
     Object term12963;

    public TokensStack_peekSameLine_21344329018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13124 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term13123 = ((Class) term13124).getDeclaredField((String) "Keyword");
        ((Field) term13123).setAccessible(true);
        Object enum46 = ((Field) term13123).get((Object) null);
        Integer term12920 = new Integer(-1087774327);
        Object term12916 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term12916, term12916.getClass(), "type", enum46);
        setField(term12916, term12916.getClass(), "value", "");
        setField(term12916, term12916.getClass(), "rowNumber", term12920);
        ArrayList term12914 = new ArrayList();
        ((ArrayList) term12914).add(term12916);
        term12913 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term12913, term12913.getClass(), "tokens", term12914);
        setIntField(term12913, term12913.getClass(), "position", 1227103734);
        Class<? extends Object> term13347 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term13346 = ((Class) term13347).getDeclaredField((String) "Logical");
        ((Field) term13346).setAccessible(true);
        enum47 = ((Field) term13346).get((Object) null);
        Class<? extends Object> term13570 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term13569 = ((Class) term13570).getDeclaredField((String) "Keyword");
        ((Field) term13569).setAccessible(true);
        Object enum48 = ((Field) term13569).get((Object) null);
        Class<? extends Object> term13793 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term13792 = ((Class) term13793).getDeclaredField((String) "This");
        ((Field) term13792).setAccessible(true);
        Object enum49 = ((Field) term13792).get((Object) null);
        term12963 = (Object[]) newArray("org.example.toylanguage.token.TokenType", 2);
        setElement(term12963, 0, enum48);
        setElement(term12963, 1, enum49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Array.newInstance(Class.forName("org.example.toylanguage.token.TokenType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = enum47;
        args[1] = term12963;
        callMethod(klass, "peekSameLine", argTypes, term12913, args);
    }

};


