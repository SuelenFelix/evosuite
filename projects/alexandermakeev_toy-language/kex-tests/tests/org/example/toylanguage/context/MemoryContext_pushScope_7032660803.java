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

public class MemoryContext_pushScope_7032660803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3672;

    public MemoryContext_pushScope_7032660803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3673 = new HashMap();
        HashMap term3684 = new HashMap();
        HashMap term3693 = new HashMap();
        HashMap term3700 = new HashMap();
        term3672 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term3683 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term3692 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term3699 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term3705 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term3672, term3672.getClass(), "variables", term3673);
        setField(term3683, term3683.getClass(), "variables", term3684);
        setField(term3692, term3692.getClass(), "variables", term3693);
        setField(term3699, term3699.getClass(), "variables", term3700);
        setField(term3705, term3705.getClass(), "variables", null);
        setField(term3705, term3705.getClass(), "parent", null);
        setField(term3699, term3699.getClass(), "parent", term3705);
        setField(term3692, term3692.getClass(), "parent", term3699);
        setField(term3683, term3683.getClass(), "parent", term3692);
        setField(term3672, term3672.getClass(), "parent", term3683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.context.MemoryScope");
        Object[] args = new Object[1];
        args[0] = term3672;
        callMethod(klass, "pushScope", argTypes, null, args);
    }

};


