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

public class TokensStack_peek_11730516555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9431;
     Object enum34;
     Object term9505;

    public TokensStack_peek_11730516555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9507 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term9506 = ((Class) term9507).getDeclaredField((String) "Keyword");
        ((Field) term9506).setAccessible(true);
        Object enum33 = ((Field) term9506).get((Object) null);
        Integer term9438 = new Integer(865208305);
        Object term9434 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term9434, term9434.getClass(), "type", enum33);
        setField(term9434, term9434.getClass(), "value", "");
        setField(term9434, term9434.getClass(), "rowNumber", term9438);
        ArrayList term9432 = new ArrayList();
        ((ArrayList) term9432).add(term9434);
        term9431 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term9431, term9431.getClass(), "tokens", term9432);
        setIntField(term9431, term9431.getClass(), "position", -616727354);
        Class<? extends Object> term9730 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term9729 = ((Class) term9730).getDeclaredField((String) "GroupDivider");
        ((Field) term9729).setAccessible(true);
        enum34 = ((Field) term9729).get((Object) null);
        term9505 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = enum34;
        args[1] = "nyiiPDVjAc";
        args[2] = term9505;
        callMethod(klass, "peek", argTypes, term9431, args);
    }

};


