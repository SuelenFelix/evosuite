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

public class ClassDefinition_getClassDetails_16963884769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031;

    public ClassDefinition_getClassDetails_16963884769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2031 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        setField(term2031, term2031.getClass(), "classDetails", null);
        setField(term2031, term2031.getClass(), "baseTypes", null);
        setField(term2031, term2031.getClass(), "statement", null);
        setField(term2031, term2031.getClass(), "definitionScope", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassDetails", argTypes, term2031, args);
    }

};


