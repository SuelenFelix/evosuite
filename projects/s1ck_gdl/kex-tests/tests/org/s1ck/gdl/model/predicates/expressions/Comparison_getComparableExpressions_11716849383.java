package org.s1ck.gdl.model.predicates.expressions;

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
import static org.s1ck.gdl.model.predicates.expressions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Comparison_getComparableExpressions_11716849383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542;

    public Comparison_getComparableExpressions_11716849383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term551 = Class.forName((String) "org.s1ck.gdl.utils.Comparator");
        Field term550 = ((Class) term551).getDeclaredField((String) "LTE");
        ((Field) term550).setAccessible(true);
        Object enum3 = ((Field) term550).get((Object) null);
        term542 = newInstance(Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison"));
        setField(term542, term542.getClass(), "lhs", null);
        setField(term542, term542.getClass(), "rhs", null);
        setField(term542, term542.getClass(), "comparator", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComparableExpressions", argTypes, term542, args);
    }

};


