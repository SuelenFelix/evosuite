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

public class DefinitionScope_init_7402053970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DefinitionScope_init_7402053970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        Set<Object> term31 =  ((Map) term3).keySet();
        HashSet term2 = new HashSet((Collection<? extends Object>) term31);
        HashMap term18 = new HashMap();
        Set<Object> term32 =  ((Map) term18).keySet();
        HashSet term17 = new HashSet((Collection<? extends Object>) term32);
        term1 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term30 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1, term1.getClass(), "classes", term2);
        setField(term1, term1.getClass(), "functions", term17);
        setField(term30, term30.getClass(), "classes", null);
        setField(term30, term30.getClass(), "functions", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term1, term1.getClass(), "parent", term30);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


