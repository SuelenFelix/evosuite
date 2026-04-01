package org.example.toylanguage.expression.operator;

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
import static org.example.toylanguage.expression.operator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Operator_greaterThan_10453848904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum76;
     Object enum77;

    public Operator_greaterThan_10453848904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57319 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term57318 = ((Class) term57319).getDeclaredField((String) "Modulo");
        ((Field) term57318).setAccessible(true);
        enum76 = ((Field) term57318).get((Object) null);
        Class<? extends Object> term57604 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term57603 = ((Class) term57604).getDeclaredField((String) "Not");
        ((Field) term57603).setAccessible(true);
        enum77 = ((Field) term57603).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.operator.Operator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.operator.Operator");
        Object[] args = new Object[1];
        args[0] = enum77;
        callMethod(klass, "greaterThan", argTypes, enum76, args);
    }

};


