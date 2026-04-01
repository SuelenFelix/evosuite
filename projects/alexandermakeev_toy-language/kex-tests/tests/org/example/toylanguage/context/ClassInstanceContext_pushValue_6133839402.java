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
import java.util.HashMap;

public class ClassInstanceContext_pushValue_6133839402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4773;

    public ClassInstanceContext_pushValue_6133839402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4775 = new HashMap();
        HashMap term4784 = new HashMap();
        HashMap term4791 = new HashMap();
        HashMap term4797 = new HashMap();
        term4773 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term4774 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4783 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4790 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4796 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4774, term4774.getClass(), "variables", term4775);
        setField(term4783, term4783.getClass(), "variables", term4784);
        setField(term4790, term4790.getClass(), "variables", term4791);
        setField(term4796, term4796.getClass(), "variables", null);
        setField(term4796, term4796.getClass(), "parent", null);
        setField(term4790, term4790.getClass(), "parent", term4796);
        setField(term4783, term4783.getClass(), "parent", term4790);
        setField(term4774, term4774.getClass(), "parent", term4783);
        setField(term4773, term4773.getClass(), "memoryScope", term4774);
        setField(term4773, term4773.getClass(), "relations", term4797);
        setField(term4773, term4773.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.ClassInstanceContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Object[] args = new Object[1];
        args[0] = term4773;
        callMethod(klass, "pushValue", argTypes, null, args);
    }

};


