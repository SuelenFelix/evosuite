package org.example.toylanguage.context;

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
import static org.example.toylanguage.context.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ValueReference_setValue_14996430364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4762;
     Object term4764;

    public ValueReference_setValue_14996430364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4762 = newInstance(Class.forName("org.example.toylanguage.context.ValueReference"));
        Object term4763 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        setField(term4763, term4763.getClass(), "value", null);
        setField(term4762, term4762.getClass(), "value", term4763);
        term4764 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term4765 = newInstance(Class.forName("java.lang.Object"));
        setField(term4764, term4764.getClass(), "value", term4765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.ValueReference");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[1];
        args[0] = term4764;
        callMethod(klass, "setValue", argTypes, term4762, args);
    }

};


