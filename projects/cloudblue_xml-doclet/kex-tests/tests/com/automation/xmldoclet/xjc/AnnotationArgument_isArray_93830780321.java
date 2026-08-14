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

public class AnnotationArgument_isArray_93830780321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56724;

    public AnnotationArgument_isArray_93830780321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56724 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        setField(term56724, term56724.getClass(), "type", null);
        setField(term56724, term56724.getClass(), "value", null);
        setField(term56724, term56724.getClass(), "annotation", null);
        setField(term56724, term56724.getClass(), "name", null);
        setField(term56724, term56724.getClass(), "primitive", null);
        setField(term56724, term56724.getClass(), "array", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArray", argTypes, term56724, args);
    }

};


