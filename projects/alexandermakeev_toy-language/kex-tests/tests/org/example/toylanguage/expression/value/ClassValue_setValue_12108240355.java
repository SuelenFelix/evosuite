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

public class ClassValue_setValue_12108240355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486;
     Object term532;

    public ClassValue_setValue_12108240355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term488 = new HashMap();
        HashMap term497 = new HashMap();
        HashMap term504 = new HashMap();
        HashMap term510 = new HashMap();
        term486 = newInstance(Class.forName("org.example.toylanguage.expression.value.ClassValue"));
        Object term487 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term496 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term503 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term509 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term487, term487.getClass(), "variables", term488);
        setField(term496, term496.getClass(), "variables", term497);
        setField(term503, term503.getClass(), "variables", term504);
        setField(term509, term509.getClass(), "variables", null);
        setField(term509, term509.getClass(), "parent", null);
        setField(term503, term503.getClass(), "parent", term509);
        setField(term496, term496.getClass(), "parent", term503);
        setField(term487, term487.getClass(), "parent", term496);
        setField(term486, term486.getClass(), "memoryScope", term487);
        setField(term486, term486.getClass(), "relations", term510);
        setField(term486, term486.getClass(), "value", null);
        term532 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term533 = newInstance(Class.forName("java.lang.Object"));
        setField(term532, term532.getClass(), "value", term533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[2];
        args[0] = "FPvxVzzSvD";
        args[1] = term532;
        callMethod(klass, "setValue", argTypes, term486, args);
    }

};


