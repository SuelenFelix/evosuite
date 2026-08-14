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

public class Comparison_equals_919153277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4418;
     Object term4426;

    public Comparison_equals_919153277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4428 = Class.forName((String) "org.s1ck.gdl.utils.Comparator");
        Field term4427 = ((Class) term4428).getDeclaredField((String) "LTE");
        ((Field) term4427).setAccessible(true);
        Object enum6 = ((Field) term4427).get((Object) null);
        term4418 = newInstance(Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison"));
        setField(term4418, term4418.getClass(), "lhs", null);
        setField(term4418, term4418.getClass(), "rhs", null);
        setField(term4418, term4418.getClass(), "comparator", enum6);
        term4426 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4426;
        callMethod(klass, "equals", argTypes, term4418, args);
    }

};


