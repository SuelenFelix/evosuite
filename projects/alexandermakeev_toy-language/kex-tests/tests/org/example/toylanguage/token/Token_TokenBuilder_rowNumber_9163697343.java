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

public class Token_TokenBuilder_rowNumber_9163697343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2782;
     Object term2925;

    public Token_TokenBuilder_rowNumber_9163697343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2928 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term2927 = ((Class) term2928).getDeclaredField((String) "Keyword");
        ((Field) term2927).setAccessible(true);
        Object enum8 = ((Field) term2927).get((Object) null);
        Integer term2923 = new Integer(-2038273078);
        term2782 = newInstance(Class.forName("org.example.toylanguage.token.Token$TokenBuilder"));
        setField(term2782, term2782.getClass(), "type", enum8);
        setField(term2782, term2782.getClass(), "value", "hRNSzYYIrc");
        setField(term2782, term2782.getClass(), "rowNumber", term2923);
        term2925 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token$TokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2925;
        callMethod(klass, "rowNumber", argTypes, term2782, args);
    }

};


