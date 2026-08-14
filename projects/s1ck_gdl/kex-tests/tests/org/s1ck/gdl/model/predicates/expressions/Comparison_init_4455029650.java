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

public class Comparison_init_4455029650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public Comparison_init_4455029650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48 = Class.forName((String) "org.s1ck.gdl.utils.Comparator");
        Field term47 = ((Class) term48).getDeclaredField((String) "NEQ");
        ((Field) term47).setAccessible(true);
        enum0 = ((Field) term47).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.s1ck.gdl.model.comparables.ComparableExpression");
        argTypes[1] = Class.forName("org.s1ck.gdl.utils.Comparator");
        argTypes[2] = Class.forName("org.s1ck.gdl.model.comparables.ComparableExpression");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = enum0;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


