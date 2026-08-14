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

public class MemoryScope_setLocal_14390550225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4628;
     Object term4674;

    public MemoryScope_setLocal_14390550225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4629 = new HashMap();
        HashMap term4640 = new HashMap();
        HashMap term4649 = new HashMap();
        HashMap term4656 = new HashMap();
        term4628 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4639 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4648 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4655 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term4661 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term4628, term4628.getClass(), "variables", term4629);
        setField(term4639, term4639.getClass(), "variables", term4640);
        setField(term4648, term4648.getClass(), "variables", term4649);
        setField(term4655, term4655.getClass(), "variables", term4656);
        setField(term4661, term4661.getClass(), "variables", null);
        setField(term4661, term4661.getClass(), "parent", null);
        setField(term4655, term4655.getClass(), "parent", term4661);
        setField(term4648, term4648.getClass(), "parent", term4655);
        setField(term4639, term4639.getClass(), "parent", term4648);
        setField(term4628, term4628.getClass(), "parent", term4639);
        term4674 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        Object term4675 = newInstance(Class.forName("java.lang.Object"));
        setField(term4674, term4674.getClass(), "value", term4675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.MemoryScope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.example.toylanguage.expression.value.Value");
        Object[] args = new Object[2];
        args[0] = "jPPOVoAOLQ";
        args[1] = term4674;
        callMethod(klass, "setLocal", argTypes, term4628, args);
    }

};


