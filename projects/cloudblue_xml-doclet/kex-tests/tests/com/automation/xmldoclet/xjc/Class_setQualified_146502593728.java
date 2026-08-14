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

public class Class_setQualified_146502593728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23331;

    public Class_setQualified_146502593728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23331 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term23331, term23331.getClass(), "comment", null);
        setField(term23331, term23331.getClass(), "tag", null);
        setField(term23331, term23331.getClass(), "generic", null);
        setField(term23331, term23331.getClass(), "clazz", null);
        setField(term23331, term23331.getClass(), "_interface", null);
        setField(term23331, term23331.getClass(), "constructor", null);
        setField(term23331, term23331.getClass(), "method", null);
        setField(term23331, term23331.getClass(), "annotation", null);
        setField(term23331, term23331.getClass(), "field", null);
        setField(term23331, term23331.getClass(), "name", null);
        setField(term23331, term23331.getClass(), "qualified", null);
        setField(term23331, term23331.getClass(), "scope", null);
        setField(term23331, term23331.getClass(), "_abstract", null);
        setField(term23331, term23331.getClass(), "error", null);
        setField(term23331, term23331.getClass(), "exception", null);
        setField(term23331, term23331.getClass(), "externalizable", null);
        setField(term23331, term23331.getClass(), "included", null);
        setField(term23331, term23331.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQualified", argTypes, term23331, args);
    }

};


