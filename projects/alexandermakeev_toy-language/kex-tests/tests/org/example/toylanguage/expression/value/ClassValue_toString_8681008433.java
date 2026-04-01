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

public class ClassValue_toString_8681008433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396;

    public ClassValue_toString_8681008433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term398 = new HashMap();
        HashMap term407 = new HashMap();
        HashMap term414 = new HashMap();
        HashMap term420 = new HashMap();
        term396 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term397 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term406 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term413 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term419 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term397, term397.getClass(), "variables", term398);
        setField(term406, term406.getClass(), "variables", term407);
        setField(term413, term413.getClass(), "variables", term414);
        setField(term419, term419.getClass(), "variables", null);
        setField(term419, term419.getClass(), "parent", null);
        setField(term413, term413.getClass(), "parent", term419);
        setField(term406, term406.getClass(), "parent", term413);
        setField(term397, term397.getClass(), "parent", term406);
        setField(term396, term396.getClass(), "memoryScope", term397);
        setField(term396, term396.getClass(), "relations", term420);
        setField(term396, term396.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term396, args);
    }

};


