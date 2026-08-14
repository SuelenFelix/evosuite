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

public class ClassValue_equals_18275472086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;
     Object term578;

    public ClassValue_equals_18275472086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term546 = new HashMap();
        HashMap term555 = new HashMap();
        HashMap term562 = new HashMap();
        HashMap term568 = new HashMap();
        term544 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term545 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term554 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term561 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term567 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term545, term545.getClass(), "variables", term546);
        setField(term554, term554.getClass(), "variables", term555);
        setField(term561, term561.getClass(), "variables", term562);
        setField(term567, term567.getClass(), "variables", null);
        setField(term567, term567.getClass(), "parent", null);
        setField(term561, term561.getClass(), "parent", term567);
        setField(term554, term554.getClass(), "parent", term561);
        setField(term545, term545.getClass(), "parent", term554);
        setField(term544, term544.getClass(), "memoryScope", term545);
        setField(term544, term544.getClass(), "relations", term568);
        setField(term544, term544.getClass(), "value", null);
        term578 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term578;
        callMethod(klass, "equals", argTypes, term544, args);
    }

};


