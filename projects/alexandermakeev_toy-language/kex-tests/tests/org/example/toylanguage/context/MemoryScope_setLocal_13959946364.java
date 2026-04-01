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

public class MemoryScope_setLocal_13959946364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4570;
     Object term4616;

    public MemoryScope_setLocal_13959946364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4571 = new HashMap();
        HashMap term4582 = new HashMap();
        HashMap term4591 = new HashMap();
        HashMap term4598 = new HashMap();
        term4570 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4581 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4590 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4597 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4603 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4570, term4570.getClass(), "variables", term4571);
        setField(term4581, term4581.getClass(), "variables", term4582);
        setField(term4590, term4590.getClass(), "variables", term4591);
        setField(term4597, term4597.getClass(), "variables", term4598);
        setField(term4603, term4603.getClass(), "variables", null);
        setField(term4603, term4603.getClass(), "parent", null);
        setField(term4597, term4597.getClass(), "parent", term4603);
        setField(term4590, term4590.getClass(), "parent", term4597);
        setField(term4581, term4581.getClass(), "parent", term4590);
        setField(term4570, term4570.getClass(), "parent", term4581);
        term4616 = newInstance(Class.forName("org.example.toylanguage.context.ValueReference"));
        Object term4617 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        setField(term4617, term4617.getClass(), "value", null);
        setField(term4616, term4616.getClass(), "value", term4617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.example.toylanguage.context.ValueReference");
        Object[] args = new Object[2];
        args[0] = "DKWEhukBpG";
        args[1] = term4616;
        callMethod(klass, "setLocal", argTypes, term4570, args);
    }

};


