package org.example.toylanguage.expression.value;

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
import static org.example.toylanguage.expression.value.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrayValue_appendValue_17269541474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term21;

    public ArrayValue_appendValue_17269541474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("org.example.toylanguage.expression.value.ArrayValue"));
        setField(term20, term20.getClass(), "value", null);
        term21 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term22 = newInstance(Class.forName("java.lang.Object"));
        setField(term21, term21.getClass(), "value", term22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ArrayValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[1];
        args[0] = term21;
        callMethod(klass, "appendValue", argTypes, term20, args);
    }

};


