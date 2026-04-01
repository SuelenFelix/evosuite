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

public class TokensStack_peekSameLine_213443290120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15892;

    public TokensStack_peekSameLine_213443290120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15892 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term15892, term15892.getClass(), "tokens", null);
        setIntField(term15892, term15892.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.TokensStack");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Array.newInstance(Class.forName("org.example.toylanguage.token.TokenType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "peekSameLine", argTypes, term15892, args);
    }

};


