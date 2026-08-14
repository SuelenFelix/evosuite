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

public class ClassValue_containsRelation_5077493262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340;

    public ClassValue_containsRelation_5077493262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term342 = new HashMap();
        HashMap term351 = new HashMap();
        HashMap term358 = new HashMap();
        HashMap term364 = new HashMap();
        term340 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term341 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term350 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term357 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term363 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term341, term341.getClass(), "variables", term342);
        setField(term350, term350.getClass(), "variables", term351);
        setField(term357, term357.getClass(), "variables", term358);
        setField(term363, term363.getClass(), "variables", null);
        setField(term363, term363.getClass(), "parent", null);
        setField(term357, term357.getClass(), "parent", term363);
        setField(term350, term350.getClass(), "parent", term357);
        setField(term341, term341.getClass(), "parent", term350);
        setField(term340, term340.getClass(), "memoryScope", term341);
        setField(term340, term340.getClass(), "relations", term364);
        setField(term340, term340.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "containsRelation", argTypes, term340, args);
    }

};


