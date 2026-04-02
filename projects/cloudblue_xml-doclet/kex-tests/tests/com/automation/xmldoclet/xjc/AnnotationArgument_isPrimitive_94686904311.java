package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AnnotationArgument_isPrimitive_94686904311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53820;

    public AnnotationArgument_isPrimitive_94686904311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53820 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        setField(term53820, term53820.getClass(), "type", null);
        setField(term53820, term53820.getClass(), "value", null);
        setField(term53820, term53820.getClass(), "annotation", null);
        setField(term53820, term53820.getClass(), "name", null);
        setField(term53820, term53820.getClass(), "primitive", null);
        setField(term53820, term53820.getClass(), "array", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrimitive", argTypes, term53820, args);
    }

};


