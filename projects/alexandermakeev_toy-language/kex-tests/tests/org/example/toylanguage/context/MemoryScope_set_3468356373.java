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
import java.util.HashMap;
import java.lang.Object;

public class MemoryScope_set_3468356373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4512;
     Object term4558;

    public MemoryScope_set_3468356373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4513 = new HashMap();
        HashMap term4524 = new HashMap();
        HashMap term4533 = new HashMap();
        HashMap term4540 = new HashMap();
        term4512 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4523 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4532 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4539 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4545 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4512, term4512.getClass(), "variables", term4513);
        setField(term4523, term4523.getClass(), "variables", term4524);
        setField(term4532, term4532.getClass(), "variables", term4533);
        setField(term4539, term4539.getClass(), "variables", term4540);
        setField(term4545, term4545.getClass(), "variables", null);
        setField(term4545, term4545.getClass(), "parent", null);
        setField(term4539, term4539.getClass(), "parent", term4545);
        setField(term4532, term4532.getClass(), "parent", term4539);
        setField(term4523, term4523.getClass(), "parent", term4532);
        setField(term4512, term4512.getClass(), "parent", term4523);
        term4558 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term4559 = newInstance(Class.forName("java.lang.Object"));
        setField(term4558, term4558.getClass(), "value", term4559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[2];
        args[0] = "SXaXhlzAIB";
        args[1] = term4558;
        callMethod(klass, "set", argTypes, term4512, args);
    }

};


