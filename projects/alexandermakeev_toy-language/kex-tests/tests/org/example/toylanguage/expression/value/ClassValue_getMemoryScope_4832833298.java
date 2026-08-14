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

public class ClassValue_getMemoryScope_4832833298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613;

    public ClassValue_getMemoryScope_4832833298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term615 = new HashMap();
        HashMap term624 = new HashMap();
        HashMap term631 = new HashMap();
        HashMap term637 = new HashMap();
        term613 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term614 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term623 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term630 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term636 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term614, term614.getClass(), "variables", term615);
        setField(term623, term623.getClass(), "variables", term624);
        setField(term630, term630.getClass(), "variables", term631);
        setField(term636, term636.getClass(), "variables", null);
        setField(term636, term636.getClass(), "parent", null);
        setField(term630, term630.getClass(), "parent", term636);
        setField(term623, term623.getClass(), "parent", term630);
        setField(term614, term614.getClass(), "parent", term623);
        setField(term613, term613.getClass(), "memoryScope", term614);
        setField(term613, term613.getClass(), "relations", term637);
        setField(term613, term613.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemoryScope", argTypes, term613, args);
    }

};


