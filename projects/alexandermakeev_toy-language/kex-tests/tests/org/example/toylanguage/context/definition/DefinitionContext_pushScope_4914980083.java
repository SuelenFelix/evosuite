package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class DefinitionContext_pushScope_4914980083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3191;

    public DefinitionContext_pushScope_4914980083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3193 = new HashMap();
        Set<Object> term3214 =  ((Map) term3193).keySet();
        HashSet term3192 = new HashSet((Collection<? extends Object>) term3214);
        HashMap term3200 = new HashMap();
        Set<Object> term3215 =  ((Map) term3200).keySet();
        HashSet term3199 = new HashSet((Collection<? extends Object>) term3215);
        HashMap term3207 = new HashMap();
        Set<Object> term3216 =  ((Map) term3207).keySet();
        HashSet term3206 = new HashSet((Collection<? extends Object>) term3216);
        term3191 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term3198 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term3213 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term3191, term3191.getClass(), "classes", term3192);
        setField(term3191, term3191.getClass(), "functions", null);
        setField(term3198, term3198.getClass(), "classes", term3199);
        setField(term3198, term3198.getClass(), "functions", term3206);
        setField(term3213, term3213.getClass(), "classes", null);
        setField(term3213, term3213.getClass(), "functions", null);
        setField(term3213, term3213.getClass(), "parent", null);
        setField(term3198, term3198.getClass(), "parent", term3213);
        setField(term3191, term3191.getClass(), "parent", term3198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Object[] args = new Object[1];
        args[0] = term3191;
        callMethod(klass, "pushScope", argTypes, null, args);
    }

};


