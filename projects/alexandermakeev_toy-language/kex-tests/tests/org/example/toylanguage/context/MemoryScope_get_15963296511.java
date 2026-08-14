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

public class MemoryScope_get_15963296511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4400;

    public MemoryScope_get_15963296511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4401 = new HashMap();
        HashMap term4412 = new HashMap();
        HashMap term4421 = new HashMap();
        HashMap term4428 = new HashMap();
        term4400 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4411 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4420 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4427 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4433 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4400, term4400.getClass(), "variables", term4401);
        setField(term4411, term4411.getClass(), "variables", term4412);
        setField(term4420, term4420.getClass(), "variables", term4421);
        setField(term4427, term4427.getClass(), "variables", term4428);
        setField(term4433, term4433.getClass(), "variables", null);
        setField(term4433, term4433.getClass(), "parent", null);
        setField(term4427, term4427.getClass(), "parent", term4433);
        setField(term4420, term4420.getClass(), "parent", term4427);
        setField(term4411, term4411.getClass(), "parent", term4420);
        setField(term4400, term4400.getClass(), "parent", term4411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SsMHzYNeji";
        callMethod(klass, "get", argTypes, term4400, args);
    }

};


