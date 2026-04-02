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

public class Class_setComment_19662466423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15401;

    public Class_setComment_19662466423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15401 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Class"));
        setField(term15401, term15401.getClass(), "comment", null);
        setField(term15401, term15401.getClass(), "tag", null);
        setField(term15401, term15401.getClass(), "generic", null);
        setField(term15401, term15401.getClass(), "clazz", null);
        setField(term15401, term15401.getClass(), "_interface", null);
        setField(term15401, term15401.getClass(), "constructor", null);
        setField(term15401, term15401.getClass(), "method", null);
        setField(term15401, term15401.getClass(), "annotation", null);
        setField(term15401, term15401.getClass(), "field", null);
        setField(term15401, term15401.getClass(), "name", null);
        setField(term15401, term15401.getClass(), "qualified", null);
        setField(term15401, term15401.getClass(), "scope", null);
        setField(term15401, term15401.getClass(), "_abstract", null);
        setField(term15401, term15401.getClass(), "error", null);
        setField(term15401, term15401.getClass(), "exception", null);
        setField(term15401, term15401.getClass(), "externalizable", null);
        setField(term15401, term15401.getClass(), "included", null);
        setField(term15401, term15401.getClass(), "serializable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setComment", argTypes, term15401, args);
    }

};


