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

public class Comparison_hashCode_5406020028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4588;

    public Comparison_hashCode_5406020028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4596 = Class.forName((String) "org.s1ck.gdl.utils.Comparator");
        Field term4595 = ((Class) term4596).getDeclaredField((String) "LT");
        ((Field) term4595).setAccessible(true);
        Object enum7 = ((Field) term4595).get((Object) null);
        term4588 = newInstance(Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison"));
        setField(term4588, term4588.getClass(), "lhs", null);
        setField(term4588, term4588.getClass(), "rhs", null);
        setField(term4588, term4588.getClass(), "comparator", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4588, args);
    }

};


