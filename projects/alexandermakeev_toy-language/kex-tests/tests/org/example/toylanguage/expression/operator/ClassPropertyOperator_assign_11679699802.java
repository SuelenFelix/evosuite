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
import java.lang.Object;

public class ClassPropertyOperator_assign_11679699802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term29;

    public ClassPropertyOperator_assign_11679699802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("org.example.toylanguage.expression.operator.ClassPropertyOperator"));
        setField(term28, term28.getClass(), "left", null);
        setField(term28, term28.getClass(), "right", null);
        term29 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term30 = newInstance(Class.forName("java.lang.Object"));
        setField(term29, term29.getClass(), "value", term30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.operator.ClassPropertyOperator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[1];
        args[0] = term29;
        callMethod(klass, "assign", argTypes, term28, args);
    }

};


