package com.usantatecla.ustumlserver.domain.model.relations;

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
import static com.usantatecla.ustumlserver.domain.model.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Inheritance_equals_4862537405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3214;
     Object term3251;

    public Inheritance_equals_4862537405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3214 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Inheritance"));
        setField(term3214, term3214.getClass(), "id", "mvrkADEgpp");
        setField(term3214, term3214.getClass(), "target", null);
        setField(term3214, term3214.getClass(), "role", "pXOkjyeIRb");
        setField(term3214, term3214.getClass(), "targetRoute", "GgZWSjxjyE");
        term3251 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Inheritance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3251;
        callMethod(klass, "equals", argTypes, term3214, args);
    }

};


