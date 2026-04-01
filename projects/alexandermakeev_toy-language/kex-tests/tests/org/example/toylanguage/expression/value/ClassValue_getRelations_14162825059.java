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

public class ClassValue_getRelations_14162825059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;

    public ClassValue_getRelations_14162825059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term649 = new HashMap();
        HashMap term658 = new HashMap();
        HashMap term665 = new HashMap();
        HashMap term671 = new HashMap();
        term647 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term648 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term657 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term664 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term670 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term648, term648.getClass(), "variables", term649);
        setField(term657, term657.getClass(), "variables", term658);
        setField(term664, term664.getClass(), "variables", term665);
        setField(term670, term670.getClass(), "variables", null);
        setField(term670, term670.getClass(), "parent", null);
        setField(term664, term664.getClass(), "parent", term670);
        setField(term657, term657.getClass(), "parent", term664);
        setField(term648, term648.getClass(), "parent", term657);
        setField(term647, term647.getClass(), "memoryScope", term648);
        setField(term647, term647.getClass(), "relations", term671);
        setField(term647, term647.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelations", argTypes, term647, args);
    }

};


