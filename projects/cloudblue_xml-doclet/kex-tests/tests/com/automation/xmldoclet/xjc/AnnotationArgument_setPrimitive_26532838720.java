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

public class AnnotationArgument_setPrimitive_26532838720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56723;

    public AnnotationArgument_setPrimitive_26532838720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56723 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        setField(term56723, term56723.getClass(), "type", null);
        setField(term56723, term56723.getClass(), "value", null);
        setField(term56723, term56723.getClass(), "annotation", null);
        setField(term56723, term56723.getClass(), "name", null);
        setField(term56723, term56723.getClass(), "primitive", null);
        setField(term56723, term56723.getClass(), "array", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPrimitive", argTypes, term56723, args);
    }

};


