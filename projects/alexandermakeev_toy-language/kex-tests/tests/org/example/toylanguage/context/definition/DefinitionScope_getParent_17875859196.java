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

public class DefinitionScope_getParent_17875859196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436;

    public DefinitionScope_getParent_17875859196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term438 = new HashMap();
        Set<Object> term468 =  ((Map) term438).keySet();
        HashSet term437 = new HashSet((Collection<? extends Object>) term468);
        HashMap term453 = new HashMap();
        Set<Object> term469 =  ((Map) term453).keySet();
        HashSet term452 = new HashSet((Collection<? extends Object>) term469);
        term436 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term467 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term436, term436.getClass(), "classes", term437);
        setField(term436, term436.getClass(), "functions", term452);
        setField(term467, term467.getClass(), "classes", null);
        setField(term467, term467.getClass(), "functions", null);
        setField(term467, term467.getClass(), "parent", null);
        setField(term436, term436.getClass(), "parent", term467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParent", argTypes, term436, args);
    }

};


