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

public class Comparison_getComparator_5147793711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4986;

    public Comparison_getComparator_5147793711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4986 = newInstance(Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison"));
        setField(term4986, term4986.getClass(), "lhs", null);
        setField(term4986, term4986.getClass(), "rhs", null);
        setField(term4986, term4986.getClass(), "comparator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.expressions.Comparison");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComparator", argTypes, term4986, args);
    }

};


