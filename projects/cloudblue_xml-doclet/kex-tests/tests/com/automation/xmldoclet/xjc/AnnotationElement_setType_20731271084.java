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

public class AnnotationElement_setType_20731271084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6366;

    public AnnotationElement_setType_20731271084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6366 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term6366, term6366.getClass(), "type", null);
        setField(term6366, term6366.getClass(), "name", null);
        setField(term6366, term6366.getClass(), "qualified", null);
        setField(term6366, term6366.getClass(), "_default", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term6366, args);
    }

};


