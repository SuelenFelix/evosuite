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

public class DefinitionScope_getClass_353468081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public DefinitionScope_getClass_353468081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term35 = new HashMap();
        Set<Object> term70 =  ((Map) term35).keySet();
        HashSet term34 = new HashSet((Collection<? extends Object>) term70);
        HashMap term46 = new HashMap();
        Set<Object> term71 =  ((Map) term46).keySet();
        HashSet term45 = new HashSet((Collection<? extends Object>) term71);
        term33 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term33, term33.getClass(), "classes", term34);
        setField(term33, term33.getClass(), "functions", term45);
        setField(term33, term33.getClass(), "parent", term33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ypEdrstygY";
        callMethod(klass, "getClass", argTypes, term33, args);
    }

};


