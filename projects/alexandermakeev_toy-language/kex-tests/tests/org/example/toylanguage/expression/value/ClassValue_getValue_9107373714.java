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

public class ClassValue_getValue_9107373714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term684;

    public ClassValue_getValue_9107373714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term684 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        setField(term684, term684.getClass(), "memoryScope", null);
        setField(term684, term684.getClass(), "relations", null);
        setField(term684, term684.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getValue", argTypes, term684, args);
    }

};


