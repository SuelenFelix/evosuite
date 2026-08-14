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

public class Token_TokenBuilder_build_14453780114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3160;

    public Token_TokenBuilder_build_14453780114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3304 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term3303 = ((Class) term3304).getDeclaredField((String) "Keyword");
        ((Field) term3303).setAccessible(true);
        Object enum9 = ((Field) term3303).get((Object) null);
        Integer term3301 = new Integer(-1339778481);
        term3160 = newInstance(Class.forName("org.example.toylanguage.token.Token$TokenBuilder"));
        setField(term3160, term3160.getClass(), "type", enum9);
        setField(term3160, term3160.getClass(), "value", "RMFIsYGgne");
        setField(term3160, term3160.getClass(), "rowNumber", term3301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token$TokenBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3160, args);
    }

};


