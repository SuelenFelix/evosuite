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

public class Comparison_getComparator_514779372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public Comparison_getComparator_514779372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term382 = Class.forName((String) "org.s1ck.gdl.utils.Comparator");
        Field term381 = ((Class) term382).getDeclaredField((String) "GTE");
        ((Field) term381).setAccessible(true);
        Object enum2 = ((Field) term381).get((Object) null);
        term373 = newInstance(Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison"));
        setField(term373, term373.getClass(), "lhs", null);
        setField(term373, term373.getClass(), "rhs", null);
        setField(term373, term373.getClass(), "comparator", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComparator", argTypes, term373, args);
    }

};


