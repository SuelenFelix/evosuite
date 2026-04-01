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

public class ClassPropertyOperator_evaluate_10224414314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;

    public ClassPropertyOperator_evaluate_10224414314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("org.example.toylanguage.expression.operator.ClassPropertyOperator"));
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.operator.ClassPropertyOperator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "evaluate", argTypes, term31, args);
    }

};


