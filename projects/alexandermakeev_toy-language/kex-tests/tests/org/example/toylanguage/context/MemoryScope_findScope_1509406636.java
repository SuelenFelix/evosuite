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

public class MemoryScope_findScope_1509406636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4686;

    public MemoryScope_findScope_1509406636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4687 = new HashMap();
        HashMap term4698 = new HashMap();
        HashMap term4707 = new HashMap();
        HashMap term4714 = new HashMap();
        term4686 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4697 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4706 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4713 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4719 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4686, term4686.getClass(), "variables", term4687);
        setField(term4697, term4697.getClass(), "variables", term4698);
        setField(term4706, term4706.getClass(), "variables", term4707);
        setField(term4713, term4713.getClass(), "variables", term4714);
        setField(term4719, term4719.getClass(), "variables", null);
        setField(term4719, term4719.getClass(), "parent", null);
        setField(term4713, term4713.getClass(), "parent", term4719);
        setField(term4706, term4706.getClass(), "parent", term4713);
        setField(term4697, term4697.getClass(), "parent", term4706);
        setField(term4686, term4686.getClass(), "parent", term4697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MQJTCGewxT";
        callMethod(klass, "findScope", argTypes, term4686, args);
    }

};


