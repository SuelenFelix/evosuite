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

public class Annotation_setComment_166995404716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44697;

    public Annotation_setComment_166995404716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44697 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term44697, term44697.getClass(), "comment", null);
        setField(term44697, term44697.getClass(), "tag", null);
        setField(term44697, term44697.getClass(), "element", null);
        setField(term44697, term44697.getClass(), "annotation", null);
        setField(term44697, term44697.getClass(), "name", null);
        setField(term44697, term44697.getClass(), "qualified", null);
        setField(term44697, term44697.getClass(), "scope", null);
        setField(term44697, term44697.getClass(), "included", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setComment", argTypes, term44697, args);
    }

};


