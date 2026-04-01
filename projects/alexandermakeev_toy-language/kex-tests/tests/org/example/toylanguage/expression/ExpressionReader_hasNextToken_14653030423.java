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
import java.lang.String;
import java.util.ArrayList;

public class ExpressionReader_hasNextToken_14653030423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8322;

    public ExpressionReader_hasNextToken_14653030423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8386 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term8385 = ((Class) term8386).getDeclaredField((String) "NestedClassInstance");
        ((Field) term8385).setAccessible(true);
        Object enum11 = ((Field) term8385).get((Object) null);
        Class<? extends Object> term8710 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term8709 = ((Class) term8710).getDeclaredField((String) "Addition");
        ((Field) term8709).setAccessible(true);
        Object enum12 = ((Field) term8709).get((Object) null);
        Class<? extends Object> term9001 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term9000 = ((Class) term9001).getDeclaredField((String) "NestedClassInstance");
        ((Field) term9000).setAccessible(true);
        Object enum13 = ((Field) term9000).get((Object) null);
        Class<? extends Object> term9325 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term9324 = ((Class) term9325).getDeclaredField((String) "ClassProperty");
        ((Field) term9324).setAccessible(true);
        Object enum14 = ((Field) term9324).get((Object) null);
        Class<? extends Object> term9631 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term9630 = ((Class) term9631).getDeclaredField((String) "LogicalOr");
        ((Field) term9630).setAccessible(true);
        Object enum15 = ((Field) term9630).get((Object) null);
        Class<? extends Object> term9925 = Class.forName((String) "org.example.toylanguage.expression.operator.Operator");
        Field term9924 = ((Class) term9925).getDeclaredField((String) "NestedClassInstance");
        ((Field) term9924).setAccessible(true);
        Object enum16 = ((Field) term9924).get((Object) null);
        ArrayList term8380 = new ArrayList();
        term8322 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        Object term8323 = newInstance(Class.forName("java.util.Stack"));
        Object[] term8324 = (Object[]) newArray("java.lang.Object", 10);
        Object term8328 = newInstance(Class.forName("java.util.Stack"));
        Object[] term8329 = (Object[]) newArray("java.lang.Object", 10);
        Object term8379 = newInstance(Class.forName("org.example.toylanguage.token.TokensStack"));
        setField(term8323, term8323.getClass(), "elementData", term8324);
        setIntField(term8323, term8323.getClass(), "elementCount", 4);
        setIntField(term8323, term8323.getClass(), "capacityIncrement", 0);
        setIntField(term8323, term8323.getClass(), "modCount", 4);
        setField(term8322, term8322.getClass(), "operands", term8323);
        setElement(term8329, 0, enum11);
        setElement(term8329, 1, enum12);
        setElement(term8329, 2, enum13);
        setElement(term8329, 3, enum14);
        setElement(term8329, 4, enum11);
        setElement(term8329, 5, enum12);
        setElement(term8329, 6, enum15);
        setElement(term8329, 7, enum16);
        setField(term8328, term8328.getClass(), "elementData", term8329);
        setIntField(term8328, term8328.getClass(), "elementCount", 8);
        setIntField(term8328, term8328.getClass(), "capacityIncrement", 0);
        setIntField(term8328, term8328.getClass(), "modCount", 8);
        setField(term8322, term8322.getClass(), "operators", term8328);
        setField(term8379, term8379.getClass(), "tokens", term8380);
        setIntField(term8379, term8379.getClass(), "position", -1955890973);
        setField(term8322, term8322.getClass(), "tokens", term8379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNextToken", argTypes, term8322, args);
    }

};


