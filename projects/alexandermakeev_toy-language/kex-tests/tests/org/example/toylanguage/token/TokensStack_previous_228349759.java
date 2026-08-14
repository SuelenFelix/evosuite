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

public class TokensStack_previous_228349759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14006;

    public TokensStack_previous_228349759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14031 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term14030 = ((Class) term14031).getDeclaredField((String) "Keyword");
        ((Field) term14030).setAccessible(true);
        Object enum50 = ((Field) term14030).get((Object) null);
        Integer term14013 = new Integer(-1530420153);
        Object term14009 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14009, term14009.getClass(), "type", enum50);
        setField(term14009, term14009.getClass(), "value", "");
        setField(term14009, term14009.getClass(), "rowNumber", term14013);
        Class<? extends Object> term14254 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term14253 = ((Class) term14254).getDeclaredField((String) "Numeric");
        ((Field) term14253).setAccessible(true);
        Object enum51 = ((Field) term14253).get((Object) null);
        Integer term14019 = new Integer(-469968304);
        Object term14015 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14015, term14015.getClass(), "type", enum51);
        setField(term14015, term14015.getClass(), "value", "");
        setField(term14015, term14015.getClass(), "rowNumber", term14019);
        Class<? extends Object> term14477 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term14476 = ((Class) term14477).getDeclaredField((String) "Operator");
        ((Field) term14476).setAccessible(true);
        Object enum52 = ((Field) term14476).get((Object) null);
        Integer term14025 = new Integer(-1145578966);
        Object term14021 = newInstance(Class.forName("org.example.toylanguage.token.Token"));
        setField(term14021, term14021.getClass(), "type", enum52);
        setField(term14021, term14021.getClass(), "value", "");
        setField(term14021, term14021.getClass(), "rowNumber", term14025);
        ArrayList term14007 = new ArrayList();
        ((ArrayList) term14007).add(term14009);
        ((ArrayList) term14007).add(term14015);
        ((ArrayList) term14007).add(term14021);
        term14006 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term14006, term14006.getClass(), "tokens", term14007);
        setIntField(term14006, term14006.getClass(), "position", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "previous", argTypes, term14006, args);
    }

};


