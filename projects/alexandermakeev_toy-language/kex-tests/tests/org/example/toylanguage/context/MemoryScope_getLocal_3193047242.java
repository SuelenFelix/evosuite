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

public class MemoryScope_getLocal_3193047242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4456;

    public MemoryScope_getLocal_3193047242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4457 = new HashMap();
        HashMap term4468 = new HashMap();
        HashMap term4477 = new HashMap();
        HashMap term4484 = new HashMap();
        term4456 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4467 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4476 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4483 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4489 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4456, term4456.getClass(), "variables", term4457);
        setField(term4467, term4467.getClass(), "variables", term4468);
        setField(term4476, term4476.getClass(), "variables", term4477);
        setField(term4483, term4483.getClass(), "variables", term4484);
        setField(term4489, term4489.getClass(), "variables", null);
        setField(term4489, term4489.getClass(), "parent", null);
        setField(term4483, term4483.getClass(), "parent", term4489);
        setField(term4476, term4476.getClass(), "parent", term4483);
        setField(term4467, term4467.getClass(), "parent", term4476);
        setField(term4456, term4456.getClass(), "parent", term4467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CiPMRxGoHO";
        callMethod(klass, "getLocal", argTypes, term4456, args);
    }

};


