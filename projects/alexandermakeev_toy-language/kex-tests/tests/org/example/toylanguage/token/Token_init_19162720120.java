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

public class Token_init_19162720120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term44;

    public Token_init_19162720120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term616 = Class.forName((String) "org.example.toylanguage.token.TokenType");
        Field term615 = ((Class) term616).getDeclaredField((String) "Null");
        ((Field) term615).setAccessible(true);
        enum0 = ((Field) term615).get((Object) null);
        term44 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.token.Token");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.token.TokenType");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        Object[] args = new Object[3];
        args[0] = enum0;
        args[1] = "PAEBtnZtTD";
        args[2] = term44;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


