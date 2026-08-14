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

public class Token_TokenBuilder_value_20055203972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2502;

    public Token_TokenBuilder_value_20055203972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2549 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term2548 = ((Class) term2549).getDeclaredField((String) "Text");
        ((Field) term2548).setAccessible(true);
        Object enum7 = ((Field) term2548).get((Object) null);
        Integer term2534 = new Integer(-1955890973);
        term2502 = newInstance(Class.forName("org.example.toylanguage.token.Token$TokenBuilder"));
        setField(term2502, term2502.getClass(), "type", enum7);
        setField(term2502, term2502.getClass(), "value", "SzjVpOQTyS");
        setField(term2502, term2502.getClass(), "rowNumber", term2534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token$TokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "value", argTypes, term2502, args);
    }

};


