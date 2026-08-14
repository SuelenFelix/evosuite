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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Object;

public class ClassExpression_evaluate_5452076153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21223;
     Object term21250;

    public ClassExpression_evaluate_5452076153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21236 = new ArrayList();
        HashMap term21240 = new HashMap();
        term21223 = newInstance(Class.forName("org.example.toylanguage.expression.ClassExpression"));
        setField(term21223, term21223.getClass(), "name", "ZkMALXpEAZ");
        setField(term21223, term21223.getClass(), "propertiesExpressions", term21236);
        setField(term21223, term21223.getClass(), "relations", term21240);
        Object term21253 = newInstance(Class.forName("org.example.toylanguage.context.ValueReference"));
        Object term21254 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        setField(term21254, term21254.getClass(), "value", null);
        setField(term21253, term21253.getClass(), "value", term21254);
        term21250 = new LinkedList();
        ((LinkedList) term21250).add(term21253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ClassExpression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term21250;
        callMethod(klass, "evaluate", argTypes, term21223, args);
    }

};


