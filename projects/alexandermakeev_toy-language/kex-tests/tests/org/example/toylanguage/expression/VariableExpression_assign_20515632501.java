package org.example.toylanguage.expression;

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
import static org.example.toylanguage.expression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VariableExpression_assign_20515632501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;
     Object term557;

    public VariableExpression_assign_20515632501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544 = newInstance(Class.forName("org.example.toylanguage.expression.VariableExpression"));
        setField(term544, term544.getClass(), "name", "jUbSRrkrYZ");
        term557 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term558 = newInstance(Class.forName("java.lang.Object"));
        setField(term557, term557.getClass(), "value", term558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.VariableExpression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[1];
        args[0] = term557;
        callMethod(klass, "assign", argTypes, term544, args);
    }

};


