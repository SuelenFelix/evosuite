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

public class MemoryScope_init_8288579710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4366;

    public MemoryScope_init_8288579710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4367 = new HashMap();
        HashMap term4378 = new HashMap();
        HashMap term4387 = new HashMap();
        HashMap term4394 = new HashMap();
        term4366 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4377 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4386 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4393 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4399 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4366, term4366.getClass(), "variables", term4367);
        setField(term4377, term4377.getClass(), "variables", term4378);
        setField(term4386, term4386.getClass(), "variables", term4387);
        setField(term4393, term4393.getClass(), "variables", term4394);
        setField(term4399, term4399.getClass(), "variables", null);
        setField(term4399, term4399.getClass(), "parent", null);
        setField(term4393, term4393.getClass(), "parent", term4399);
        setField(term4386, term4386.getClass(), "parent", term4393);
        setField(term4377, term4377.getClass(), "parent", term4386);
        setField(term4366, term4366.getClass(), "parent", term4377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.context.MemoryScope");
        Object[] args = new Object[1];
        args[0] = term4366;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


