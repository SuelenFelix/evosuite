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
import java.util.HashMap;

public class ClassValue_iterator_19066624547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579;

    public ClassValue_iterator_19066624547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term581 = new HashMap();
        HashMap term590 = new HashMap();
        HashMap term597 = new HashMap();
        HashMap term603 = new HashMap();
        term579 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term580 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term589 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term596 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term602 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term580, term580.getClass(), "variables", term581);
        setField(term589, term589.getClass(), "variables", term590);
        setField(term596, term596.getClass(), "variables", term597);
        setField(term602, term602.getClass(), "variables", null);
        setField(term602, term602.getClass(), "parent", null);
        setField(term596, term596.getClass(), "parent", term602);
        setField(term589, term589.getClass(), "parent", term596);
        setField(term580, term580.getClass(), "parent", term589);
        setField(term579, term579.getClass(), "memoryScope", term580);
        setField(term579, term579.getClass(), "relations", term603);
        setField(term579, term579.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term579, args);
    }

};


